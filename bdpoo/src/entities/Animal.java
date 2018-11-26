package entities;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Animal {
	@Id
	private Long idAnim;
	public Long getIdAnim() {
		return idAnim;
	}
	public void setIdAnim(Long idAnim) {
		this.idAnim = idAnim;
	}
	private String raca;
	private int peso;
	private PetShop petShop;
	
	public Animal(Long idAnim, String raca, int peso, PetShop petShop) {
		super();
		this.idAnim = idAnim;
		this.raca = raca;
		this.peso = peso;
		this.petShop = petShop;
	}
	
	@Override
	public String toString() {
		return "Animal [idAnim=" + idAnim + ", raca=" + raca + ", peso=" + peso + ", petShop=" + petShop + "]";
	}
	public String getRaca() {
		return raca;
	}
	public void setRaca(String raca) {
		this.raca = raca;
	}
	public int getPeso() {
		return peso;
	}
	public void setPeso(int peso) {
		this.peso = peso;
	}
	public PetShop getPetShop() {
		return petShop;
	}
	public void setPetShop(PetShop petShop) {
		this.petShop = petShop;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((idAnim == null) ? 0 : idAnim.hashCode());
		result = prime * result + peso;
		result = prime * result + ((petShop == null) ? 0 : petShop.hashCode());
		result = prime * result + ((raca == null) ? 0 : raca.hashCode());
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
		Animal other = (Animal) obj;
		if (idAnim == null) {
			if (other.idAnim != null)
				return false;
		} else if (!idAnim.equals(other.idAnim))
			return false;
		if (peso != other.peso)
			return false;
		if (petShop == null) {
			if (other.petShop != null)
				return false;
		} else if (!petShop.equals(other.petShop))
			return false;
		if (raca == null) {
			if (other.raca != null)
				return false;
		} else if (!raca.equals(other.raca))
			return false;
		return true;
	}
	

}
