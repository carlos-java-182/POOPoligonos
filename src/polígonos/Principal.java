package polígonos;

import java.util.ArrayList;
import java.util.Scanner;

public class Principal {

	static ArrayList<Poligono> poligono = new ArrayList<Poligono>();
	static Scanner entrada = new Scanner(System.in);

	public static void main(String[] args) {

		llenarPoligono();
		
		//Mostrar datos de cada polígino
		
		mostrarResultados();
		
		

	}

	// Llenar polígono

	public static void llenarPoligono() {

		char respuesta;
		int opcion;
		do {

			do {
				System.out.println("Digite el polígono que desea");
				System.out.println("1.- Triángulo");
				System.out.println("2.- Rectángulo");
				System.out.println("Digite la opcion: ");
				opcion = entrada.nextInt();
			} while (opcion < 1 || opcion > 2);

			switch (opcion) {
			case 1:
				llenarTriangulo();
				break;
			case 2:
				llenarRectangulo();
				break;
			}

			System.out.println("Desea digitar otro polígono: s/n");
			respuesta = entrada.next().charAt(0);

			System.out.println("");

		} while (respuesta == 's' || respuesta == 'S');
	}

	// Llenar Triángulo

	public static void llenarTriangulo() {
		double lado1, lado2, lado3;

		System.out.println("Digite el lado 1: ");
		lado1 = entrada.nextDouble();
		System.out.println("Digite el lado 2: ");
		lado2 = entrada.nextDouble();
		System.out.println("Digite el lado 3: ");
		lado3 = entrada.nextDouble();

		Triangulo triangulo = new Triangulo(lado1, lado2, lado3);

		// Guardamos un triangulo dentro del arreglo de polígonos

		poligono.add(triangulo);
	}

	public static void llenarRectangulo() {
		double lado1, lado2;

		System.out.println("Digita el lado 1: ");
		lado1 = entrada.nextDouble();
		System.out.println("Digita el lado 2: ");
		lado2 = entrada.nextDouble();

		Rectangulo rectangulo = new Rectangulo(lado1, lado2);

		// Se guarda el rectangolo dentro del arreglo de polígonos

		poligono.add(rectangulo);

	}
	
	public static void mostrarResultados() {
		for(Poligono poli: poligono) {
			System.out.println(poli.toString());
			System.out.println("El área es: "+poli.area());
			System.out.println("");
		}
	}

}
