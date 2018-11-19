package entities;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class PetShop {
	@Id
	private int id1;
	private String nomeShop;
	private Endereco endereco;
	private Site site;
	private Set<Produto> produtos;
	private Set<Fornecedor> fornecedores;
	private Set<Cliente> clientes;

	@Column(name = "id_pet")
	private Long id;

	public int getId() {
		return id1;
	}

	public void setId(int id) {
		this.id1 = id;
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
		result = prime * result + id1;
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
		if (id1 != other.id1)
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
		this.id1 = id;
		this.nomeShop = nomeShop;
		this.endereco = endereco;
		Endereco = endereco2;
	}

	private String Endereco;

	@Override
	public String toString() {
		return "PetShop [id=" + id1 + ", nomeShop=" + nomeShop + ", endereco=" + endereco + ", Endereco=" + Endereco
				+ "]";
	}

	public Site getSite() {
		return site;
	}

	public void setSite(Site site) {
		this.site = site;
	}

	public Set<Produto> getProdutos() {
		return produtos;
	}

	public void setProdutos(Set<Produto> produtos) {
		this.produtos = produtos;
	}

	public Set<Cliente> getClientes() {
		return clientes;
	}

	public void setClientes(Set<Cliente> clientes) {
		this.clientes = clientes;
	}

	public Set<Fornecedor> getFornecedores() {
		return fornecedores;
	}

	public void setFornecedores(Set<Fornecedor> fornecedores) {
		this.fornecedores = fornecedores;
	}

}

