package iesjandula.unit4project.ejercicios.enespanol.ejercicio44;

public class AppNotas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Nota n1= new NotaMarcada(0,"Conjunción",40,"Amarillo");
		
		Nota n2= new NotaAlarma(1,"Adelantar reloj",60,"10:20");
		
		BlocNotas bloq = new BlocNotas();
		
		bloq.addNota(n1);
		bloq.addNota(n2);
		
		Nota n3= bloq.buscarNotaPorId(0);
		
		System.out.println(n3);
		
	    Nota[] notas = {n2,n3};
	    
	    bloq.eliminarNota(n1);
	    bloq.eliminarNota(n2);
	    
	    bloq.listarNotas();
	    
	    
	    bloq.addNotas(notas);
	    
	    bloq.listarNotas();
	    
	    

	}

}
