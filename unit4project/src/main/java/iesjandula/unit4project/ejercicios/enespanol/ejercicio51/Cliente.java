package iesjandula.unit4project.ejercicios.enespanol.ejercicio51;
import java.util.Objects;

public class Cliente extends Persona {
	

	private String telefono;
	
	
	public Cliente(String nif, String nombre, String apellidos, String telefono) {
		super(nif, nombre, apellidos);

		this.telefono = telefono;
	}




	public String getTelefono() {
		return telefono;
	}


	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}




	@Override
	public String toString() {
		return "Cliente [telefono=" + telefono + ", nif=" + getNif() + ", nombre=" + getNombre()
				+ ", apellidos=" + getApellidos() + "]";
	}

	











	
	

}
