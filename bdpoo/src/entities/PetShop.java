package entities;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;

@Entity
public class PetShop {
	@Id
	
	@OneToMany
	@JoinColumn(name = "id1")
	private Long id1;
	private String nomeShop;
	@OneToMany
	@JoinColumn(name = "endereco")
	private Endereco endereco;
	@OneToMany
	@JoinColumn(name = "site")
	private Site site;
	private Set<Produto> produtos;
	private Set<Fornecedor> fornecedores;
	@ManyToMany
	@JoinTable
	private Set<Cliente> clientes;
	
	
	

	public Long getId1() {
		return id1;
	}

	public void setId1(Long id1) {
		this.id1 = id1;
	}

	public String getNomeShop() {
		return nomeShop;
	}

	public void setNomeShop(String nomeShop) {
		this.nomeShop = nomeShop;
	}

	public Endereco getEndereco1() {
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
	public String getEndereco() {
		return Endereco;
	}

	public void setEndereco(String endereco) {
		Endereco = endereco;
	}


	private String Endereco;

}



