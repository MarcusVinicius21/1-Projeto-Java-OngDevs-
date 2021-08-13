package projeto;

import java.util.ArrayList;
import java.util.List;

public class DadosdasOngs extends Ong{




	public DadosdasOngs(ArrayList<String> nome, 
			ArrayList<String> contato, ArrayList<String> descricao) {
		super(nome, contato, descricao);
		// TODO Auto-generated constructor stub
	}

	public DadosdasOngs() {}


	
	
	public List<String> getNomeSaude() {
		nome.add("Tucca");
		nome.add("Saúde Criança");
		nome.add("Lar Teresa de Jesus");
		nome.add("Horas de Vida");
		return nome;
	}
	
	public List<String> getContatoSaude() {
		contato.add("Contato: (11) 2522-5712\r\n" + 
				"https://www.tucca.org.br/");
		contato.add("Telefone: (21) 2512-1123\r\n Site: https://larteresadejesus.org/" + 
				"");
		contato.add("Telefone: (31) 3291-1330\n Site: https://larteresadejesus.org\r\n" + 
				"");
		contato.add("Telefone:(11) 9 9102-1588   \nSite: https://www.horasdavida.org.br\r\n" + 
				"");
		return contato;
	}
	
	public List<String> getDescricaoSaude() {
		descricao.add("A TUCCA (Associação para Crianças e Adolescentes com Câncer)"
				+ " foi fundada em 1998 por médicos, pais de pacientes e representantes da sociedade civil, "
				+ "com a proposta de elevar as taxas de cura e melhorar a qualidade de vida de crianças");
		
		descricao.add("Fundada em 1991, pela Dra. Vera Cordeiro, médica e clínica geral, "
				+ "com especialização em Psicossomática, a Associação Saúde Criança (ASC) tem a missão de "
				+ "promover a transformação de famílias em situação de vulnerabilidade social.\r\n" + 
				"O trabalho da instituição, localizada no Rio de Janeiro, é feito de forma multidisciplinar"
				+ " e integrada. Favorecendo o desenvolvimento humano, a instituição oferece programas que atuam "
				+ "nas 05 áreas: saúde, moradia, cidadania, renda e educação.\r\n" + 
				"");
		
		
		descricao.add("A ONG de Belo Horizonte, Lar Teresa de Jesus,acolhe e presta atendimento a pacientes "
				+ "\nportadores de câncer, que moram no interior de Minas Gerais. A casa de apoio preza pelo bem"
				+ "\n estar, qualidade de vida e amparo integral para os assistidos. Ao longo de 18 anos de existência, "
				+ "\na ONG já atendeu mais de 12.000 pacientes e seus acompanhantes. Com 04 unidades em Belo Horizonte (MG),"
				+ "\n a instituição oferece serviços como: hospedagem ao acolhido e 01 acompanhante , refeições, "
				+ "\ntransporte para os hospitais, assistência social, psicológica, nutricional e enfermagem.");
		
		descricao.add("Uma rede de voluntariado que atua de forma humanizada com o intuito de diminuir "
				+ "\nas lacunas existentes no sistema de saúde atual. A instituição atende casos de baixa "
				+ "\ncomplexidade, com atendimentos e exames com hora marcada nos consultórios. A Ong Horas "
				+ "\nde Vida atua em São Paulo (SP) e Curitiba (PR) e  atende pacientes associados de 12 instituições."
				+ "\n Entre os serviços prestados estão: mapeamento populacional, triagem (para entender as necessidades"
				+ "\n dos pacientes e direcioná-los para as devidas especialidades.");
		
		return descricao;
	}
	
	
	public List<String> getNomeTrabalho() {
		nome.add("Cruzando histórias");
		nome.add(" Worldpackers  ");
		nome.add("Livre de Trabalho Infantil");
		return nome;
	}
	
	public List<String> getContatoTrabalho() {
		contato.add("Telefone: (11) 97033-6229\n   Site: https://www.cruzandohistorias.org/ ");
		contato.add("Telefone: XXXXXXXXXXXXXX                    \nSite: https://www.worldpackers.com/pt-BR/search/south_america/brazil");
		contato.add("Telefone: XXXXXXXXXXXXXXXX    \nhttps://livredetrabalhoinfantil.org.br/institucional/quem-somos/");
		return contato;
	}
	
