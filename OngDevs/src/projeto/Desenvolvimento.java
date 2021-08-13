package projeto;


import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;



public class Desenvolvimento extends DadosdasOngs {



	public Desenvolvimento(ArrayList<String> nome, 
			ArrayList<String> contato, ArrayList<String> descricao) {
		super(nome,  contato,descricao);
		// TODO Auto-generated constructor stub
	}
	public Desenvolvimento() {
		// TODO Auto-generated constructor stub
	}
	String nome;
	
	 String email;
	int num1;
	int num2;
	int num3 = 0;
	int num4=0;
	int num5=0;
	int num6=0;
	Scanner ler = new Scanner(System.in);
	
	
	
	
	
	
	
	
	
	public void ApresentacaoInicial() {
		
		System.out.println(".•*¨`*•. ☆ .•*¨`*•.\r\n"
				+ "Olá, nós somos a ONGdevs e esperamos que você esteja ótimo(a)!!!!\r\n"
				+ "✿•*¨`*•. (¯`v´¯) (¯`v´¯) .•*¨`*•✿\r\n"
				+ ". . . ✿•*¨`*•.¸(¯`v´¯)¸.•´*¨`*•✿ . . .\r\n");
		System.out.println("Iremos fazer algumas perguntas para que possamos te conhecer melhor :)");
		delay(40);
		System.out.println();
		
		System.out.println("Por favor digite os seguintes dados para continuar" + "\nDigite o seu nome completo: ");
		nome=ler.nextLine();
		
		System.out.println("Por favor digite o seu email");
		email = ler.nextLine();
		
		
	
		Pessoa pessoa = new Pessoa(nome, email);
	}
	
	
	
