package estrategia.Objetos;

import estrategia.comportamientos.Flyable;
import estrategia.comportamientos.Quackable;

public abstract class Duck {

	protected Flyable behavior;
	protected Quackable Cuack;
	
	public abstract void fly();
	public abstract void quack();
}
