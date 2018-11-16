package entities;

import java.util.ArrayList;

public class PetShop {
	private int id;
	private String nomeShop;
	private Endereco endereco;
	private Site site;
	private ArrayList<Produto> produtos;
	private ArrayList<Fornecedor> fornecedores;
	private ArrayList<Cliente> clientes;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNomeShop() {
		return nomeShop;
	}
	public void setNomeShop(String nomeShop) {
		this.nomeShop = nomeShop;
	}
	public String getEndereco() {
		return Endereco;
	}
	public void setEndereco(String endereco) {
		Endereco = endereco;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((Endereco == null) ? 0 : Endereco.hashCode());
		result = prime * result + ((endereco == null) ? 0 : endereco.hashCode());
		result = prime * result + id;
		result = prime * result + ((nomeShop == null) ? 0 : nomeShop.hashCode());
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
		PetShop other = (PetShop) obj;
		if (Endereco == null) {
			if (other.Endereco != null)
				return false;
		} else if (!Endereco.equals(other.Endereco))
			return false;
		if (endereco == null) {
			if (other.endereco != null)
				return false;
		} else if (!endereco.equals(other.endereco))
			return false;
		if (id != other.id)
			return false;
		if (nomeShop == null) {
			if (other.nomeShop != null)
				return false;
		} else if (!nomeShop.equals(other.nomeShop))
			return false;
		return true;
	}
	public PetShop(int id, String nomeShop, Endereco endereco, String endereco2) {
		super();
		this.id = id;
		this.nomeShop = nomeShop;
		this.endereco = endereco;
		Endereco = endereco2;
	}
	private String Endereco;

	@Override
	public String toString() {
		return "PetShop [id=" + id + ", nomeShop=" + nomeShop + ", endereco=" + endereco + ", Endereco=" + Endereco
				+ "]";
	}
	public Site getSite() {
		return site;
	}
	public void setSite(Site site) {
		this.site = site;
	}
	public ArrayList<Produto> getProdutos() {
		return produtos;
	}
	public void setProdutos(ArrayList<Produto> produtos) {
		this.produtos = produtos;
	}
	public ArrayList<Cliente> getClientes() {
		return clientes;
	}
	public void setClientes(ArrayList<Cliente> clientes) {
		this.clientes = clientes;
	}
	public ArrayList<Fornecedor> getFornecedores() {
		return fornecedores;
	}
	public void setFornecedores(ArrayList<Fornecedor> fornecedores) {
		this.fornecedores = fornecedores;
	}

	
}

