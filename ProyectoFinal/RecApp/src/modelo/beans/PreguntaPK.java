package modelo.beans;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the PREGUNTAS database table.
 * 
 */
@Embeddable
public class PreguntaPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="ID_PREGUNTA")
	private int idPregunta;

	@Column(name="NUM_PREGUNTA")
	private int numPregunta;

	public PreguntaPK() {
	}
	public int getIdPregunta() {
		return this.idPregunta;
	}
	public void setIdPregunta(int idPregunta) {
		this.idPregunta = idPregunta;
	}
	public int getNumPregunta() {
		return this.numPregunta;
	}
	public void setNumPregunta(int numPregunta) {
		this.numPregunta = numPregunta;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof PreguntaPK)) {
			return false;
		}
		PreguntaPK castOther = (PreguntaPK)other;
		return 
			(this.idPregunta == castOther.idPregunta)
			&& (this.numPregunta == castOther.numPregunta);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.idPregunta;
		hash = hash * prime + this.numPregunta;
		
		return hash;
	}
}