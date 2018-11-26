 package entities;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Fornecedor {
	@Id
	private int id;
	private Endereco enderecoForn;
	

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Fornecedor other = (Fornecedor) obj;
		if (enderecoForn == null) {
			if (other.enderecoForn != null)
				return false;
		} else if (!enderecoForn.equals(other.enderecoForn))
			return false;
		if (id != other.id)
			return false;
		return true;
	}
	public Fornecedor(Endereco enderecoForn) {
		super();
		this.enderecoForn = enderecoForn;
	}
	public void setEnderecoForn(Endereco enderecoForn) {
		this.enderecoForn = enderecoForn;
	}

}
