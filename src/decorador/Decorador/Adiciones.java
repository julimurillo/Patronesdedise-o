package decorador.Decorador;

import decorador.ComponenteC.Bebidas;

public abstract class Adiciones implements Bebidas{

	private Bebidas bebida;

	public Adiciones(Bebidas bebida) {
		setAdicion(bebida);
	}

	public Bebidas getBebida(){
		return bebida;
	}
	private void setAdicion(Bebidas bebida2) {
	this.bebida=bebida2;
		
	}
	
	
	
	
	
}
