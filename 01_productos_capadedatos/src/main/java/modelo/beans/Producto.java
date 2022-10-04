package modelo.beans;

import java.util.Date;
import java.util.Objects;

public class Producto {
	private int idProducto;
	private  String descripcion;
	private double precioUnitario;
	private Date fechaAlta;
	private Familia familia;
	
	//Generamos constructor con todo 
	public Producto(int idProducto, String descripcion, double precioUnitario, Date fechaAlta, Familia familia) {
		super();
		this.idProducto = idProducto;
		this.descripcion = descripcion;
		this.precioUnitario = precioUnitario;
		this.fechaAlta = fechaAlta;
		this.familia = familia;
	}
	//Generamos constructor vacío
	public Producto() {
		super();
	}
	//Generamos getters and setters
	public int getIdProducto() {
		return idProducto;
	}
	public void setIdProducto(int idProducto) {
		this.idProducto = idProducto;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public double getPrecioUnitario() {
		return precioUnitario;
	}
	public void setPrecioUnitario(double precioUnitario) {
		this.precioUnitario = precioUnitario;
	}
	public Date getFechaAlta() {
		return fechaAlta;
	}
	public void setFechaAlta(Date fechaAlta) {
		this.fechaAlta = fechaAlta;
	}
	public Familia getFamilia() {
		return familia;
	}
	public void setFamilia(Familia familia) {
		this.familia = familia;
	}
	@Override
	public int hashCode() {
		return Objects.hash(idProducto);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Producto other = (Producto) obj;
		return idProducto == other.idProducto;
	}
	@Override
	public String toString() {
		return "Producto [idProducto=" + idProducto + ", descripcion=" + descripcion + ", precioUnitario="
				+ precioUnitario + ", fechaAlta=" + fechaAlta + ", familia=" + familia + "]";
	}
	

	
	

	

}
