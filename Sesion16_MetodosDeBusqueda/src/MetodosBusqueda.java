/*
 * FRAMEWORK COLLECTIONS JAVA
 * 
 * INTERFACES
 * 		SET --> No se permiten duplicados
 * 		List -> Si se permiten duplicados
 * 		MAP --> conjunto elementos, pares CLAVE-VALOR, no permite duplicados de claves
 * 
 * 	IMPLEMENTACIONES
 * 		SET --> HashSet, TreeSet, LinkedHashSet
 * 		List -> ArrayList, LinkedList
 * 		MAP --> HashMao, LinkedHashMap, TreeMap
 * 
 * 	PYTHON
 * 		LISTAS [] = LIST java
 * 		TUPLAS () = SET java
 * 		DICCIONARIOS {} = MAP java
 * 
 * 	Class
 * 		Vector
 * 		Que
 * 		Deque
 * 		Stack
 * 
 * Arrays.sort = QuickSort - solo vectores
 * Collections.sort(list) = MERGSORT 
 * 
 * ------------------------------------
 * 
 * 	PYTHON
 * 		Listas [] = LIST java
 * 		TUPLAS () = SET java
 * 		Diccionarios {} MAP java
*/

import java.util.Arrays;

public class MetodosBusqueda {

	static long tInicio;
	static long tFin;
	static long tiempo;
	static int contVueltas;
	static int contComparaciones;
	
	public static class BusquedaBinario{
		
		public static int busquedaBinaria(int vector[], int posicionIzq, int posicionDer, int elementoA_Buscar) {
			
			tInicio = System.currentTimeMillis();
			
			if(posicionDer >= posicionIzq){
				
				contComparaciones++;
				
				int mitad = posicionIzq + (posicionDer - posicionIzq) / 2;
				
				if(vector[mitad] > elementoA_Buscar) {
					contVueltas++;
					return busquedaBinaria(vector, posicionIzq, mitad - 1, elementoA_Buscar);
					
				}else {
					contVueltas++;
					return busquedaBinaria(vector, mitad + 1 , posicionDer, elementoA_Buscar);
				}
			}
			
			tFin = System.currentTimeMillis();	
			return -1;
		}
	}
	
	public static class 
	
	public void limpiarContadores() {
		tInicio = 0;
		tFin = 0;
		contComparaciones = 0;
		contVueltas = 0;
	}
	
	//Metodo para imprimir el vector
		public void mostrarEficiencia() {
			System.out.println("Tiempo de procesamiento: " + (tFin-tInicio));
			System.out.println("Vueltas: " + contVueltas);
			System.out.println("Comparaciones: " + contComparaciones);
			System.out.println();
		}
}
