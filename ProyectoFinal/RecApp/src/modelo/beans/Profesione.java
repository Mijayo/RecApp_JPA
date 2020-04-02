package modelo.beans;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the PROFESIONES database table.
 * 
 */
@Entity
@Table(name="PROFESIONES")
@NamedQuery(name="Profesione.findAll", query="SELECT p FROM Profesione p")
public class Profesione implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="ID_PROFESION")
	private int idProfesion;

	public Profesione() {
	}

	public int getIdProfesion() {
		return this.idProfesion;
	}

	public void setIdProfesion(int idProfesion) {
		this.idProfesion = idProfesion;
	}

}