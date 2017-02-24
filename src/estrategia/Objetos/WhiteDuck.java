package estrategia.Objetos;

import estrategia.comportamientos.RepublicanQuack;
import estrategia.comportamientos.canfly;

public class WhiteDuck extends Duck {

	
	public WhiteDuck() {
		super.behavior=new canfly();
		super.Cuack= new RepublicanQuack();
	
	}

	@Override
	public void fly() {
		super.behavior.fly();
		
	}
	
	public void quack() {
		super.Cuack.quack();
	}
	
	

}
