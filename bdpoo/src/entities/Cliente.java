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
