package entities;

import java.util.ArrayList;

public class Cliente {
	private int idCliente;
	private String nome;
	
	private ArrayList<Animal> animais;
	private String Site;
	private ArrayList <Produto> produtoss;
	
	
	public int getIdCliente() {
		return idCliente;
	}
	public void setIdCliente(int idCliente) {
		this.idCliente = idCliente;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	@Override
	public String toString() {
		return "Cliente [idCliente=" + idCliente + ", nome=" + nome + "]";
	}
	public Cliente(int idCliente, String nome) {
		super();
		this.idCliente = idCliente;
		this.nome = nome;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + idCliente;
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Cliente other = (Cliente) obj;
		if (idCliente != other.idCliente)
			return false;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		return true;
	}
	public ArrayList<Animal> getAnimais() {
		return animais;
	}
	public void setAnimais(ArrayList<Animal> animais) {
		this.animais = animais;
	}
	public String getSite() {
		return Site;
	}
	public void setSite(String site) {
		Site = site;
	}
	public ArrayList <Produto> getProdutoss() {
		return produtoss;
	}
	public void setProdutoss(ArrayList <Produto> produtoss) {
		this.produtoss = produtoss;
	}
	
	

}
