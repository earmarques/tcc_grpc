import 'package:grpc/grpc.dart';
import './../protos/gerador_id.pbgrpc.dart';
import '../protos/google/protobuf/empty.pb.dart';

class Client {
  late ClientChannel channel;
  late GeradorIDClient stub;

  Future<void> main(List<String> args) async {
    channel = ClientChannel('localhost',
        port: 50051,
        options: // Aqui não teremos credenciais
            const ChannelOptions(credentials: ChannelCredentials.insecure()));
    stub = GeradorIDClient(channel,
        options: CallOptions(timeout: Duration(seconds: 30)));
    try {
      //...
      var id = await stub.gerarId(Empty());
      print('goId:${id.goId}');
      
    } catch (e) {
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
