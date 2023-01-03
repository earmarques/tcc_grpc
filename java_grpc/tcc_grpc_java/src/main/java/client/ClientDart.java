package client;

import com.google.protobuf.Empty;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import java_grpc.AlunoOuterClass.Aluno;
import java_grpc.AlunoOuterClass.AlunoId;
import java_grpc.AlunoOuterClass.Alunos;
import java_grpc.CrudAlunoServiceGrpc;
import java_grpc.CrudAlunoServiceGrpc.CrudAlunoServiceBlockingStub;

public class ClientDart {

	// CRUD Dart  -------------------------------------------------------------------------------------------
	
	// getAllAlunos
	public Alunos getAllAlunos() {
		// Canal
		ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 50052).usePlaintext().build();	
		// Stub		
		CrudAlunoServiceBlockingStub alunoStub = CrudAlunoServiceGrpc.newBlockingStub(channel);
		
		Empty empty  = Empty.newBuilder().build();
		Alunos alunos = alunoStub.getAllAlunos(empty);
		
		return alunos;
	}

	// createAluno
	public Aluno createAluno(Aluno a) {
		
		ManagedChannel channel = ManagedChannelBuilder
				.forAddress("localhost", 50052)
				.usePlaintext()
				.build();	
		CrudAlunoServiceBlockingStub alunoStub = CrudAlunoServiceGrpc.newBlockingStub(channel);

		Aluno aluno = alunoStub.createAluno(a);
		
		return aluno;
	}

		
	// Testes
	public static void main(String[] args) {
				
		ClientDart client = new ClientDart();
		
		try {
			// createAluno  -------------------------------------------------------------------------------------			

			System.out.println("__ Adicionando Alunos  ----------------------------------");
			Aluno alunoToAdd1 = Aluno.newBuilder().setId(1).setNome("Elias Mantovani Reboucas").build();
			Aluno alunoAdicionado1 = client.createAluno(alunoToAdd1);
			System.out.println("Aluno Adicionado:\n" + alunoAdicionado1);
			
			Aluno alunoToAdd2 = Aluno.newBuilder().setId(2).setNome("David Bitcoin").build();
			Aluno alunoAdicionado2 = client.createAluno(alunoToAdd2);
			System.out.println("Aluno Adicionado:\n" + alunoAdicionado2);
			
			Aluno alunoToAdd3 = Aluno.newBuilder().setId(3).setNome("Pedro Henrique Coimbra").build();
			Aluno alunoAdicionado3 = client.createAluno(alunoToAdd3);
			System.out.println("Aluno Adicionado:\n" + alunoAdicionado3);
			
			
			// getAllAlunos -------------------------------------------------------------------------------------
			
			System.out.println("__ Listagem de Alunos  ----------------------------------");
			Alunos alunos = client.getAllAlunos();
			System.out.println(alunos);	
		} 
		catch (Exception e) {
			System.out.println("\n\nErro: Servidor Dart está offline.\n");
			System.out.println(e);
		}
		
	}

}
