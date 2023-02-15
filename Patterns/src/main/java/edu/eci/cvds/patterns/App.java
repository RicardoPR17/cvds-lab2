package edu.eci.cvds.patterns;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		if (args.length == 0) {
			System.out.println("Hello World!");
		} else {
			String saludo = "Hello ";
			//Ciclo para anadir el nombre que ingresen
			for (int i = 0; i < args.length - 1; i++) {
				saludo += args[i] + " ";
			}
			saludo += args[args.length - 1];
			saludo += "!";
			System.out.println(saludo);
		}
	}
}
