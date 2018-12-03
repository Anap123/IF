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

	@Column(name = "id_pet")
	private Long id;

	public PetShop(int id, String nomeShop, Endereco endereco, String endereco2) {
		super();
		this.id1 = id;
		this.nomeShop = nomeShop;
		this.endereco = endereco;
		Endereco = endereco2;
	}

	private String Endereco;

}



