package decorador.Decorador;

import decorador.ComponenteC.Bebidas;


public class Chantilly extends Adiciones{

	public Chantilly(Bebidas bebida){
		super(bebida);
	}

	@Override
	public int getprecio() {
		// TODO Auto-generated method stub
		return getBebida().getprecio() + 1300;
	}

	@Override
	public String getNombre() {
		// TODO Auto-generated method stub
		return getBebida().getNombre() + " + Adición de chantilly";
	}
}
