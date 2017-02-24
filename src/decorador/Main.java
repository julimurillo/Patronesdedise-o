package decorador;

import decorador.ComponenteC.Bebidas;

import decorador.ComponenteC.Capuccino;
import decorador.Decorador.Arequipe;
import decorador.Decorador.Azucar;
import decorador.Decorador.Ron;

public class Main {

	public static void main(String[] args) {
	    
		Bebidas C= new Capuccino();
		C= new Arequipe(C);
		C=new Ron(C);
		C=new Azucar(C);
		System.out.println("SU ORDEN:");
        System.out.println(C.getNombre());
		System.out.println("el precio es :" + C.getprecio());
	}

}
