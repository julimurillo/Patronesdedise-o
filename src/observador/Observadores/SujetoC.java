package observador.Observadores;

import java.util.ArrayList;

import observador.Sujetos.Observador;

public class SujetoC implements Sujeto{

	 private static ArrayList<Observador> observadores= new ArrayList<Observador>() ;
	
	 
	 
		@Override
		public void subscribirse(Observador observador) {
			observadores.add(observador);
			
		}
		
		
		@Override
		public void desubscribirse(Observador observador) {
			observadores.remove(observador);
			
		}

	
	
	

	@Override
	public void getState() {
		
		for (int i = 0; i < observadores.size(); i++) {
			observadores.get(i).Notificar();
			
		}
		
		
	}



}
