package modelo.DAO;

import java.util.List;
import modelo.beans.Eneagrama;
import modelo.beans.Pregunta;

public interface preguntaDAO {

	public int insertar (Pregunta preg, String pregunta, String tipoEneag, Eneagrama eneag );
	public List<Pregunta> findAll();
	public Pregunta actualizar(Pregunta preg);
	public Pregunta eliminar(Pregunta preg);
	public List<Pregunta> findByEneagrama(int eneag);
	
}
