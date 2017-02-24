package decorador.Decorador;

import decorador.ComponenteC.Bebidas;


public class Azucar extends Adiciones{

	public Azucar(Bebidas bebida){
		super(bebida);
	}

	@Override
	public int getprecio() {
		// TODO Auto-generated method stub
		return getBebida().getprecio() + 500;
	}

	@Override
	public String getNombre() {
		// TODO Auto-generated method stub
		return getBebida().getNombre() + " + Adición de azucar";
	}
}
