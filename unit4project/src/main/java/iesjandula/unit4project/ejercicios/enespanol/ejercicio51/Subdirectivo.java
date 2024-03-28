package iesjandula.unit4project.ejercicios.enespanol.ejercicio51;

public class Subdirectivo extends Empleado {

	private double porcentajeBonusAntiguedad;

	private double primaAnual;

	public Subdirectivo(String nombre, String apellidos, String nif, int antigüedad, double salario,
			double porcentajeBonusAntiguedad, double primaAnual) {
		super(nombre, apellidos, nif, antigüedad, salario);

		this.porcentajeBonusAntiguedad = porcentajeBonusAntiguedad;
		this.primaAnual = primaAnual;

		// TODO Auto-generated constructor stub
	}

	public double getPorcentajeBonusAntiguedad() {
		return porcentajeBonusAntiguedad;
	}

	public void setPorcentajeBonusAntiguedad(double porcentajeBonusAntiguedad) {
		this.porcentajeBonusAntiguedad = porcentajeBonusAntiguedad;
	}

	public double getPrimaAnual() {
		return primaAnual;
	}

	public void setPrimaAnual(double primaAnual) {
		this.primaAnual = primaAnual;
	}

	@Override
	public EnumCategoria tipoEmpleado() {
		// TODO Auto-generated method stub
		return EnumCategoria.SUBDIRECTIVOS;
	}

	@Override
	public double calculaSueldo(double impuestos) {
		// TODO Auto-generated method stub
		double sueldoBruto = this.getSalario() + this.getPorcentajeBonusAntiguedad() * this.getAntigüedad() + this.getPrimaAnual();

		return sueldoBruto - this.calculaImpuestos(sueldoBruto, impuestos);
	}



}
