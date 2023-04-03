import java.util.ArrayList;

public class Proyecto {
	private String nombre;
	private String descripcion;
	private ArrayList<Empleado> empleados;

	public Proyecto(String nombre, String decripcion, ArrayList<Empleado> empleados) {
		this.nombre = nombre;
		this.descripcion = decripcion;
		this.empleados = empleados;
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDescripcion() {
		return this.descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public ArrayList<Empleado> getEmpleados() {
		return this.empleados;
	}
	@Override
	public String toString() {
		return "\nNombre: "+getNombre()+"\nDescripción: "+getDescripcion()+"\nEmpleados: "+getEmpleados()+ "\n";
	}
}