package iesjandula.unit4project.ejercicios.enespanol.ejercicio52;

public enum EnumCategoria {
		TRES(3,3300),
		CUATRO(4, 2200), 
		CINCO (5, 1100);
	
	private int categoria;
	private int bonus;
	
	EnumCategoria(int categoria, int bonus) {
		
		this.categoria=categoria;
		this.bonus=bonus;
	}

	public int getCategoria() {
		return categoria;
	}

	public int getBonus() {
		return bonus;
	}

	
	
	
}
