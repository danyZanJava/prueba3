
public class Persona {
	
	private int id;
	private String nombre;
	
public Persona(){
	
	id = 0;
	nombre = "";
}

public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}

public String getNombre() {
	return nombre;
}

public void setNombre(String nombre) {
	this.nombre = nombre;
}
public void imprimirInfoPersona(){
	
	System.out.println("La Id es " + id);
	System.out.println("el nombre es: " + nombre);
}

}
