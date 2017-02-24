package decorador.Decorador;

import decorador.ComponenteC.Bebidas;


public class Arequipe extends Adiciones{

public Arequipe(Bebidas bebida){
	super(bebida);
}

@Override
public int getprecio() {
	// TODO Auto-generated method stub
	return getBebida().getprecio() + 1500;
}

@Override
public String getNombre() {
	// TODO Auto-generated method stub
	return getBebida().getNombre() +" + Adición de arequipe";
}


}
