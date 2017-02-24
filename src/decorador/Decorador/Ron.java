package decorador.Decorador;

import decorador.ComponenteC.Bebidas;


public class Ron extends Adiciones{

	public Ron(Bebidas bebida){
		super(bebida);
	}

	@Override
	public int getprecio() {
		// TODO Auto-generated method stub
		return getBebida().getprecio() + 2500;
	}

	@Override
	public String getNombre() {
		// TODO Auto-generated method stub
		 return getBebida().getNombre() + " + Adición de Ron";
	}
}
