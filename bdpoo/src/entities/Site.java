package entities;

import java.util.ArrayList;

public class Site {

	private int idSite;
	private String paginas;
	private ArrayList<Cliente> clientes;

	public int getIdSite() {
		return idSite;
	}

	public void setIdSite(int idSite) {
		this.idSite = idSite;
	}

	public String getPaginas() {
		return paginas;
	}

	public void setPaginas(String paginas) {
		this.paginas = paginas;
	}

	@Override
	public String toString() {
		return "Site [idSite=" + idSite + ", paginas=" + paginas + "]";
	}

	public Site(int idSite, String paginas) {
		super();
		this.idSite = idSite;
		this.paginas = paginas;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + idSite;
		result = prime * result + ((paginas == null) ? 0 : paginas.hashCode());
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

	public ArrayList<Cliente> getClientes() {
		return clientes;
	}

	public void setClientes(ArrayList<Cliente> clientes) {
		this.clientes = clientes;
	}

}
