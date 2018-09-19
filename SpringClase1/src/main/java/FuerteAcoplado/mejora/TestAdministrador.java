package FuerteAcoplado.mejora;

public class TestAdministrador {
	
	
	public static void main(String[] args) {
		
		
		IDireccion myDir = new Direccion();
		Administrador admin = new Administrador(myDir);
		
		admin.imprimirDireccion();
		
	}

}
