package entities;

public class Fornecedor {
	private int id;
	private Endereco enderecoForn;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Endereco getEnderecoForn() {
		return enderecoForn;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((enderecoForn == null) ? 0 : enderecoForn.hashCode());
		result = prime * result + id;
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
	@Override
	public String toString() {
		return "Fornecedor [id=" + id + ", enderecoForn=" + enderecoForn + "]";
	}
	
}