	public List<String> getDescricaoTrabalho() {
		descricao.add("Uma organização civil que escuta, acolhe e desenvolve mulheres que estão sem trabalho e renda.");
		descricao.add("A Worldpackers é uma comunidade colaborativa que te conecta com anfitriões "
				+ "\nacolhedores do mundo inteiro onde você pode viajar trocando suas habilidades por hospedagem.");
		descricao.add("O Criança Livre de Trabalho Infantil é um projeto idealizado a partir dos debates promovidos "
				+ "\njunto ao Ministério Público do Trabalho (MPT) no Fórum Paulista de Prevenção e Erradicação do Trabalho Infantil, "
				+ "\nna perspectiva de análise da relação entre racismo e trabalho infantil e a compreensão da educação antirracista também "
				+ "\ncomo uma estratégia para o seu enfrentamento.\r\n" + 
				"\r\n" + 
				"Criado em 2016 pela organização da sociedade civil Cidade Escola Aprendiz, o projeto então chamado “Rede Peteca – Chega de Trabalho Infantil”, visando a promoção dos direitos da criança e do adolescente a partir da erradicação do trabalho infantil, acolhe no ano 2021 uma reformulação e o novo nome. Com isso, foi criada a seção de educação antirracista e o desenvolvimento dos conteúdos e ações, com apoio do MPT e do Fórum Nacional de Prevenção e Erradicação do Trabalho Infantil (FNPETI).\r\n" + 
				"");
		return descricao;
	}
	
	public List<String> getNomeEducacao() {
		nome.add("Generation");
		nome.add(" Fundação Abrinq");
		nome.add(" Projeto Urerê");
		nome.add("Associação Vaga Lume");
		return nome;
	}
	
	public List<String> getContatoEducacao() {
		contato.add("Telefone: 0800 707 1027\r\n" + 
				"Site: https://brazil.generation.org/");
		contato.add("Telefone:  0300 10 12345 \n Site: https://www.fadc.org.br/");
		
		contato.add("Telefone: (21) 3881-6219\n Site: https://www.projetouere.org.br\r\n" + 
				"");
		
		contato.add("Site: https://vagalume.org.br\r\n" + 
				"Telefone: (11) 3032-6032");
		return contato;
	}
	
	public List<String> getDescricaoEducacao() {
		descricao.add("\nGeneration Brasil - Nossa missão é transformar sistemas de educação para o emprego de maneira a preparar,"
				+ "\n colocar e apoiar pessoas em carreiras transformadoras que, de outra forma, seriam inacessíveis" );
		
		descricao.add(" Sede em São Paulo, mas realiza trabalho em todo o país\r\n" + 
				"A Fundação Abrinq pelos Direitos da Criança e do Adolescente foi criada em 13 de fevereiro de 1990, "
				+ "\npautada pela Convenção Internacional dos Direitos da Criança (ONU, 1989), "
				+ "\npela Constituição Federal Brasileira (1988) e pelo Estatuto da Criança e do Adolescente (1990). "
				+ "\nA instituição promove a implementação de ações públicas, fortalecimento de organizações"
				+ "\n não governamentais e governamentais para prestação de serviços ou defesa de direitos, e "
				+ "\narticulação política e social em prol dos direitos da criança e do adolescente.\r\n" + 
				"");
		
		
		descricao.add("Sede no Rio de Janeiro\r\n" + 
				"O Projeto UERÊ, localizado no Complexo da Favela da Maré, na comunidade da Baixa do Sapateiro, "
				+ "\natende 430 crianças e jovens anualmente e mais de 130 mil crianças já têm contato com a Pedagogia"
				+ "\n UERÊ-MELLO em diversas cidades do Brasil. A organização é uma escola com uma metodologia desenhada "
				+ "\npara crianças e jovens com bloqueios cognitivos e emocionais, devido à exposição\r\n" + 
				"");
		
		
		descricao.add("Sede em São Paulo, mas atende todas as áreas da floresta amazônica brasileira"
				+ "\n (estados do Acre, Amapá, Amazonas, Maranhão, Mato Grosso, Pará, Rondônia, Roraima e Tocantins)\r\n" + 
				"\nDesde quando foi criada, em 2001, a Associação Vaga Lume atua em comunidades rurais da Amazônia Legal brasileira,"
				+ "\n desenvolvendo projetos de educação, cultura, e estimulando, principalmente, a leitura, escrita e oralidade."
				+ "\n A partir do trabalho voluntário em 23 municípios na região da Amazônia Legal brasileira e na cidade de São Paulo,"
				+ "\n a instituição intensificou seu intercâmbio nas comunidades e ampliou o alcance das suas ações. Atualmente 22 mil"
				+ "\n crianças, jovens e adultos participam das atividades da ONG. Além disso, 159 bibliotecas foram criadas e quase 100 "
				+ "\nmil livros foram distribuídos em áreas de difícil acesso.\r\n" + 
				"");
		
		return descricao;
	}
	
	public List<String> getNomeCidadao() {
		nome.add("Moradia e Cidadania");
		nome.add("Amigos do Bem");
		nome.add("Tem Gente com Fome");
		nome.add("Amparaí");
		nome.add("Banco de Alimentos");
		return nome;
	}
	
