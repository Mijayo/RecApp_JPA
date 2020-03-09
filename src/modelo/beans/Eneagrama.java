package modelo.beans;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the eneagramas database table.
 * 
 */
@Entity
@Table(name="eneagramas")
@NamedQuery(name="Eneagrama.findAll", query="SELECT e FROM Eneagrama e")
public class Eneagrama implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="ID_ENEAGRAMA")
	private int idEneagrama;

	private String descripcion;

	private int sum;

	private String tipo;

	public Eneagrama() {
	}

	public int getIdEneagrama() {
		return this.idEneagrama;
	}

	public void setIdEneagrama(int idEneagrama) {
		this.idEneagrama = idEneagrama;
	}

	public String getDescripcion() {
		return this.descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public int getSum() {
		return this.sum;
	}

	public void setSum(int sum) {
		this.sum = sum;
	}

	public String getTipo() {
		return this.tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((descripcion == null) ? 0 : descripcion.hashCode());
		result = prime * result + idEneagrama;
		result = prime * result + sum;
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
		if (descripcion == null) {
			if (other.descripcion != null)
				return false;
		} else if (!descripcion.equals(other.descripcion))
			return false;
		if (idEneagrama != other.idEneagrama)
			return false;
		if (sum != other.sum)
			return false;
		if (tipo == null) {
			if (other.tipo != null)
				return false;
		} else if (!tipo.equals(other.tipo))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Eneagrama [idEneagrama=" + idEneagrama + ", descripcion=" + descripcion + ", sum=" + sum + ", tipo="
				+ tipo + "]";
	}

	public Eneagrama(int idEneagrama, String descripcion, int sum, String tipo) {
		super();
		this.idEneagrama = idEneagrama;
		this.descripcion = descripcion;
		this.sum = sum;
		this.tipo = tipo;
	}

}