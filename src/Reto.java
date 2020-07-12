import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Reto {

	public static void main(String[] args) {
		// Inicialización
		Scanner sc = new Scanner(System.in);
		HashMap<Integer, Integer> numeros = new HashMap<>(); //Numero-Frecuencia
		String numeroLargo;
		Integer digito;
		
		// Proceso
		System.out.print("Introduzca el número largo: ");
		numeroLargo = sc.next();
		for (int i = 0; i < numeroLargo.length(); i++) {
			digito = Character.getNumericValue(numeroLargo.charAt(i));
			if (numeros.containsKey(digito))
				numeros.put(digito, numeros.get(digito)+1);
			else
				numeros.put(digito, 1);
		}

		// Salida
		for (Map.Entry<Integer, Integer> par : numeros.entrySet()) {
			System.out.println(par.getKey() + " -> " + par.getValue());
		}

	}
}
