package notas;

import java.util.Scanner;

/*
 * @author Miguel Ángel Padilla Bernabé
 * 
 * @version 1.0
 *
 */
public class califica {

	/**
	 * Método el cual nos pide un número de nota por teclado y en función de dicha nota
	 * nos muestra un mensaje(Suspenso, Aprobado, Notable y Sobresaliente).
	 */
	public static void califica() {
		// Objeto para pedir un dato numérico por teclado
		Scanner reader = new Scanner(System.in);
		// Variable nota inicializada
		int nota = 0;
		// Variable calificacion inicializada
		String calificacion = "";
		// Mensaje por pantalla
		System.out.print("Introduzca el valor de una calificación: ");
		// Asignamos el valor leido por teclado a la variable nota
		nota = reader.nextInt();
		// Si nota es mayor o igual a 0 y nota es menor que 5.
		if (nota >= 0 && nota < 5)
			// La variable que imprimimos por pantalla con el mensaje obtiene el valor "Suspenso"
			calificacion = "Suspenso";
		// Si nota es mayor o igual a 5 y nota es menor que 7.
		else if (nota >= 5 && nota < 7)
			// La variable que imprimimos por pantalla con el mensaje obtiene el valor "Aprobado"
			calificacion = "Aprobado";
		// Si nota es mayor o igual a 7 y nota es menor que 9.
		else if (nota >= 7 && nota < 9)
			// La variable que imprimimos por pantalla con el mensaje obtiene el valor "Notable"
			calificacion = "Notable";
		// Si nota es mayor o igual a 9 y nota es menor o igual que 10.
		else if (nota >= 9 && nota <= 10)
			// La variable que imprimimos por pantalla con el mensaje obtiene el valor "Sobresaliente"
			calificacion = "Sobresaliente";
		// Si nota es mayor o igual a cero y nota es menor que 5.
		else
			// La variable que imprimimos por pantalla con el mensaje obtiene el valor "El valor de la calificación introducida no es correcta"
			calificacion = "El valor de la calificación introducida no es correcta";
		// Imprimimos por pantalla la variable que contiene el mensaje con la calificación.
		System.out.println(calificacion);
		// Cerramos el objeto Scanner "reader"
		reader.close();
	}

}
