import 'package:grpc/grpc.dart';
import '../protos/aluno.pbgrpc.dart';
import '../protos/gerador_id.pbgrpc.dart';
import '../protos/google/protobuf/empty.pb.dart' show Empty;


class CrudAlunoService extends CrudAlunoServiceBase {
  Alunos lista = Alunos();
  late ClientChannel channel;
  late GeradorIDClient stub;

  @override
  Future<Aluno> createAluno(ServiceCall call, Aluno request) async {
    print('\n🐦 API Dart - createAluno  ________________________________');
    late int id;
    if (request.id == 0) {  // buscar id
      // Obtendo id do servidor Go
      late var message;
      channel = ClientChannel('localhost',
          port: 50051,
          options: // Aqui não teremos credenciais
              const ChannelOptions(credentials: ChannelCredentials.insecure()));
      stub = GeradorIDClient(channel,
          options: CallOptions(timeout: Duration(seconds: 30)));
      try {
        message = await stub.gerarId(Empty());
      }
      catch (e) {
        print('\n\nErro ao obter ID do servidor Go. Talvez o servidor esteja offline\n');
        print(e);
      }
      await channel.shutdown();
      id = message.goId;
    }
    else {  // usar o fornecido no request
      id = request.id;
    }
    var aluno = Aluno();
    aluno.nome = request.nome;
    aluno.id = id;
    lista.alunos.add(aluno);
    print('Método createAluno - novo aluno inserido:');
    print(aluno.toString());

    return aluno;
  }

  @override
  Future<Alunos> getAllAlunos(ServiceCall call, Empty request) async {
    //==================================================================
    print('\n🐦 API Dart - getAllAlunos  _______________________________');
    if (lista.alunos.isEmpty) {
      print('Lista vazia.');
    }
    for (var aluno in lista.alunos) {
      print('${aluno.id} - ${aluno.nome}');
    }
    print(' ');
    return lista;
  }
  @override
  Future<Aluno> getAluno(ServiceCall call, AlunoId request) async {
    print('\n🐦 API Dart - getAluno  ___________________________________');
    print('Resgantando o aluno de id:${request.id}' );
    var aluno = lista.alunos.firstWhere((aluno) => aluno.id == request.id);
    return aluno;
  }
  @override
  Future<Empty> deleteAluno(ServiceCall call, AlunoId request) async {
    print('\n🐦 API Dart - deleteAluno  ________________________________');
    print('Apagando o aluno de id:${request.id}' );
    lista.alunos.removeWhere((aluno) => aluno.id == request.id);
    return Empty();
  }
  @override
  Future<Aluno> editAluno(ServiceCall call, Aluno request) async {
    print('\n🐦 API Dart - editAluno  __________________________________');
    print('Editando o aluno de id:${request.id}' );
    var aluno = lista.alunos.firstWhere((aluno) => aluno.id == request.id);
    aluno.nome = request.nome;
    return aluno;
  }
}

Future<void> main(List<String> args) async {
  final server = Server(
    [CrudAlunoService()],
    const <Interceptor>[],
    CodecRegistry(codecs: const [GzipCodec(), IdentityCodec()]),
  );
  await server.serve(port: 50052);
  print('\n🐦 Servidor ouvindo na porta ${server.port}...\n');
}

