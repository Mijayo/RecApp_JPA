package modelo.DAO;

import java.util.List;
import javax.persistence.*;

import modelo.beans.Eneagrama;
import modelo.beans.Pregunta;

public class PreguntaDAOImpl implements preguntaDAO {
	private EntityManagerFactory emf;
	private EntityManager em;
	private EntityTransaction tx;
	private Query query;
	private String sql;
	
	
	public PreguntaDAOImpl() {
		emf = Persistence.createEntityManagerFactory("RecApp2");
		em = emf.createEntityManager();
		tx = em.getTransaction();
	}
	
	@Override
	public int insertar(Pregunta preg, String pregunta, String tipoEneag, Eneagrama eneag) {
	
			try {
				tx.begin();
				em.persist(preg);
				tx.commit();
				return 1;
			}catch (Exception e) {
				System.out.println(e.getMessage());
				return 0;
			}
	
	}

	@Override
	public List<Pregunta> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Pregunta actualizar(Pregunta preg) {
//		Pregunta pregunta = null;
//		pregunta = em.find(Pregunta.class, preg);
//		if(pregunta != null) {
//			pregunta.setPregunta(nuevaPregunta);
//			
//		}
	return null;
	}

	@Override
	public Pregunta eliminar(Pregunta preg) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Pregunta> findByEneagrama(int eneag) {
		sql = "select pre from Preguntas where pre.ENE_PREGUNTA =:ene";
		
		try {
			query = em.createQuery(sql);
			query.setParameter("ene", eneag);
			return query.getResultList();
		} catch(Exception e){
			return null;	
		}
		
	}

}
