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
