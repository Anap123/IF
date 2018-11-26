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

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((Endereco == null) ? 0 : Endereco.hashCode());
		result = prime * result + ((clientes == null) ? 0 : clientes.hashCode());
		result = prime * result + ((endereco == null) ? 0 : endereco.hashCode());
		result = prime * result + ((fornecedores == null) ? 0 : fornecedores.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + id1;
		result = prime * result + ((nomeShop == null) ? 0 : nomeShop.hashCode());
		result = prime * result + ((produtos == null) ? 0 : produtos.hashCode());
		result = prime * result + ((site == null) ? 0 : site.hashCode());
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
		if (clientes == null) {
			if (other.clientes != null)
				return false;
		} else if (!clientes.equals(other.clientes))
			return false;
		if (endereco == null) {
			if (other.endereco != null)
				return false;
		} else if (!endereco.equals(other.endereco))
			return false;
		if (fornecedores == null) {
			if (other.fornecedores != null)
				return false;
		} else if (!fornecedores.equals(other.fornecedores))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (id1 != other.id1)
			return false;
		if (nomeShop == null) {
			if (other.nomeShop != null)
				return false;
		} else if (!nomeShop.equals(other.nomeShop))
			return false;
		if (produtos == null) {
			if (other.produtos != null)
				return false;
		} else if (!produtos.equals(other.produtos))
			return false;
		if (site == null) {
			if (other.site != null)
				return false;
		} else if (!site.equals(other.site))
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
		return "PetShop [id1=" + id1 + ", nomeShop=" + nomeShop + ", endereco=" + endereco + ", site=" + site
				+ ", produtos=" + produtos + ", fornecedores=" + fornecedores + ", clientes=" + clientes + ", id=" + id
				+ ", Endereco=" + Endereco + "]";
	}

	public int getId1() {
		return id1;
	}

	public void setId1(int id1) {
		this.id1 = id1;
	}

	public String getNomeShop() {
		return nomeShop;
	}

	public void setNomeShop(String nomeShop) {
		this.nomeShop = nomeShop;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
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

	public Set<Fornecedor> getFornecedores() {
		return fornecedores;
	}

	public void setFornecedores(Set<Fornecedor> fornecedores) {
		this.fornecedores = fornecedores;
	}

	public Set<Cliente> getClientes() {
		return clientes;
	}

	public void setClientes(Set<Cliente> clientes) {
		this.clientes = clientes;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getEndereco() {
		return Endereco;
	}

	public void setEndereco(String endereco) {
		Endereco = endereco;
	}

}

