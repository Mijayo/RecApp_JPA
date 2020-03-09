package modelo.beans;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the profesiones database table.
 * 
 */
@Entity
@Table(name="profesiones")
@NamedQuery(name="Profesion.findAll", query="SELECT p FROM Profesion p")
public class Profesion implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="ID_PROFESION")
	private int idProfesion;

	public Profesion() {
	}

	public int getIdProfesion() {
		return this.idProfesion;
	}

	public void setIdProfesion(int idProfesion) {
		this.idProfesion = idProfesion;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + idProfesion;
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
		Profesion other = (Profesion) obj;
		if (idProfesion != other.idProfesion)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Profesion [idProfesion=" + idProfesion + "]";
	}

	public Profesion(int idProfesion) {
		super();
		this.idProfesion = idProfesion;
	}

}