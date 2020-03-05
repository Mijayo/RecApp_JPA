package modelo.beans;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the AUXILIAR database table.
 * 
 */
@Entity
@NamedQuery(name="Auxiliar.findAll", query="SELECT a FROM Auxiliar a")
public class Auxiliar implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="ID_AUX")
	private int idAux;

	//uni-directional many-to-one association to Anuncio
	@ManyToOne
	@JoinColumn(name="KEY_AUX")
	private Anuncio anuncio;

	//uni-directional many-to-one association to Profesione
	@ManyToOne
	@JoinColumn(name="ID_PROF_AUX")
	private Profesione profesion;

	//uni-directional many-to-one association to Eneagrama
	@ManyToOne
	@JoinColumn(name="ID_ENE_AUX")
	private Eneagrama eneagrama;

	public Auxiliar() {
	}
	
	
	public Auxiliar(int idAux, Anuncio anuncio, Profesione profesion, Eneagrama eneagrama) {
		super();
		this.idAux = idAux;
		this.anuncio = anuncio;
		this.profesion = profesion;
		this.eneagrama = eneagrama;
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

	public Profesione getProfesion() {
		return this.profesion;
	}

	public void setProfesion(Profesione profesion) {
		this.profesion = profesion;
	}

	public Eneagrama getEneagrama() {
		return this.eneagrama;
	}

	public void setEneagrama(Eneagrama eneagrama) {
		this.eneagrama = eneagrama;
	}


	@Override
	public String toString() {
		return "Auxiliar [idAux=" + idAux + ", anuncio=" + anuncio + ", profesion=" + profesion + ", eneagrama="
				+ eneagrama + "]";
	}

	
	
}