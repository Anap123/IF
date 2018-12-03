 package entities;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Produto {
	@Id
	private int id_p;
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id_p;
		result = prime * result + validade;
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
		Produto other = (Produto) obj;
		if (id_p != other.id_p)
			return false;
		if (validade != other.validade)
			return false;
		return true;
	}
	public Produto(int id_p, int validade) {
		super();
		this.id_p = id_p;
		this.validade = validade;
	}
	private int validade;

	public int getId_p() {
		return id_p;
	}
	public void setId_p(int id_p) {
		this.id_p = id_p;
	}
	public int getValidade() {
		return validade;
	}
	public void setValidade(int validade) {
		this.validade = validade;
	}
	
	
}
