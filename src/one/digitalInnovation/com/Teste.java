package one.digitalInnovation.com;

public class Teste {
	
	
//principal instancia o resto do projeto
	public static void main(String[] args) {

		Singleton lazy = Singleton.getIntancia();
		System.out.println(lazy);


		SingletonEager eager = SingletonEager.getInstancia();
		System.out.println(eager);


	SingletonLazyHolder holder = SingletonLazyHolder.getInstancia();
	System.out.println(holder);

	
	}

}
