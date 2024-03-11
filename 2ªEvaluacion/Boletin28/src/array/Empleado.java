
package array;


public class Empleado {

	private String nombre;
	private String departamento;
	private float salario;

	public Empleado(String nombre, String departamento, float salario) {

		this.nombre = nombre;
		this.departamento = departamento;
		this.salario = salario;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDepartamento() {
		return departamento;
	}

	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}

	public float getSalario() {
		return salario;
	}

	public void setSalario(float salario) {
		this.salario = salario;
	}

	@Override
	public String toString() {
		return "\nnombre: " + nombre + "\ndepartamento: " + departamento + "\nsalario: " + salario;
	}

}