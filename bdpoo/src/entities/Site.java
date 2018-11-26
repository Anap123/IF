package entities;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity

public class Site {
	@Id

	private int idSite;
	private String paginas;
	private Set<Cliente> clientes;

	public Site(int idSite, String paginas) {
		super();
		this.idSite = idSite;
		this.paginas = paginas;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Site other = (Site) obj;
		if (idSite != other.idSite)
			return false;
		if (paginas == null) {
			if (other.paginas != null)
				return false;
		} else if (!paginas.equals(other.paginas))
			return false;
		return true;
	}

	public Set<Cliente> getClientes() {
		return clientes;
	}
	
	
	public void SetClientes (Set <Cliente> Cliente){
		this.clientes = Cliente;
	}
	
}
	
	

