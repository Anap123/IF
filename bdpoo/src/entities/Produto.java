package entities;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Produto {
	@Id
	private int id_p;
	
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
	
}
