package estrategia.Objetos;

import estrategia.comportamientos.DemocratQuack;
import estrategia.comportamientos.cantfly;

public class RuberDuck extends Duck {

	public RuberDuck() {
		super.behavior=new cantfly();
		super.Cuack= new DemocratQuack();
	
	}

	@Override
	public void fly() {
		super.behavior.fly();
		
	}

	@Override
	public void quack() {
	super.Cuack.quack();
		
	}

	
}
