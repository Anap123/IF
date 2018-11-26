package entities;

import java.util.Set;


import javax.persistence.Entity;
import javax.persistence.Id;
@Entity
public class Cliente {
	@Id
	private Long idCliente;
	private String nome;
	private Set<Animal> animais;
	private String Site;
	private Set <Produto> produtoss;
	
	
	@Override
	public String toString() {
		return "Cliente [idCliente=" + idCliente + ", nome=" + nome + ", animais=" + animais + ", Site=" + Site
				+ ", produtoss=" + produtoss + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((Site == null) ? 0 : Site.hashCode());
		result = prime * result + ((animais == null) ? 0 : animais.hashCode());
		result = prime * result + ((idCliente == null) ? 0 : idCliente.hashCode());
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		result = prime * result + ((produtoss == null) ? 0 : produtoss.hashCode());
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
		if (Site == null) {
			if (other.Site != null)
				return false;
		} else if (!Site.equals(other.Site))
			return false;
		if (animais == null) {
			if (other.animais != null)
				return false;
		} else if (!animais.equals(other.animais))
			return false;
		if (idCliente == null) {
			if (other.idCliente != null)
				return false;
		} else if (!idCliente.equals(other.idCliente))
			return false;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		if (produtoss == null) {
			if (other.produtoss != null)
				return false;
		} else if (!produtoss.equals(other.produtoss))
			return false;
		return true;
	}
	public Long getIdCliente() {
		return idCliente;
	}
	public void setIdCliente(Long idCliente) {
		this.idCliente = idCliente;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Set<Animal> getAnimais() {
		return animais;
	}
	public void setAnimais(Set<Animal> animais) {
		this.animais = animais;
	}
	public String getSite() {
		return Site;
	}
	public void setSite(String site) {
		Site = site;
	}
	public Set <Produto> getProdutoss() {
		return produtoss;
	}
	public void setProdutoss(Set <Produto> produtoss) {
		this.produtoss = produtoss;
	}
	
	

}
