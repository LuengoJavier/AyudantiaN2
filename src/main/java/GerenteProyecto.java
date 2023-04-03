import java.util.ArrayList;

public class GerenteProyecto extends Empleado {
	private ArrayList<Proyecto> proyectos;

	public GerenteProyecto(String nombre, double salario, String cargo, ArrayList<Proyecto> proyectos) {
		super(nombre, salario, "Gerente");
		this.proyectos = proyectos;
	}

	public ArrayList<Proyecto> getProyectos() {
		return this.proyectos;
	}

	public void setProyectos(ArrayList<Proyecto> proyectos) {
		this.proyectos = proyectos;
	}

	public String getTipo() {
		return "Gerente";
	}
}