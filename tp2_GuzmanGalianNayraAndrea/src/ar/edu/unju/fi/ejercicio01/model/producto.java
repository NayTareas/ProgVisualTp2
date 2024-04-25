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
	
	public enum OrigenFabricacion {
		Argentina, China, Brasil, Uruguay;
		
		

	}

	public enum Categoria {
		Telefonia, Informatica, ElectroHogar, Herramientas;

	}
	

}
