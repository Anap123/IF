package entities;

public class Animal {
	
	private int idAnim;
	private String raca;
	private int peso;
	
	private PetShop petShop;
	
	public int getIdAnim() {
		return idAnim;
	}
	public void setIdAnim(int idAnim) {
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
	public Animal(int idAnim, String raca, int peso) {
		super();
		this.idAnim = idAnim;
		this.raca = raca;
		this.peso = peso;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + idAnim;
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
		if (idAnim != other.idAnim)
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
	public PetShop getPetShop() {
		return petShop;
	}
	public void setPetShop(PetShop petShop) {
		this.petShop = petShop;
	}
	

}
