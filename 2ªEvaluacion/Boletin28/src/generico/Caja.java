
package generico;

public class Caja <T>{

	private T t;

	public void agregar(T t) {

		this.t=t;
	}

	public T obtener() {

		return t;
	}


}