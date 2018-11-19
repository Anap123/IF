import java.util.ArrayList;

import entities.Endereco;

public interface IPetshop {
	public void PetShop(String NomeShop, Endereco endereco);
	public void Fornecedor(Endereco enderecoForn, int getId);
	public void Produto(int id_p);
	public void Animal(int idAnim, String raca, int peso);
	public void Cliente(int idCliente, String nome);
	public void Site(int idSite, String paginas);
	
	
}
