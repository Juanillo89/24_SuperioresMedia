package superioresMedia;

import java.util.Scanner;

public class SuperioresMedia
{
	
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		float[] numeros = new float[20];
		float suma = 0;
		for(int i = 0; i < numeros.length; i++)
		{
			System.out.print("Número: ");
			numeros[i] = sc.nextFloat();
			suma += numeros[i];
		}
		sc.close();
		System.out.println("La media es " + (suma / 20) + ".");
		System.out.println("Los siguientes números superan la media:");
		for(int i = 0; i < numeros.length; i++)
		{
			if(numeros[i] > (suma / 20))
				System.out.println(numeros[i]);
		}
	}
}

