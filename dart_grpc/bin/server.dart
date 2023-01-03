import 'package:grpc/grpc.dart';
import '../protos/aluno.pbgrpc.dart';
import '../protos/google/protobuf/empty.pb.dart';


class CrudAlunoService extends CrudAlunoServiceBase {
  Alunos lista = Alunos();

  @override
  Future<Aluno> createAluno(ServiceCall call, Aluno request) async {
    var aluno = Aluno();
    aluno.nome = request.nome;
    aluno.id = request.id;
    lista.alunos.add(aluno);
    return aluno;
  }

  @override
  Future<Alunos> getAllAlunos(ServiceCall call, Empty request) async {
    return lista;
  }

  @override
  Future<Aluno> getAluno(ServiceCall call, AlunoId request) async {
    var aluno = lista.alunos.firstWhere((aluno) => aluno.id == request.id);
    return aluno;
  }

  @override
  Future<Empty> deleteAluno(ServiceCall call, AlunoId request) async {
    lista.alunos.removeWhere((aluno) => aluno.id == request.id);
    return Empty();
  }

  @override
  Future<Aluno> editAluno(ServiceCall call, Aluno request) async {
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
  print('Servidor ouvindo na porta ${server.port}...');
}