import java.util.ArrayList;

public class Disenador extends Empleado {
	private ArrayList<String> herramientas;

	public Disenador(String nombre, double salario, String cargo, ArrayList<String> herramientas) {
		super(nombre, salario, "Diseñador");
		this.herramientas =herramientas;
	}

	public ArrayList<String> getHerramientas() {
		return this.herramientas;
	}

	public void setHerramientas(ArrayList<String> herramientas) {
		this.herramientas = herramientas;
	}

	public String getTipo() {
		return "Diseñador";
	}
}