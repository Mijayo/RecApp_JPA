package modelo.beans;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the auxiliar database table.
 * 
 */
@Entity
@NamedQuery(name="Auxiliar.findAll", query="SELECT a FROM Auxiliar a")
public class Auxiliar implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="ID_AUX")
	private int idAux;

	//uni-directional many-to-one association to Anuncio
	@ManyToOne
	@JoinColumn(name="KEY_AUX")
	private Anuncio anuncio;

	//uni-directional many-to-one association to Eneagrama
	@ManyToOne
	@JoinColumn(name="ID_ENE_AUX")
	private Eneagrama eneagrama;

	//uni-directional many-to-one association to Profesion
	@ManyToOne
	@JoinColumn(name="ID_PROF_AUX")
	private Profesion profesion;

	public Auxiliar() {
	}

	public int getIdAux() {
		return this.idAux;
	}

	public void setIdAux(int idAux) {
		this.idAux = idAux;
	}

	public Anuncio getAnuncio() {
		return this.anuncio;
	}

	public void setAnuncio(Anuncio anuncio) {
		this.anuncio = anuncio;
	}

	public Eneagrama getEneagrama() {
		return this.eneagrama;
	}

	public void setEneagrama(Eneagrama eneagrama) {
		this.eneagrama = eneagrama;
	}

	public Profesion getProfesion() {
		return this.profesion;
	}

	public void setProfesion(Profesion profesion) {
		this.profesion = profesion;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((anuncio == null) ? 0 : anuncio.hashCode());
		result = prime * result + ((eneagrama == null) ? 0 : eneagrama.hashCode());
		result = prime * result + idAux;
		result = prime * result + ((profesion == null) ? 0 : profesion.hashCode());
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
		Auxiliar other = (Auxiliar) obj;
		if (anuncio == null) {
			if (other.anuncio != null)
				return false;
		} else if (!anuncio.equals(other.anuncio))
			return false;
		if (eneagrama == null) {
			if (other.eneagrama != null)
				return false;
		} else if (!eneagrama.equals(other.eneagrama))
			return false;
		if (idAux != other.idAux)
			return false;
		if (profesion == null) {
			if (other.profesion != null)
				return false;
		} else if (!profesion.equals(other.profesion))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Auxiliar [idAux=" + idAux + ", anuncio=" + anuncio + ", eneagrama=" + eneagrama + ", profesion="
				+ profesion + "]";
	}

	public Auxiliar(int idAux, Anuncio anuncio, Eneagrama eneagrama, Profesion profesion) {
		super();
		this.idAux = idAux;
		this.anuncio = anuncio;
		this.eneagrama = eneagrama;
		this.profesion = profesion;
	}

}