	public List<String> getContatoCidadao() {
		contato = new ArrayList<String>();
		contato.add("Telefone:(61) 3224-8071  \n Site: https://moradiaecidadaniamg.org.br/sobre-nos/"+"Para ajuda-lá basta acessar o site e realizar uma doação ");
		contato.add("Telefone: (11) 3019-0100\r\n" + 
				"Site: https://www.amigosdobem.org/\r\n" + 
				"");
		contato.add("Telefone: XXXXXX \n Site: https://www.temgentecomfome.com.br/");
		contato.add("Telefone: XXXXXXXXXX \nSite: https://misturai.com/amparai/");
		contato.add("Telefone: XXXXXXXXX\r\n" + 
				"Site: https://www.bancodealimentos.org.br/\r\n" + 
				"");
		return contato;
	}
	
	public List<String> getDescricaoCidadao() {
		descricao.add("ONG Moradia e Cidadania - teve origem no Comitê da Ação da Cidadania criado em "
				+ "\n1993 pelos empregados da Caixa Econômica Federal. É responsável por iniciativas como: educação, geração de trabalho e renda"
				+ "\n e apoio às ações de combate à fome e à miséria para comunidades de baixa renda");
		
		
		descricao.add("ONG criada há 27 anos se tornou um dos maiores grupos de voluntários ativos no país,"
				+ " ajudando mais de 75 mil pessoas nos estados de Alagoas, "
				+ "Ceará e Pernambuco e servindo mais de 180 mil refeições todos os meses.");
		
		
		
		descricao.add("A Coalizão Negra Por Direitos, em parceria com a Anistia Internacional, Oxfam Brasil, Redes da Maré,"
				+ " Ação Brasileira de Combate às Desigualdades, e outros, lançaram uma campanha para arrecadar "
				+ "fundos e para ações emergenciais no enfrentamento à fome, à miséria e à violência na pandemia de Covid-19.");
		
		
		descricao.add("Criado em 20 de março de 2020, o Amparaí tem como objetivo distribuir diariamente "
				+ "refeições para pessoas em situação de vulnerabilidade social em Porto Alegre");
		
		
		descricao.add("ONG ajuda a combater o desperdício e alimenta milhares de pessoas em situação de insegurança alimentar."
				+ " Você pode ajudar de forma pontual ou recorrente");
		return descricao;
	}
	
	public List<String> getNomeAnimais() {
		 nome.add("AMPARA Animal");
		 nome.add("Arca Brasil ");
		 nome.add("Clube dos Vira-latas ");
		 nome.add("Cão sem dono ");
		 return nome;
	}
	
	public List<String> getContatoAnimais() {
		contato.add("Telefone: XXXXXXXX\nSite: https://amparanimal.org.br/");
		contato.add("Telefone: (11) 3031-6991 \nSite: https://arcabrasil.org.b");
		contato.add("Telefone: xxxxxxxxxx\n Site:  https://www.clubedosviralatas.org.br/");
		contato.add("Telefone: TEL. (11) 4970-8010 \n Site: https://nfpet.com.br/blog/ ");
		return contato;
	}
	
	public List<String> getDescricaoAnimais() {
		descricao.add("A AMPARA Animal (Associação de Mulheres Protetoras dos Animais Rejeitados e Abandonados) "
				+ "é uma OSCIP sem fins lucrativos que ajuda abrigos e protetores independentes com ração, medicamentos "
				+ "e atendimento veterinário.");
		descricao.add("Na lista de ONGs de animais está a Arca Brasil, inaugurada em 1993. Essa entidade"
				+ "\n foi a primeira no país a planejar um programa municipal para conter a proliferação de"
				+ "\n cães e gatos nas ruas. Assim, com esse projeto piloto, ela serviu de modelo para várias outras "
				+ "\nassociações e órgãos públicos. Até mesmo a capital paulista copiou a ideia.");
		descricao.add("A boa notícia para quem ama os amigos de quatro patas é que as ONGs de animais são muito "
				+ "\nnumerosas mesmo. Nesse sentido, temos também o Clube dos Vira-latas. Essa associação desenvolve"
				+ "\n programas para incentivar a adoção de pets.\r\n" + 
				"Entre as suas realizações estão campanhas para castração, para intervenções cirúrgicas e para vacinar."
				+ "\n Eles são da área do Grande ABC, região metropolitana de São Paulo.\r\n" + 
				"");
		descricao.add("Em Itapecerica da Serra, São Paulo, há mais iniciativas interessantes de ONGs de animais. Desse modo,"
				+ " a instituição Cão sem Dono é outra opção para dar aquela força.\r\n" + 
				"Afinal, eles focam em bichos vítimas de maus-tratos. No local, a alimentação de "
				+ "\ncães e gatos consome uma quantidade diária de ração que chega a 200 quilos. Mais um ponto a favor:"
				+ "\n a associação fica de portas abertas para o público.\r\n" + 
				"");
		return descricao;
	}
	
}
