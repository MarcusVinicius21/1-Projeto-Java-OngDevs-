package projeto;

import java.util.ArrayList;
import java.util.List;



public abstract  class Ong {
	
	protected List<String> nome = new ArrayList<String>();
	protected  List<String> contato = new ArrayList<String>();
	protected List<String> descricao = new ArrayList<String>();
	
	
	public Ong(ArrayList<String> nome, ArrayList<String> contato,  ArrayList<String> descricao) {
		
		this.nome = nome;
		this.contato = contato;
		this.descricao = descricao;
	}

	public Ong() {
		
	}

	

	
	
	
	
	
	
	
	
	
	

}
