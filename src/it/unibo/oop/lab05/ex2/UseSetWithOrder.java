package it.unibo.oop.lab05.ex2;

import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

/**
 * 
 */
public final class UseSetWithOrder {

	public final static int SIZE=100;
	
    private UseSetWithOrder() {
    }

    /**
     * @param args
     *            ignored
     */
    public static void main(final String[] args) {
        /*
         * Write a program which:
         * 
         * 1) Creates a new ORDERED TreeSet of Strings. To order the set, define
         * a new Comparator in a separate class.
         * 
         * 2) Inserts in the set a hundred strings containing randomly generated
         * numbers (use Math.random())
         * 
         * 3) Prints the set, which must be ordered
         */
    	
    	
    	final Set<String> tree = new TreeSet<>(new LessicoGraficoCompare());
    	int i = 0;
    	
    	while(i != SIZE) {
    		tree.add(Double.toString(Math.random()));
    		i++;
    	}
   
    	System.out.println(tree);
    	    	
    }

	
}
