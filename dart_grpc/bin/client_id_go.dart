import 'package:grpc/grpc.dart';
import './../protos/aluno.pbgrpc.dart';
import '../protos/google/protobuf/empty.pb.dart';

class Client {
  late ClientChannel channel;
  late CrudAlunoServiceClient stub;

  Future<void> main(List<String> args) async {
    channel = ClientChannel('localhost',
        port: 50052,
        options: // Aqui não teremos credenciais
            const ChannelOptions(credentials: ChannelCredentials.insecure()));
    stub = CrudAlunoServiceClient(channel,
        options: CallOptions(timeout: Duration(seconds: 30)));
    try {
      //...
      print('\n__ Adicionando Alunos  ---------------------------------');
      var alunoToAdd1 = Aluno();
      alunoToAdd1.nome = "Elias Mantovani Rebouças";
      var alunoAdicionado1 = await stub.createAluno(alunoToAdd1);
      print("Aluno Adicionado:\n" + alunoAdicionado1.toString());

      var alunoToAdd2 = Aluno();
      alunoToAdd2.nome = "Pedro Henrique Coimbra";
      var alunoAdicionado2 = await stub.createAluno(alunoToAdd2);
      print("Aluno Adicionado:\n" + alunoAdicionado2.toString());

      print('\n__ Listagem de Alunos  ---------------------------------');
      var todosAlunos = await stub.getAllAlunos(Empty());
      print(todosAlunos.alunos.toString());


      print('\n__ Removendo Aluno  ------------------------------------');
      var alunoToDel = AlunoId();
      alunoToDel.id = alunoAdicionado2.id;
      await stub.deleteAluno(alunoToDel);
      print("Aluno removido com ID: " + alunoToDel.id.toString());

      print('\n__ Listagem de Alunos  ---------------------------------');
      var todosAlunos2 = await stub.getAllAlunos(Empty());
      print(todosAlunos2.alunos);

      print('\n__ Edição de Aluno  ------------------------------------');
      var alunoToEdit = Aluno();
      alunoToEdit.id = alunoAdicionado1.id;
      alunoToEdit.nome = "David Bitcoin";
      await stub.editAluno(alunoToEdit);
      print("Aluno editado com ID: " + alunoToEdit.id.toString());


      print('\n__ Busca do Aluno Editado  -----------------------------');
      var alunoToGet = AlunoId();
      alunoToGet.id = alunoAdicionado1.id;
      var alunoObtido = await stub.getAluno(alunoToGet);
      print("Aluno de id = 1 com nome editado:\n" + alunoObtido.toString());

    }
    catch (e) {
      print('\n\nErro: O Servidor está offline\n');
      print(e);
    }
    await channel.shutdown();
  }
}

main() {
  var client = Client();
  client.main([]);
}
