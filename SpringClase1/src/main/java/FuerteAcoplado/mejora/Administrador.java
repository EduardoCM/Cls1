package FuerteAcoplado.mejora;

public class Administrador {
	
	
	IDireccion direccion;
	
	public Administrador(IDireccion direccion) {
		direccion = this.direccion;
	}
	
	
	
	
	public void setDireccion(IDireccion direccion) {
		this.direccion = direccion;
	}




	public void imprimirDireccion() {
		direccion.imprimirDireccion();
	}

}
