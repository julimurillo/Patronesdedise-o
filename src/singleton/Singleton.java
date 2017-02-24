package singleton;

public class Singleton {
	private volatile static Singleton instance;
	
	public static Singleton getSingleton(){
		if(instance==null){
			synchronized(Singleton.class){
				if (instance==null) {
					instance= new Singleton();
				}
			}
		}
		
		return instance;
	}
}

