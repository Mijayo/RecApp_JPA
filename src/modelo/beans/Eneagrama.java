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
	
	

	public Eneagrama(int idEneagrama, String tipo) {
		super();
		this.idEneagrama = idEneagrama;
		this.tipo = tipo;
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



	@Override
	public String toString() {
		return "Eneagrama [idEneagrama=" + idEneagrama + ", tipo=" + tipo + "]";
	}



	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + idEneagrama;
		result = prime * result + ((tipo == null) ? 0 : tipo.hashCode());
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
		Eneagrama other = (Eneagrama) obj;
		if (idEneagrama != other.idEneagrama)
			return false;
		if (tipo == null) {
			if (other.tipo != null)
				return false;
		} else if (!tipo.equals(other.tipo))
			return false;
		return true;
	}

	
	
}