package entities;

import java.util.ArrayList;

public class Compra {
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
	public ArrayList <Produto> getProdutos() {
		return produtos;
	}
	public void setProdutos(ArrayList <Produto> produtos) {
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
}
