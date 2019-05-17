package temperatura;

import java.util.Scanner;

public class CalculaTemperatura {
	public static void main(String[] args) {
		Scanner s = new Scanner (System.in);

		double a = 0;
		double l = 0;
		System.out.println("Digite o valor em celsius a ser convertido em fahrenheit");
	
		a = s.nextDouble();
		l = ( 9 * a + 160);
		
		System.out.println("temperatura em celsius é " + a);
		System.out.println(" temperatura em fahrenheit é " + l);

	}

}
