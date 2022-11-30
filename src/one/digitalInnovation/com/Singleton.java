package one.digitalInnovation.com;

public class Singleton {
	private static Singleton instancia;
	
	private Singleton() {
		super();
		
	}

	
	public static Singleton getIntancia() {
		if(instancia == null) {
			instancia = new Singleton();
		}
		return instancia;
	}
}
