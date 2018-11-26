package entities;

import java.util.ArrayList;

import javax.persistence.Entity;
import javax.persistence.Id;
@Entity
public class Compra {
	@Id
	
	private int idComp;
	private int valorCompra;
	private ArrayList <Produto> produtos;
	private Cliente cliente;
	private String site;
	public int getIdComp() {
		return idComp;
	}
	public void setIdComp(int idComp) {
		this.idComp = idComp;
	}
	public int getValorCompra() {
		return valorCompra;
	}
	public void setValorCompra(int valorCompra) {
		this.valorCompra = valorCompra;
	}
	public ArrayList<Produto> getProdutos() {
		return produtos;
	}
	public void setProdutos(ArrayList<Produto> produtos) {
		this.produtos = produtos;
	}
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	public String getSite() {
		return site;
	}
	public void setSite(String site) {
		this.site = site;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((cliente == null) ? 0 : cliente.hashCode());
		result = prime * result + idComp;
		result = prime * result + ((produtos == null) ? 0 : produtos.hashCode());
		result = prime * result + ((site == null) ? 0 : site.hashCode());
		result = prime * result + valorCompra;
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
		Compra other = (Compra) obj;
		if (cliente == null) {
			if (other.cliente != null)
				return false;
		} else if (!cliente.equals(other.cliente))
			return false;
		if (idComp != other.idComp)
			return false;
		if (produtos == null) {
			if (other.produtos != null)
				return false;
		} else if (!produtos.equals(other.produtos))
			return false;
		if (site == null) {
			if (other.site != null)
				return false;
		} else if (!site.equals(other.site))
			return false;
		if (valorCompra != other.valorCompra)
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Compra [idComp=" + idComp + ", valorCompra=" + valorCompra + ", produtos=" + produtos + ", cliente="
				+ cliente + ", site=" + site + "]";
	}
	
	
}