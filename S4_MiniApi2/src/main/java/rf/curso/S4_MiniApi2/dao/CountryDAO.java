package rf.curso.S4_MiniApi2.dao;
import rf.curso.S4_MiniApi2.servicios.*;

import rf.curso.S4_MiniApi2.modelos.*;
import java.util.ArrayList;
import java.util.List;



import jakarta.persistence.EntityManager;
import jakarta.persistence.Query;


public class CountryDAO {
	EntityManager manager = JPAUtil.getEntityManager();

	// guardar Country
	public void guardar(Country country) {
		manager.getTransaction().begin();
		manager.persist(country);
		manager.getTransaction().commit();		
	}

	// editar Country
	public void editar(Country country) {
		manager.getTransaction().begin();
		manager.merge(country);
		manager.getTransaction().commit();
	}

	// buscar Country
	public Country buscar(String country_id) {
		
		Country c = manager.find(Country.class, country_id);
		return c;
	}

	/// eliminar Country
	public void eliminar(String country_id) {
		Country c = manager.find(Country.class, country_id);
		manager.getTransaction().begin();
		manager.remove(c);
		manager.getTransaction().commit();
	}

	// obtener todos los Country
	public List<Country> obtenerCountrys() {
		List<Country> listaCountrys = new ArrayList<>();
		Query q = manager.createQuery("SELECT c FROM Country c");
		listaCountrys = (List<Country>) q.getResultList();
		return listaCountrys;
	}
}
