package modelo.beans;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the PREGUNTAS database table.
 * 
 */
@Entity
@Table(name="PREGUNTAS")
@NamedQuery(name="Pregunta.findAll", query="SELECT p FROM Pregunta p")
public class Pregunta implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private PreguntaPK id;

	private String pregunta;

	@Column(name="TIPO_ENEAG")
	private String tipoEneag;

	public Pregunta() {
	}
	
	

	public Pregunta(PreguntaPK id, String pregunta, String tipoEneag) {
		super();
		this.id = id;
		this.pregunta = pregunta;
		this.tipoEneag = tipoEneag;
	}



	public PreguntaPK getId() {
		return this.id;
	}

	public void setId(PreguntaPK id) {
		this.id = id;
	}

	public String getPregunta() {
		return this.pregunta;
	}

	public void setPregunta(String pregunta) {
		this.pregunta = pregunta;
	}

	public String getTipoEneag() {
		return this.tipoEneag;
	}

	public void setTipoEneag(String tipoEneag) {
		this.tipoEneag = tipoEneag;
	}

}