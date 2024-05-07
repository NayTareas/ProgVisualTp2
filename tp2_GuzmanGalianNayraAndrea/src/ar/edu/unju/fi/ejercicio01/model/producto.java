package ar.edu.unju.fi.ejercicio01.model;

public class producto {
	private int codigo;
	private String descripcion;
	private double preciounitario;
	private OrigenFabricacion OrigenFabricacion;
	private Categoria Categoria;

	public producto(int codigo, String descripcion, double preciounitario, OrigenFabricacion OrigenFabricacion, Categoria Categoria) {
		this.codigo = codigo;
        this.descripcion = descripcion;
        this.preciounitario = preciounitario;
        this.OrigenFabricacion = OrigenFabricacion;
        this.Categoria = Categoria;
	}
	// Getters y setters
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getPrecioUnitario() {
        return preciounitario;
    }

    public void setPrecioUnitario(double preciounitario) {
        this.preciounitario = preciounitario;
    }

    public OrigenFabricacion getOrigenFabricacion() {
        return OrigenFabricacion;
    }

    public void setOrigenFabricacion(OrigenFabricacion OrigenFabricacion) {
        this.OrigenFabricacion = OrigenFabricacion;
    }

    public Categoria getCategoria() {
        return Categoria;
    }

    public void setCategoria(Categoria Categoria) {
        this.Categoria = Categoria;
    }

    // Método toString para mostrar la información del producto
    @Override
    public String toString() {
        return "Producto{" +
                "codigo=" + codigo +
                ", descripcion='" + descripcion + '\'' +
                ", precioUnitario=" + preciounitario +
                ", origenFabricacion=" + OrigenFabricacion +
                ", categoria=" + Categoria +
                '}';
    }

    // Enums
	public enum OrigenFabricacion {
		Argentina, China, Brasil, Uruguay;
		
		

	}

	public enum Categoria {
		Telefonia, Informatica, ElectroHogar, Herramientas;

	}
	
	

}