	public void Apresentar() {
		
		try {
		
		System.out.println();
		
		System.out.println("Seja muito bem vindo(a), " +nome + "!\n" + "\nIremos falar um pouco sobre o nosso trabalho, mas antes;");
		delay(40);
		System.out.println("Você já ouviu falar sobre a ONGDevs?");
		
		System.out.println("\nSomos um projeto com a finalidade viabilizar a sua vontade de fazer a diferença na vida de quem mais precisa"
				+ " em pouquissímos cliques, diretamente do seu computador ou smartphone.\nO intuito é trazer visibilidade para diversas "
		+ "organizações sem fins lucrativos que ajudam milhares de pessoas e animais em diversos segmentos ao redor do país. ");
		delay(40);
			
			System.out.println("\nVocê sabe o que é uma ONG ? Por favor, selecione 1 => SIM || 2 => NÃO ");
			num1=ler.nextInt();
			
			while(num1 < 1 || num1 >= 3) {
				System.out.println("Digite o número correspondente a pergunta.");
				System.out.println("Por favor, selecione 1 => SIM || 2 => NÃO:");
				num1 = ler.nextInt();
				
			}
			if (num1==1 || num1==2) {
				System.out.println("As ONGs são consideradas entidades privadas, mas sem fins lucrativos, "
						+ "uma vez que sua finalidade é exclusivamente de auxiliar a sociedade."
						+ " Atuam por meio de voluntários que se colocam à disposição \npara ajudar o próximo, "
						+ "ou seja, as ONGs são verdadeiras entidades que promovem o bem! ");
			}
			
			
			System.out.println("\nVocê já apoiou alguma ONG antes? Por favor, selecione 1 => SIM || 2 => NÃO  ");
			num2=ler.nextInt();
   	
			while(num2 < 1 || num2 >= 3) {
				System.out.println("Digite o número correspondente a pergunta.");
				System.out.println("Por favor, selecione 1 => SIM || 2 => NÃO:");
				num2 = ler.nextInt();
				
			}
			
			if (num2==1) {
				System.out.println("Está aqui para apoiar novamente? Por favor, selecione 1 => SIM || 2 => NÃO ");
				num3=ler.nextInt();
			}
			if (num2==2) {
				System.out.println("Gostaria de apoiar? Por favor, selecione 1 => SIM || 2 => NÃO ");
				num3=ler.nextInt();
			}
			
			while(num3 < 1 || num3 >= 3) {
				System.out.println("Digite o número correspondente a pergunta.");
				System.out.println("Por favor, selecione 1 => SIM || 2 => NÃO:");
				num3 = ler.nextInt();
					// TODO: handle exception
				}
			
			
           /*if (num3==2) {
				
				System.out.println("Muito obrigado! Esperamos que retorne em breve caso mude de idéia :D ");
				
			}
			
			if (num3==1) {
				
				System.out.println("Deseja se tornar um apoiador de uma ONG? Por favor, selecione 1 => SIM || 2 => NÃO ");
			num5=ler.nextInt();
			}*/
			
			if (num3==2) {
				System.out.println("Muito obrigado! Esperamos que retorne em breve caso mude de idéia :D ");
			}
			
			if (num3==1) {
				System.out.println("Tem preferência por algum setor de apoio? "); //vetores ONG
				Setores();
			}
		}catch(InputMismatchException e) {
			System.out.println("\n\n\nErro no Sistema. Digite  1 => SIM || 2 => NÃO.\n\n Sistema Finalizado");
		}
			
	}
	
	
	public void Setores() {
		
		try {
		
		System.out.println("Por favor, selecione um número para o segmento de interesse:");
		System.out.println("1 - Saúde  ");
		System.out.println("2 - Trabalho ");
		System.out.println("3 - Educação ");
		System.out.println("4 - Cidadania ");
		System.out.println("5 - Animais");
		
		
		num1 = ler.nextInt();
		
		
		switch (num1){
		case 1:
			for(int i = 0; i < 3;i++) {
				System.out.println("============================================================================" + "\nOPÇÃO " + (i+1) );
			System.out.println(getNomeSaude().get(i));
			System.out.println();
			System.out.println( getDescricaoSaude().get(i));}
			//System.out.println("\n\n\n" );
			System.out.println("\nAlguma das ONG's te interessou mais ?\nPor favor, selecione o numero correspondente: ");
			num1 = ler.nextInt();
			OngEscolhida(1, num1);
			break;
			
		case 2:
			for(int i = 0; i < 2;i++) {
				System.out.println("============================================================================" + "\nOPÇÃO " + (i+1) );
			System.out.println( getNomeTrabalho().get(i));
			System.out.println( );
			System.out.println( getDescricaoTrabalho().get(i));}
		System.out.println("\nAlguma das ONG's te interessou mais ?\nPor favor, selecione o numero correspondente: ");
		num1 = ler.nextInt();
		OngEscolhida(2, num1);
			break;
			
		case 3:
			for(int i = 0; i < 3;i++) {
				System.out.println("============================================================================" + "\nOPÇÃO " + +(i+1) );
			System.out.println( getNomeEducacao().get(i));
			System.out.println( );
			System.out.println( getDescricaoEducacao().get(i));}
			System.out.println("\nAlguma das ONG's te interessou mais ?\nPor favor, selecione o numero correspondente: ");
			num1 = ler.nextInt();
			OngEscolhida(3, num1);
			break;
			
		case 4:
			for(int i = 0; i < 4;i++) {
				System.out.println("============================================================================" + "\nOPÇÃO " + +(i+1) );
			System.out.println(getNomeCidadao().get(i));
			System.out.println( );
			System.out.println( getDescricaoCidadao().get(i));}
			System.out.println("\n\n\n" );
			System.out.println("\nAlguma das ONG's te interessou mais ?\nPor favor, selecione o numero correspondente: ");
			num1 = ler.nextInt();
			OngEscolhida(4, num1);
			
			break;
		
		case 5:
			for(int i = 0; i < 3;i++) {
				System.out.println("============================================================================" + "\nOPÇÃO " + +(i+1) );
			System.out.println( getNomeAnimais().get(i));
			System.out.println( );
			System.out.println( getDescricaoAnimais().get(i));}
			System.out.println("\n\n\n" );
			System.out.println("Alguma das ONG's te interessou mais ?\\nPor favor, selecione o numero correspondente: ");
			num1 = ler.nextInt();
			OngEscolhida(5, num1);
			break;
		}	
		Agradecimento();}catch(InputMismatchException e) {
			System.out.println("\n\n\nErro no Sistema. Digite  1 => SIM || 2 => NÃO.\n\n Sistema Finalizado");
		}
			
	}
	public static void delay(int ms) {
	    try {
	        Thread.sleep(ms);
	    } catch (InterruptedException e) {
	        System.err.format("IOException: %s%n", e);
	    }
	}
	
