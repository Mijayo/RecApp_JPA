package modelo.beans;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the preguntas database table.
 * 
 */
@Entity
@Table(name="preguntas")
@NamedQuery(name="Pregunta.findAll", query="SELECT p FROM Pregunta p")
public class Pregunta implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="ID_PREGUNTA")
	private int idPregunta;

	private String pregunta;

	@Column(name="TIPO_ENEAG")
	private String tipoEneag;

	//uni-directional many-to-one association to Eneagrama
	@ManyToOne
	@JoinColumn(name="ENE_PREGUNTA")
	private Eneagrama eneagrama;

	public Pregunta() {
	}

	public int getIdPregunta() {
		return this.idPregunta;
	}

	public void setIdPregunta(int idPregunta) {
		this.idPregunta = idPregunta;
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

	public Eneagrama getEneagrama() {
		return this.eneagrama;
	}

	public void setEneagrama(Eneagrama eneagrama) {
		this.eneagrama = eneagrama;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((eneagrama == null) ? 0 : eneagrama.hashCode());
		result = prime * result + idPregunta;
		result = prime * result + ((pregunta == null) ? 0 : pregunta.hashCode());
		result = prime * result + ((tipoEneag == null) ? 0 : tipoEneag.hashCode());
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
		Pregunta other = (Pregunta) obj;
		if (eneagrama == null) {
			if (other.eneagrama != null)
				return false;
		} else if (!eneagrama.equals(other.eneagrama))
			return false;
		if (idPregunta != other.idPregunta)
			return false;
		if (pregunta == null) {
			if (other.pregunta != null)
				return false;
		} else if (!pregunta.equals(other.pregunta))
			return false;
		if (tipoEneag == null) {
			if (other.tipoEneag != null)
				return false;
		} else if (!tipoEneag.equals(other.tipoEneag))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Pregunta [idPregunta=" + idPregunta + ", pregunta=" + pregunta + ", tipoEneag=" + tipoEneag
				+ ", eneagrama=" + eneagrama + "]";
	}

	public Pregunta(int idPregunta, String pregunta, String tipoEneag, Eneagrama eneagrama) {
		super();
		this.idPregunta = idPregunta;
		this.pregunta = pregunta;
		this.tipoEneag = tipoEneag;
		this.eneagrama = eneagrama;
	}

}