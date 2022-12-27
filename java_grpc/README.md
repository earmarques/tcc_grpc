## gRPC no Java :coffee:

Temos as seguintes etapas para fazer:


**[1. asdf](./README.md#1-asdf1-asdf)**<br>
[1.1. Instalar o plugin asdf do Java](#11-instalar-o-plugin-asdf-do-java)<br>
[1.2. Instalar uma versão do Java](#12-instalar-uma-vers%C3%A3o-do-java)<br>
[1.3. Configurar ambiente Java](#13-configurar-ambiente-java)<br>

**[2. Eclipse](./README.md#2-eclipse)**<br>
[2.1 Instalar o Eclipse](#21-instalar-o-eclipse)<br>
[2.2. Configurar o Eclipse](#22-configurar-o-eclipse)<br>

**[3. Projeto Maven Java](./README.md#3-projeto-maven-java)**<br>
[3.1. Criar Projeto](#31-criar-projeto)<br>
[3.2 Configurar Projeto](#32-configurar-projeto)<br>

**[4. Contratos .proto](./README.md#4-contratos-proto)**<br>

**[5. Códigos clientes](./README.md#5-c%C3%B3digos-clientes)**<br>
[5.1. Códigos Auxiliares](#51-c%C3%B3digos-auxiliares)<br>
[5.1.1. Agenda de Contatos](#511-agenda-de-contatos)<br>
[5.1.2. Intervalo](#512-intervalo)<br>

---

📌 Para uma fundamentação teórica e explicação do código, recomendamos a leitura da [Wiki do projeto](https://github.com/earmarques/tcc_grpc/wiki). 
Aqui vamos cuidar apenas de fazer o gRPC funcionar com o Java.

---

### 1. asdf

#### 1.1. Instalar o plugin asdf do Java

```
asdf plugin-add java https://github.com/halcyon/asdf-java.git
```

#### 1.2. Instalar uma versão do Java

Nós vamos usar o Java 8. 

```
asdf install java adoptopenjdk-8.0.345+1
```

#### 1.3. Configurar ambiente Java

Configurando o Java 8 globalmente.

```
asdf global java adoptopenjdk-8.0.345+1
```

O asdf tem um script pronto para configurar o JAVA_HOME.
```
. ~/.asdf/plugins/java/set-java-home.bash
```

### 2. Eclipse

Em nossas pesquisas sobre gRPC no Java, todos os autores que encontramos usavam alguma ferramenta gráfica com um dos dois gerenciadores de dependências Java, Maven ou Gradle.
O mais recorrente e que nos pareceu mais simples, talvez pela nossa familiaridade com a ferramenta, foi o Eclipse IDE. Portanto, não vamos usar o NeoVim e o asdf, vamos utilizar o Eclipse com o Maven.

#### 2.1. Instalar o Eclipse



Instalar o Eclipse não tem segredo. Pode utilizar o gerenciador de aplicativos da sua distribuição linux ou [baixar do site](https://www.eclipse.org/downloads/) o instalador caso use Windows. Nós optamos por baixar o arquivo `eclipse-inst-jre-linux64.tar.gz`. É preciso descompactar este arquivo. Haverá dentro do diretório `eclipse-installer/` o arquivo **`eclipse-inst`** que deve ser executado. Se tiver problemas de permissão, clique com botão da direita, selecione Propriedades e dê permissão de execução, ou então no terminal, digite: `chmod +x eclipse-inst`. Nós instalamos a versão para Web 4.26.0. 

#### 2.2. Configurar o Eclipse

Ao abrirmos o Eclipse, ele questiona pelo diretório _workspace_, onde ficará os arquivos de configuração, de códigos e tudo mais pertinente aos projetos. Podemos centralizar em um único ou podemos ter vários _workspaces_. Nós preferimos a segunda opção, e além do mais, no nosso caso, temos o diretório `tcc_grpc` com subdiretórios para cada API, então vamos criar o subdiretório `java_grpc` para ser o _workspace_ do gRPC. Na figura 1 vemos o caminho completo onde será criado nosso projeto Maven. 

![Workspace gRPC](images/java_workspace.png "Workspace gRPC")<br>
_Figura 2: Workspace gRPC_

Nós gostamos da versão do Java 8, e vamos configurar a IDE Eclipse para usar essa versão em todos os projetos que criarmos, isto é, será a versão _default_ da IDE. É possível configurar uma versão específica para o Java para cada projeto. Nessa instalação do Eclipse já foi instalado várias versões, até a versão 19. Na barra superior do menu, fomos em `Window` >> `Preferences`. Na janela _pop-up_, navegamos `Java` >> `Compiler`, em `Compiler compliance lever`, selecionamos `1.8` e clicamos em `Apply and Close`, como na figura 2. 

![Versão Java 8](images/java_version.png "Versão Java 8")<br>
_Figura 2: Versão Java 8_

### 3. Projeto Maven Java

#### 3.1. Criar Projeto

Nós precisamos de um projeto com o gerenciador de dependências Maven. No menu, `File` >> `New` >> `Other...`, _pop-up_ `Maven` >> `Maven Project` >> `Next`. Não esquecer de marcar a opção `Create a simple project` como está na figura 3.

![Projeto Maven simples](images/java_maven_simple_project.png "Projeto Maven simples")<br>
_Figura 3: Projeto Maven simples_

Para este projeto Maven, nós demos as identificações de artefato mostradas na figura 4. 

![Artefato do projeto Maven](images/java_maven_simple_project2.png "Artefato do projeto Maven")<br>
_Figura 4: Artefato do projeto Maven_

#### 3.2. Configurar Projeto

Precisamos fazer algumas configurações no projeto para que possomos trabalhar com o gRPC. Para tanto, devemos editar o arquivo pom.xml para ficar como na listagem 1. 

```xml
<project xmlns="http://maven.apache.org/POM/4.0.0" 
         xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" 
         xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 https://maven.apache.org/xsd/maven-4.0.0.xsd">
	<modelVersion>4.0.0</modelVersion>
	<groupId>br.com.kanjarana</groupId>
	<artifactId>tcc_grpc_java</artifactId>
	<version>0.0.1-SNAPSHOT</version>
	<name>java_grpc</name>
	
	<dependencies>
		<dependency>
			<groupId>com.google.protobuf</groupId>
			<artifactId>protobuf-java</artifactId>
			<version>3.6.1</version>
		</dependency>
		<dependency>
			<groupId>javax.annotation</groupId>
			<artifactId>javax.annotation-api</artifactId>
			<version>1.3.2</version>
		</dependency>
		<dependency>
			<groupId>io.grpc</groupId>
			<artifactId>grpc-netty-shaded</artifactId>
			<version>1.15.1</version>
		</dependency>
		<dependency>
			<groupId>io.grpc</groupId>
			<artifactId>grpc-protobuf</artifactId>
			<version>1.15.1</version>
		</dependency>
		<dependency>
			<groupId>io.grpc</groupId>
			<artifactId>grpc-stub</artifactId>
			<version>1.15.1</version>
		</dependency>
	</dependencies>
	
	<properties>
		<project.build.sourceEncoding>UTF-8</project.build.sourceEncoding>
	</properties>
	
	<build>
		<defaultGoal>clean generate-sources compile install</defaultGoal>
		<plugins>
			<!-- compile proto file into java files. -->
			<plugin>
				<groupId>com.github.os72</groupId>
				<artifactId>protoc-jar-maven-plugin</artifactId>
				<version>3.6.0.1</version>
				<executions>
					<execution>
						<phase>generate-sources</phase>
						<goals>
							<goal>run</goal>
						</goals>
						<configuration>
							<includeMavenTypes>direct</includeMavenTypes>
							
							<inputDirectories>
								<include>src/main/resources</include>
							</inputDirectories>
							
							<outputTargets>
								<outputTarget>
									<type>java</type>
									<outputDirectory>src/main/java</outputDirectory>
								</outputTarget>
								
								<outputTarget>
									<type>grpc-java</type>
									<pluginArtifact>io.grpc:protoc-gen-grpc-java:1.15.0</pluginArtifact>
									<outputDirectory>src/main/java</outputDirectory>
								</outputTarget>
							</outputTargets>
							
						</configuration>
					</execution>
				</executions>
			</plugin>
			
			<plugin>
				<groupId>org.apache.maven.plugins</groupId>
				<artifactId>maven-compiler-plugin</artifactId>
				<version>3.8.0</version>
				<configuration>
					<source>1.8</source>
					<target>1.8</target>
				</configuration>
			</plugin>
		</plugins>
	</build>
</project>

```

No início do arquivo de configuração do projeto (`pom.xml`) temos as dependências aos artefatos necessários ao gRPC (figura 5).

![Dependências gRPC](images/java_dependencias.png "Dependências gRPC")<br>
_Figura 5: Dependências gRPC_

Temos na sequência a proriedade UTF-8, e logo a seguir, a configuração do comportamento padrão quando fizermos o _Maven-build_. No escopo dos _plugins_, podemos ver artefato e a versão do compilador _protobuf_java_maven_build.png que iremos usar. Na tag `inputDirectories` está a localização dos arquivos `.proto`, no caso em `src/main/resources`. O destino dos códigos gerados pelo _framework_ gRPC (_tag_ `outputTargets`) vai depender do tipo, os `java` vão parar em `src/main/java` e os tipo `grpc-java` para a pasta `src/main/java_grpc`. O último _plugin_ é do próprio Maven, onde é informada a versão Java 8 para o projeto.

Salvado o `pom.xml`, clicamos com botão direto no projeto em `Package Explorer` para abrir um menu, vamos em `Maven` >> `Update Project...` (atalho Alt F5), selecionamos o projeto e em `Ok` (figura 6).

![Atualizar projeto após edição do pom.xml](images/java_update.png "Atualizar projeto após edição do pom.xml")<br>
_Figura 6: Atualizar projeto após edição do pom.xml_

Em seguida, vamos construir o projeto e verificar se está tudo certo.  Novamente, botão direto sobre o projeto, `Run As` >> `Maven build`. Irá abrir a janela da figura 7. Como nós já definimos no `pom.xml` o comportamento padrão do `Maven-build`, podemos deixar o campo `Goals` vazio e clicar em `Run`.

![Maven build](images/java_maven_build.png "Maven build")<br>
_Figura 7: Maven build_

Na primeira vez, o Maven vai baixar e instalar as dependências. Se tudo correr bem, teremos como resultado a saída no Console da figura 8.

![Projeto construído com sucesso](images/java_build_sucess.png "Projeto construído com sucesso")<br>
_Figura 8: Projeto construído com sucesso_


### 4. Contratos .proto

Java vai se comunicar diretamente com Javascript e Dart, então precisamos dos arquivos `sorteio.proto` e `aluno.proto`. Estes arquivos devem ficar no pacote `resources`, conforme especificamos no `pom.xml`.

![Estrutura de pacotes projeto Java](https://github.com/earmarques/tcc_grpc/blob/main/images/fig20.png "Estrutura de pacotes projeto Java")<br>
_Figura 9: Estrutura de pacotes projeto Java_

Agora vamos compilar os `.proto` com o plugin Java através do Maven. Botão direito no projeto >> `Run As` >> `Maven build` >> `Run`. Serão criados dois arquivos por `proto`, `sorteio.proto` produzirá `Sorteio.java` e `SorteioServiceGrpc.java` e o `aluno.proto` resultará em `AlunoOuterClass.java` e `CrudAlunoServiceGrpc.java`. Conforme definimos no `pom.xml`, os códigos que irão cuidar da comunicação pela rede estão no pacote `java_grpc`.

### 5. Códigos clientes

Vamos escrever códigos clientes das API um por vez. Primeiro vamos fazer o Java consumir o microserviço de sorteio do JavaScript com `ClientJS.java`, depois vamos testar a integração do Java com o Dart com `ClientDart.java` e por fim, faremos a integração com as quatro aplicações em `JavaClientNodeJSDartGo.java`. Estes arquivos estão no pacote `client`.

#### 5.1. Códigos Auxiliares

Antes precisamos de dois códigos que estão no _package_ `model`.

##### 5.1.1. Agenda de Contatos

Esta classe é a que possui a lista de 51 nomes da qual iremos selecionar dez, sorteando o índice da lista com o microserviço Javascript.

```java
package model;

import java.util.ArrayList;
import java.util.List;

public class AgendaContatos {
	
	public List<String> lista;
	
	public AgendaContatos() {
		this.lista = new ArrayList<>();
	    preencherLista();
	  }

	public String getPessoa(int i) {
		return this.lista.get(i);
	}

	private void preencherLista() {
		this.lista.add("ANDREY OCHIUCI RAMOS MARCONDES");
		this.lista.add("ANGELICA DEMCZUK SERRA SILVA DE JESUS");
		this.lista.add("ARYELL MATOS DE AMORIM");
		this.lista.add("BRUNA RAMALHO MAYOR");
		this.lista.add("BRUNO SILVA SANTANA");
		this.lista.add("CAROLINE CARDOSO OLIVEIRA");
		this.lista.add("DANIEL DE OLIVEIRA MARTINS");
		this.lista.add("DULCEMEIRE DE FREITAS SOUZA ALONSO");
		this.lista.add("EDEZIO TOMAZ DE OLIVEIRA");
		this.lista.add("EVANDRO GARCIA LOPES");
		this.lista.add("FERNANDA FERREIRA MAGALHDIAS");
		this.lista.add("FERNANDA GABRIELA DOS SANTOS CHIQUETO");
		this.lista.add("FERNANDO MAURO GARCIA");
		this.lista.add("GABRIEL DAVID SANTOS");
		this.lista.add("GUILHERME SILVA CASTILHO");
		this.lista.add("JEANE DE ALBUQUERQUE SILVA");
		this.lista.add("JOAO PEDRO SOBRINHO RIBEIRO");
		this.lista.add("JOSE ANTONIO FERNANDES");
		this.lista.add("JOSIANE SILVA OLIVEIRA");
		this.lista.add("LUIZ PEDRO CANDIDO");
		this.lista.add("LUIZ RICARDO DE OLIVEIRA ZANOLINI");
		this.lista.add("MAICON GUILHERME PINHEIRO BRUNO");
		this.lista.add("MARA CRISTINA DE SOUZA ARRUDA");
		this.lista.add("MISAEL CREMONIN DE SOUZA");
		this.lista.add("PATRICK OLIVEIRA SIMPLICIO");
		this.lista.add("PAULO ALEX GRONOW");
		this.lista.add("RODRIGO HENRIQUE GARCEZ GUIMARAES");
		this.lista.add("SOLANGE LAYANA DE OLIVEIRA CANTINHO LOPES");
		this.lista.add("THULIO HENRIQUE XAVIER E SILVA PARTEZANI");
		this.lista.add("VICTOR HUGO BARIA");
		this.lista.add("VICTOR LOURENCO SIQUEIRA LOPES");
		this.lista.add("VICTOR SANTINI HAIKEL");
		this.lista.add("VICTOR SILVA DOS SANTOS");
		this.lista.add("VITORIA LYSANDRA OLIVEIRA SANTOS DE SOUZA");
		this.lista.add("VITORIA RAHMAN");
		this.lista.add("WILFRANC PIERRE LOUIS");
		this.lista.add("YAN CAETANO PADUA BARRETO");
		this.lista.add("LUCIANA REGINA PERPETUA DOS SANTOS");
		this.lista.add("ANGELA SEBASTIANA DOS SANTOS");
		this.lista.add("CAMILA SILVA TORRES");
		this.lista.add("CASSIA DOS SANTOS");
		this.lista.add("DARA LUIZA ZACARIAS SIQUEIRA");
		this.lista.add("DILEIA FERREIRA DA SILVA");
		this.lista.add("EDCLEIA GASPARELLI QUINTINO");
		this.lista.add("EDSON HENRIQUE DO CARMO CARVALHO");
		this.lista.add("ELIANE ZANIBONI");
		this.lista.add("FABIO ROBERTO REIS PRACHEDES");
		this.lista.add("FABIOLA MATEUS FERREIRA");
		this.lista.add("GENESIS BATISTA DA SILVA");
		this.lista.add("GENILDO FIGUEIREDO OLIVEIRA");
		this.lista.add("IRACIANA DA CONCEICAO SILVA");
	}	  
}

```

##### 5.1.2. Intervalo

Classe para encapsular os limites do domínio contínuo de números inteiros a serem sorteados.

```java
package model;

public class Intervalo {
	public int min = 0;
	public int max = 0;
	
	public Intervalo() {}
	
	public Intervalo(int min, int max) {
		this.min = min;
		this.max = max;
	}
}

```

#### 5.1. ClientJS.java

Testamos a comunicação entre Java e sorteador de número Javascript. Não podemos esquecer de executar o servidor no NodeJS, porta 50053.

```java
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

```
#### 5.2. ClientDart.java

Testamos a comunicação entre Java e o banco de dados Dart. Só precisamos executar o Dart, o servidor de id Golang não precisa, porque no teste estamos fornecendo o id, e o Dart só fazer a chamada remota ao Go se o objeto `request` não tiver id. Só queremos checar comunicação gRPC, então, só fizemos dois métodos: `getAllAlunos` e `createAluno`. 

```java
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

```
#### 5.3. JavaClientNodeJSDartGo.java

Agora sim, devemos inicializar os três servidores de microserviço e testar todos os métodos CRUD Dart.  

```java
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
		Aluno alunoCriado =  createAluno(alunoToCreate);				// gRPC - API Dart
		System.out.println("Novo aluno criado:");
		System.out.println(alunoCriado);
	}

	// GetAll
	public void testGetAll() {
		System.out.println("\n☕ API Java - getAllAlunos  ________________________________");
		//teste
		Alunos alunos = getAllAlunos();									// gRPC - API Dart
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
		Alunos alunos = getAllAlunos();									// gRPC - API Dart
		int indexUltimo = alunos.getAlunosCount() - 1;
		Aluno ultimoAluno = alunos.getAlunos(indexUltimo);				
		Aluno alunoToEdit = Aluno.newBuilder()
				.setId(ultimoAluno.getId())
				.setNome("Matheus Rufato Santana de Oliveira")
				.build();
		//teste		
		Aluno alunoEditado = editAluno(alunoToEdit);					// gRPC - API Dart
		String msg = String.format("Aluno de id=%d com nome editado:\n", alunoEditado.getId());
		System.out.println( msg + alunoEditado);
	}
	
	// Get
	public void testGet() {
		// Resgata o aluno que fora editado, o último 
		System.out.println("\n☕ API Java - getAluno  ____________________________________"); 
		Alunos alunos = getAllAlunos();									// gRPC - API Dart
		int indexUltimo = alunos.getAlunosCount() - 1;
		Aluno ultimoAluno = alunos.getAlunos(indexUltimo);				
		AlunoId alunoId = AlunoId.newBuilder()
				.setId(ultimoAluno.getId())
				.build();
		//teste
		Aluno aluno = getAluno(alunoId);								// gRPC - API Dart
		String msg = String.format("Aluno de id=%d resgatado:\n", aluno.getId());
		System.out.println( msg + aluno);
	}
	
	// Delete
	public void testDelete() {
		// Altera o nome do aluno do último aluno 
		System.out.println("\n☕ API Java - deleteAluno  _________________________________"); 
		Alunos alunos = getAllAlunos();									// gRPC - API Dart
		int indexUltimo = alunos.getAlunosCount() - 1;
		Aluno ultimoAluno = alunos.getAlunos(indexUltimo);				
		AlunoId alunoId = AlunoId.newBuilder()
				.setId(ultimoAluno.getId())
				.build();
		// teste
		deleteAluno(alunoId);											// gRPC - API Dart				
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

```



