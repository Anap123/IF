package entities;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;

@Entity
public class Animal {
	@Id
	@OneToMany
	@JoinColumn(name = "idAdimin")
	private Long idAnim;
	private String raca;
	@ManyToMany
	@JoinTable
	private int peso;
	
	

	public Long getIdAnim() {
		return idAnim;
	}

	public void setIdAnim(Long idAnim) {
		this.idAnim = idAnim;
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

	@Override
	public String toString() {
		return "Animal [idAnim=" + idAnim + ", raca=" + raca + ", peso=" + peso + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((idAnim == null) ? 0 : idAnim.hashCode());
		result = prime * result + peso;
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
		if (raca == null) {
			if (other.raca != null)
				return false;
		} else if (!raca.equals(other.raca))
			return false;
		return true;
	}

	

}