	public void OngEscolhida(int setor, int opcoes) {
		System.out.println("\n========================================\n");
		if(setor == 4) {
			if(opcoes == 1) {System.out.println(getContatoCidadao().get(0));}
			if(opcoes == 2) {System.out.println( getContatoCidadao().get(1));}
			if(opcoes == 3) {System.out.println( getContatoCidadao().get(2));}
			if(opcoes == 4) {System.out.println( getContatoCidadao().get(3));}
			}
		if(setor == 3) {
			if(opcoes == 1)System.out.println(  getContatoEducacao().get(0));
			if(opcoes == 2)System.out.println(  getContatoEducacao().get(1));
			if(opcoes == 3)System.out.println(  getContatoEducacao().get(2));
			
		}
		if(setor == 5) {
			if(opcoes == 1)System.out.println(  getContatoAnimais().get(0));
			if(opcoes == 2)System.out.println(  getContatoAnimais().get(1));
			if(opcoes == 3)System.out.println(  getContatoAnimais().get(2));
			if(opcoes == 4)System.out.println(  getContatoAnimais().get(3));
		}
		if(setor == 2) {
			if(opcoes == 1)System.out.println(  getContatoTrabalho().get(0));
			if(opcoes == 2)System.out.println(  getContatoTrabalho().get(1));
			
		}
		if(setor == 1) {
			if(opcoes == 1) {System.out.println(getContatoSaude().get(0));}
			if(opcoes == 2) {System.out.println(  getContatoSaude().get(1));}
			if(opcoes == 3) {System.out.println(  getContatoSaude().get(2));}
			
		}
		}
	
	public void Agradecimento() {
		System.out.println("\nƸ̵̡Ӝ̵̨̄Ʒ ♥�?�♥ ¸.•*´ ♡♥ �?� ★ ♡♥ ☆ `*•.¸ ♥�?�♥ Ƹ̵̡Ӝ̵̨̄Ʒ ♥�?�♥ ¸.•Ƹ̵̡Ӝ̵̨̄Ʒ ♥�?�♥ ¸.•*´ ♡♥ �?� ★ ♡♥ ☆ `*•.¸ ♥�?�♥ Ƹ̵̡Ӝ̵̨̄Ʒ ♥�?�♥ ¸.•\r\n"
				+ "*♡♥ �?� ★ ♡♥ Gostaríamos de agradecer por você ter reservado um momento do seu dia para um bem maior.!  ☆ *•.¸ ♥�?�\r\n"
				+ "♥ Ƹ̵̡Ӝ̵̨̄Ʒ ♥�?�♥ ¸.•*´♡♥ �?� ★ ♡♥ ☆ *•.¸ ♥�?�♥ Ƹ̵̡Ӝ̵̨̄Ʒ♥�?�♥ ♥ Ƹ̵̡Ӝ̵̨̄Ʒ ♥�?�♥ ¸.•*´♡♥ �?� ★ ♡♥ ☆ *•.¸ ♥�?�♥ Ƹ̵̡Ӝ̵̨̄Ʒ♥�?�♥¸\n Enviaremos as informações para o seu email: " + email);
	}
	

	}
	
	
	
