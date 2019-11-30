import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;

public class PruebaMetodosBusqueda {

	public static void main(String[] args) {
		
		ArrayList<Integer> listaNumeros = new ArrayList<>();
		listaNumeros.add(80);
		listaNumeros.add(3);
		listaNumeros.add(54);
		listaNumeros.add(2);
		listaNumeros.add(-76);
		
		System.out.println(listaNumeros);
		Collections.sort(listaNumeros);
		System.out.println(listaNumeros);
		
		ArrayList<Double> listaNumeros2 = new ArrayList<>();
		listaNumeros2.add(80.5);
		listaNumeros2.add(3.43);
		listaNumeros2.add(54.23);
		listaNumeros2.add(2.43);
		listaNumeros2.add(-76.34);
		
		System.out.println(listaNumeros2);
		Collections.sort(listaNumeros2);
		System.out.println(listaNumeros2);
		
		ArrayList<String> listaNombres = new ArrayList<>();
		listaNombres.add("Luke Skywalker");
		listaNombres.add("Leia Organa");
		listaNombres.add("Obi Wan Kenobi");
		listaNombres.add("Yoda");
		listaNombres.add("Anakin Skywalker");
		
		System.out.println(listaNombres);
		Collections.sort(listaNombres);
		System.out.println(listaNombres);
		
		System.out.println("===============");
		
		Collections.reverse(listaNumeros);
		System.out.println(listaNumeros);
		
		Collections.reverse(listaNombres);
		System.out.println(listaNombres);
		
		//implements Comparable y convertir a Rapper para usar CompareTo(o.edad)
		
		Random rnd = new Random();
		
		Scanner entrada = new Scanner(System.in);
		MetodosBusqueda mo = new MetodosBusqueda();

		int []v1 = new int[100];
		
		System.out.println("Generando cadena...");
		
		for(int i = 0; i < v1.length; i++) {
			v1[i] = rnd.nextInt(100);
		}

		Arrays.sort(v1);
		System.out.println(Arrays.toString(v1));
		
		int op = 0;
		int cont = 0;
		int resultado;
		
		do{
			System.out.println("1)Busqueda Binaria \n2)Busqueda Secuencial \n3)Salir\n-----------------------------");
			op = entrada.nextInt();
			System.out.println("Que elemento deceas buscar?");
			int elementoA_buscar = entrada.nextInt();
			switch(op) {
	
				case 1 :
					mo.limpiarContadores();
					resultado = MetodosBusqueda.BusquedaBinario.busquedaBinaria(v1, 0, v1.length, elementoA_buscar);
					if(resultado == -1) {
						System.out.println("No se encontro");
					}else {
						System.out.println("Encontrado!");
					}
					mo.mostrarEficiencia();
					break;
				case 2 :
					
					break;
				case 3 :
					cont ++;
					break;
			}
		}while(cont<1);
		System.out.println("Nos vemos");
	}
}
