package entities;
import java.util.ArrayList;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Main {

	public static void main(String[] args) {
		Animal a = new Animal();
		a.setIdAnim(5l);
		a.setPeso(100);
		DAO<Animal> dao = new DAO<>();
		dao.save(a);
//		DAO<Professor> dao = new DAO<Professor>();
//		Professor p = new Professor();
//		p.setId(26l);
//		p.setNome("HugoFF");
//		dao.save(p);
//		Professor p2 = new Professor();
//		p2.setId(28l);
//		p2.setNome("Hugo");
//		dao.save(p2);
//		Professor find = dao.find(Professor.class, 28l);
//		System.out.println(find.getNome());
	}
	
}
