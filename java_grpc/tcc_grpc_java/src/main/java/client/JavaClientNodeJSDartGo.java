package client;

import com.google.protobuf.Empty;

import io.grpc.Channel;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import java_grpc.CrudAlunoServiceGrpc;
import java_grpc.Sorteio;
import java_grpc.SorteioServiceGrpc;
import java_grpc.AlunoOuterClass.Aluno;
import java_grpc.AlunoOuterClass.AlunoId;
import java_grpc.AlunoOuterClass.Alunos;
import java_grpc.CrudAlunoServiceGrpc.CrudAlunoServiceBlockingStub;
import model.AgendaContatos;
import model.Intervalo;

public class JavaClientNodeJSDartGo {
	
	AgendaContatos contatos = new AgendaContatos();
	
	
	// Sorteio NodeJS  --------------------------------------------------------------------------------------
	
	private String sortearNomePessoa(Intervalo intervalo) {
		int numeroSorteado = getNumeroSorteado(intervalo.min, intervalo.max);
		String nomePessoa = contatos.getPessoa(numeroSorteado); 
		return nomePessoa;
	}
	
	// sortearNumero
	private int getNumeroSorteado(int min, int max) {
		// Canal
		ManagedChannel channel = ManagedChannelBuilder
				.forAddress("localhost", 50053)
				.usePlaintext()
				.build();
		// Stub: ligação ao servidor de API
		SorteioServiceGrpc.SorteioServiceBlockingStub sorteioStub = SorteioServiceGrpc
				.newBlockingStub((Channel)channel);
		// Montar a requisição
		Sorteio.IntervaloRequest request = Sorteio.IntervaloRequest.newBuilder()
				.setMin(5)
				.setMax(15)
				.build();
		// Fazer a requisição
		Sorteio.SorteadoResponse response = sorteioStub.sortearNumero(request);
		int sorteado = response.getNumero();
		
		return sorteado;
		
	}


	// CRUD Dart  -------------------------------------------------------------------------------------------
	
	// createAluno
	public Aluno createAluno(Aluno a) {
		// Canal
		ManagedChannel channel = ManagedChannelBuilder
				.forAddress("localhost", 50052)
				.usePlaintext()
				.build();	
		// Stub
		CrudAlunoServiceBlockingStub alunoStub = CrudAlunoServiceGrpc.newBlockingStub(channel);

		Aluno aluno = alunoStub.createAluno(a);
		
		return aluno;
	}

	// getAllAlunos
	public Alunos getAllAlunos() {
		ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 50052).usePlaintext().build();	
		CrudAlunoServiceBlockingStub alunoStub = CrudAlunoServiceGrpc.newBlockingStub(channel);
				
		Empty empty  = Empty.newBuilder().build();
		Alunos alunos = alunoStub.getAllAlunos(empty);
		
