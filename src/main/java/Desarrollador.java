import java.util.ArrayList;

public class Desarrollador extends Empleado {
	private ArrayList<String> lenguaje;

	public Desarrollador(String nombre, double salario, String cargo, ArrayList<String> lenguaje) {
		super(nombre, salario,"Desarrollador");
		this.lenguaje = lenguaje;
	}

	public String getTipo() {
		return "Desarrollador";
	}

	public ArrayList<String> getLenguaje() {
		return this.lenguaje;
	}

	public void setLenguaje(ArrayList<String> lenguaje) {
		this.lenguaje = lenguaje;
	}
}