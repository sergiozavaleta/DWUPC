package pe.edu.upc.appSesion1;

public class Fruta {

	//Encapsulamiento de datos
	//Atributos de instancia(Objetos)
	private String nombre;
	private String color;
	private String sabor;
	private boolean puedoHacerJugo;
	
	//Atributos de clase
	public static String planetaOrigen = "Tierra";

	
	//Metodods de acceso a datos
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getSabor() {
		return sabor;
	}

	public void setSabor(String sabor) {
		this.sabor = sabor;
	}

	public boolean isPuedoHacerJugo() {
		return puedoHacerJugo;
	}

	public void setPuedoHacerJugo(boolean puedoHacerJugo) {
		this.puedoHacerJugo = puedoHacerJugo;
	}

	@Override
	public String toString() {
		return "Fruta [nombre=" + nombre + ", color=" + color + ", sabor=" + sabor + ", puedoHacerJugo="
				+ puedoHacerJugo + "]";
	}
	
	
}