		return alunos;
	}
	
	// getAluno
	public Aluno getAluno(AlunoId alunoId) {
		ManagedChannel channel = ManagedChannelBuilder
				.forAddress("localhost", 50052)
				.usePlaintext()
				.build();	
		CrudAlunoServiceBlockingStub alunoStub = CrudAlunoServiceGrpc.newBlockingStub(channel);
		
		Aluno aluno = alunoStub.getAluno(alunoId);
		
		return aluno;
	}
	
	// editAluno
	public Aluno editAluno(Aluno aluno) {
		ManagedChannel channel = ManagedChannelBuilder
				.forAddress("localhost", 50052)
				.usePlaintext()
				.build();	
		CrudAlunoServiceBlockingStub alunoStub = CrudAlunoServiceGrpc.newBlockingStub(channel);
					
		aluno = alunoStub.editAluno(aluno);
		
		return aluno;
	}
	
	// deleteAluno
	public void deleteAluno(AlunoId alunoId) {
		// Canal
		ManagedChannel channel = ManagedChannelBuilder
				.forAddress("localhost", 50052)
				.usePlaintext()
				.build();	
		// Stub
		CrudAlunoServiceBlockingStub alunoStub = CrudAlunoServiceGrpc.newBlockingStub(channel);
		
		alunoStub.deleteAluno(alunoId);		
	}
	

	// Testes  ----------------------------------------------------------------------------------------------
	
	// Create
	public void testCreate() {
		System.out.println("\n☕ API Java - createAluno  _________________________________");
		
		String nome = sortearNomePessoa(new Intervalo(0, 50));			// gRPC - API NodeJS
		
		// aluno sem id - quem irá fornecer será a API Golang
		Aluno alunoToCreate = Aluno.newBuilder().setNome(nome).build();
		//teste
		Aluno alunoCriado =  createAluno(alunoToCreate);			// gRPC - API Dart
		System.out.println("Novo aluno criado:");
		System.out.println(alunoCriado);
	}

	// GetAll
	public void testGetAll() {
		System.out.println("\n☕ API Java - getAllAlunos  ________________________________");
		//teste
		Alunos alunos = getAllAlunos();						// gRPC - API Dart
		System.out.println("ID - NOME");
		System.out.println("==================================================");
		for (Aluno aluno : alunos.getAlunosList()) {
			System.out.println(aluno.getId() + " - " + aluno.getNome());
		}
		System.out.println("--------------------------------------------------");
		System.out.println("Quantidade de alunos matriculados: " + alunos.getAlunosCount());
	}
	
	
	// Edit
	public void testEdit() {
		// Altera o nome do aluno do último aluno 
		System.out.println("\n☕ API Java - editAluno  ___________________________________"); 
		Alunos alunos = getAllAlunos();						// gRPC - API Dart
		int indexUltimo = alunos.getAlunosCount() - 1;
		Aluno ultimoAluno = alunos.getAlunos(indexUltimo);				
		Aluno alunoToEdit = Aluno.newBuilder()
				.setId(ultimoAluno.getId())
				.setNome("Matheus Rufato Santana de Oliveira")
				.build();
		//teste		
		Aluno alunoEditado = editAluno(alunoToEdit);				// gRPC - API Dart
		String msg = String.format("Aluno de id=%d com nome editado:\n", alunoEditado.getId());
		System.out.println( msg + alunoEditado);
	}
	
	// Get
	public void testGet() {
		// Resgata o aluno que fora editado, o último 
		System.out.println("\n☕ API Java - getAluno  ____________________________________"); 
		Alunos alunos = getAllAlunos();						// gRPC - API Dart
		int indexUltimo = alunos.getAlunosCount() - 1;
		Aluno ultimoAluno = alunos.getAlunos(indexUltimo);				
		AlunoId alunoId = AlunoId.newBuilder()
				.setId(ultimoAluno.getId())
				.build();
		//teste
		Aluno aluno = getAluno(alunoId);					// gRPC - API Dart
		String msg = String.format("Aluno de id=%d resgatado:\n", aluno.getId());
		System.out.println( msg + aluno);
	}
	
	// Delete
	public void testDelete() {
		// Altera o nome do aluno do último aluno 
		System.out.println("\n☕ API Java - deleteAluno  _________________________________"); 
		Alunos alunos = getAllAlunos();						// gRPC - API Dart
		int indexUltimo = alunos.getAlunosCount() - 1;
		Aluno ultimoAluno = alunos.getAlunos(indexUltimo);				
		AlunoId alunoId = AlunoId.newBuilder()
				.setId(ultimoAluno.getId())
				.build();
		// teste
		deleteAluno(alunoId);							// gRPC - API Dart				
		System.out.println( String.format("Aluno removido com id=%d \n", alunoId.getId()) );
	}

		
	public static void main(String[] args) {
				
		JavaClientNodeJSDartGo client = new JavaClientNodeJSDartGo();
		
		try {
			// CreateAluno
			System.out.println("\n\nTESTE|=> Gerar 10 alunos  =======================================");
			for (int i=0; i<10; i++) {
				client.testCreate();
			}					
			
			// getAllAlunos	
			System.out.println("\n\nTESTE|=> Listar todos os alunos  ================================");
			client.testGetAll();
						
			// editAluno
			System.out.println("\n\nTESTE|=> Editar último aluno  ===================================");
			client.testEdit();
			
			// getAluno
			System.out.println("\n\nTESTE|=> Buscar aluno editado  ==================================");
			client.testGet();
			
			System.out.println("\n|=> Listar todos para confirmar edição do último.\n");
			client.testGetAll();
			
			// deleteAluno  			
			System.out.println("\n\nTESTE|=> Remover aluno  =========================================");
			client.testDelete();
			
			System.out.println("\n|=> Listar todos para confirmar a remoção.\n");
			client.testGetAll();	
		} 
		catch (Exception e) {
			System.out.println("\n\nErro: Servidor está offline.\n");
			System.out.println(e);
		}
		
	}
}
