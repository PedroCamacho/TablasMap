import java.util.HashMap;
import java.util.Map;

public class Ejemplo1 {
	public static void main(String[] args) {

		Map<String, Integer> notas = new HashMap<>();
		notas.put("Antonio", 7);
		notas.put("Pedro", 9);
		notas.put("Luis", 10);
		notas.put("Marco", 7);
		notas.put("María", 4);
		notas.put("Ana", 10);

		System.out.println("La nota de Pedro es: " + notas.get("Pedro"));

		System.out.println("¿Está María?: " + notas.containsKey("María"));

		double media = 0;
		for (Integer nota : notas.values()) {
			media += nota;
		}
		System.out.printf("La nota media es %1.2f\n", media / notas.size());

		for (Map.Entry<String, Integer> par : notas.entrySet()) {
			System.out.println(par.getKey() + " -> " + par.getValue());
		}
	}

}
