public abstract class Empleado {
	private String nombre;
	private double salario;
	private String cargo;
	private Proyecto proyecto;

	public Empleado(String nombre, double salario, String cargo) {
		this.cargo = cargo;
		this.nombre = nombre;
		this.salario = salario;
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getSalario() {
		return this.salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public String getCargo() {
		return this.cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
	@Override
	public String toString() {
		return "Nombre: "+getNombre()+", Cargo: "+getCargo()+", Sueldo: "+getSalario();
	}

	public abstract String getTipo();
}