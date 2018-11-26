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
	
	
}