import java.util.ArrayList;

public class Launcher {

	public static void main(String[] args) {
		inicializar();
	}

	public static void inicializar() {
		Empresa empresa=new Empresa();
		ArrayList<String> lenguajes = new ArrayList<>();
		lenguajes.add("PYTHON");
		lenguajes.add("C++");
		lenguajes.add("JAVA");

		Desarrollador desarrollador = new Desarrollador("Diego",1550.50,"Desarrollador",lenguajes);
		empresa.agregarEmpleado(desarrollador);

		GerenteProyecto gerenteProyecto = new GerenteProyecto("Pedro",1840.60,"GerenteProyecto",empresa.getProyectos());
		empresa.agregarEmpleado(gerenteProyecto);

		Proyecto proyecto = new Proyecto("PAGINA WEB","Pagina web para tienda mayorista",empresa.getEmpleados());
		empresa.agregarProyecto(proyecto);
		empresa.agragarEmpleadoProyecto(desarrollador, proyecto);
		empresa.agragarEmpleadoProyecto(gerenteProyecto, proyecto);
		empresa.mostrarProyecto(proyecto);



		double gastosSueldos= empresa.sumarSalarios();
		System.out.println("Total sueldo de los empleados: "+gastosSueldos);
	}
}