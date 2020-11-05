package es.studium.Potencia;

import java.util.Scanner;

public class Potencia
{
	public static void main(String[] args)
	{
		int base, exponente, resultado, i;
		resultado = 1;
		// Creamos el objeto Scanner conectado al teclado
		Scanner teclado = new Scanner(System.in);
		System.out.println("Dame la base:");
		base = teclado.nextInt();
		System.out.println("Dame el exponente:");
		exponente = teclado.nextInt();
		teclado.close();
		for(i=1;i<=exponente;i++)
		{
			resultado = resultado * base;
		}
		System.out.println("El número " + base + " elevado a " + exponente + " vale " + resultado);
	}
}