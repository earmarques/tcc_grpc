package client;
import java.util.ArrayList;
import java.util.List;

import io.grpc.Channel;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.StatusRuntimeException;
import java_grpc.Sorteio;
import java_grpc.SorteioServiceGrpc;
import model.AgendaContatos;

public class ClientJS {
	public static int getNumeroSorteado(int min, int max) {
		try {
			ManagedChannel channel = ManagedChannelBuilder
					.forAddress("localhost", 50053)
					.usePlaintext()
					.build();
			SorteioServiceGrpc.SorteioServiceBlockingStub sorteioStub = SorteioServiceGrpc
					.newBlockingStub((Channel)channel);
			Sorteio.IntervaloRequest request = Sorteio.IntervaloRequest.newBuilder()
					.setMin(5)
					.setMax(15)
					.build();
			Sorteio.SorteadoResponse response = sorteioStub.sortearNumero(request);
			int sorteado = response.getNumero();
			return sorteado;
		} catch (StatusRuntimeException e) {
			String msg = "\n\n\tServidor indisponível.\n\n";
			System.out.println(msg);				
			e.printStackTrace();
			throw new RuntimeException(msg, e);
		}
	}

	public static void main(String[] args) {
		AgendaContatos contatos = new AgendaContatos();
		List<String> selecionados = new ArrayList<>();
		for (int i = 0; i < 10; i++) {
			int sorteado = getNumeroSorteado(0, 50);
			System.out.println("Numero sorteado: " + sorteado);
			selecionados.add(contatos.getPessoa(sorteado));
		} 
		System.out.println("Alunos Selecionados: ");
		System.out.println(selecionados);
	}

}
