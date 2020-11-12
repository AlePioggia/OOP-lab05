package it.unibo.oop.lab05.ex2;

import java.util.*;

public class LessicoGraficoCompare implements Comparator<String>{

	public int compare(String o1, String o2) {
		//Ordine lessicografico
		return Double.compare(Double.parseDouble(o1), Double.parseDouble(o2));
	}
	
	

	
	

	
}
