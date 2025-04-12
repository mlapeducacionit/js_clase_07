package ar.com.educacionit.main;

import java.util.HashSet;
import java.util.Iterator;

public class SetMain2 {

	public static void main(String[] args) {
		
		// creo
		HashSet<Integer> edades = new HashSet<>();
		
		boolean agrego = edades.add(1);
		System.out.println(agrego);
		agrego = edades.add(3);
		System.out.println(agrego);
		agrego = edades.add(5);
		System.out.println(agrego);
		
		if ( agrego ) {
			System.out.println("5 agregado");
		}
		
		agrego = edades.add(3);
		
		if ( agrego ) {
			System.out.println("Se agrego 3");
		} else {
			System.out.println("3 no se agregó");
		}
		
		// recorrer un set
		/* for (Integer edad : edades) {
			System.out.println(edad);
		} */
		
		// eliminar de uno
		/* for (Integer i : edades) {
			// System.out.println(i);
			edades.remove(i);
		} */
		
		/* while(!edades.isEmpty()) {
			edades.remove(edades);
		}*/ 
		System.out.println("-------------");
		
		boolean contiene = edades.contains(40);
		System.out.println("Edades " + (contiene ? "Contiene al 40" : "No contiene al 40"));
		
		contiene = edades.contains(1);
		System.out.println("Edades " + (contiene ? "Contiene al 1" : "No contiene al 1"));
		
		System.out.println("-------------");
		Iterator<Integer> itEdades = edades.iterator();
		while (itEdades.hasNext()) {
			itEdades.next();
			itEdades.remove();
		}
		
		System.out.println("Hay " + edades.size() + " edades");
		
				
		System.out.println("FIN");
				
	}

}
