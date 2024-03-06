package iesjandula.unit4project.ejercicios.enespanol.ejercicio51;

public class Directivo extends Empleado {

	private double bonusPorcentaje;
	private double beneficiosDep;

	public Directivo(String nombre, String apellidos, String nif, int antigüedad, double salario,
			double bonusPorcentaje, double beneficiosDep) {
		super(nombre, apellidos, nif, antigüedad, salario);

		this.bonusPorcentaje = bonusPorcentaje;
		this.beneficiosDep = beneficiosDep;

	}
	
	

	public double getBonusPorcentaje() {
		return bonusPorcentaje;
	}



	public void setBonusPorcentaje(double bonusPorcentaje) {
		this.bonusPorcentaje = bonusPorcentaje;
	}



	public double getBeneficiosDep() {
		return beneficiosDep;
	}



	public void setBeneficiosDep(double beneficiosDep) {
		this.beneficiosDep = beneficiosDep;
	}



	@Override
	public EnumCategoria tipoEmpleado() {
		// TODO Auto-generated method stub
		return EnumCategoria.DIRECTIVO;
	}

	// impuestos y bonusPorcentaje es un numero entre 0 y 1
	@Override
	public double calculaSueldo(double impuestos) {
		// TODO Auto-generated method stub
		double sueldoBruto = this.getSalario() + this.bonusPorcentaje * this.beneficiosDep;

		return sueldoBruto - this.calculaImpuestos(sueldoBruto, impuestos);
	}

	

}
