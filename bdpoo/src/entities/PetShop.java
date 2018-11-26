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

}

