package modelo.beans;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the ENEAGRAMAS database table.
 * 
 */
@Entity
@Table(name="ENEAGRAMAS")
@NamedQuery(name="Eneagrama.findAll", query="SELECT e FROM Eneagrama e")
public class Eneagrama implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="ID_ENEAGRAMA")
	private int idEneagrama;

	private String tipo;

	public Eneagrama() {
	}

	public int getIdEneagrama() {
		return this.idEneagrama;
	}

	public void setIdEneagrama(int idEneagrama) {
		this.idEneagrama = idEneagrama;
	}

	public String getTipo() {
		return this.tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

}