package entities;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Endereco {
	@Id
	private String rua;
	private String bairro;
	private int numero;
	
	public Endereco(String rua, String bairro, int numero) {
		super();
		this.rua = rua;
		this.bairro = bairro;
		this.numero = numero;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Endereco other = (Endereco) obj;
		if (bairro == null) {
			if (other.bairro != null)
				return false;
		} else if (!bairro.equals(other.bairro))
			return false;
		if (numero != other.numero)
			return false;
		if (rua == null) {
			if (other.rua != null)
				return false;
		} else if (!rua.equals(other.rua))
			return false;
		return true;
	}
	

}
