package estrategia.Objetos;

import estrategia.comportamientos.DemocratQuack;
import estrategia.comportamientos.cantfly;

public class WoodenDuck extends Duck{
	
	public WoodenDuck(){
		super.behavior=new cantfly();
		super.Cuack=new DemocratQuack();
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
