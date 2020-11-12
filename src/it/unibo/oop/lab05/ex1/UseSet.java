package it.unibo.oop.lab05.ex1;

import java.util.Set;
import java.util.TreeSet;

/**
 * Example class using {@link Set}.
 *
 */
public final class UseSet {
	public static final int SIZE = 20;
    private UseSet() {
    }

    /**
     * @param args
     *            ignored
     */
    public static void main(final String[] args) {

        /*
         * Considering the content of "UseCollection, write a program which, in
         * order:
         *
         * 1) Builds a TreeSet containing Strings
         *
         * 2) Populates such Collection with all the Strings ranging from "1" to
         * "20"
         *
         * 3) Prints its content
         *
         * 4) Removes all those strings whose represented number is divisible by
         * three
         *
         * 5) Prints the content of the Set using a for-each costruct
         *
         * 6) Verifies if all the numbers left in the set are even
         */


    	//1)
    	final Set<String> tree = new TreeSet<>();
    	//2)
    	for (int i = 1; i <= SIZE; i++ ) {
    		tree.add(Integer.toString(i));
    	};
    	//3)
    	System.out.println(tree);
    	//4)
    	 do{
    		if(Integer.parseInt(tree.iterator().next()) % 3 == 0) {
    			tree.iterator().remove();
    		}
    	}while(tree.iterator().hasNext());
    	//5)
		for(String s : tree) {
			System.out.println(s);
		}

		//6)
		final Set<String> bpTree = new TreeSet<>();
		
		for(String s : tree) {
			if(Integer.parseInt(s) % 2 == 0) {
				bpTree.add(s);
			}
		}
		
		System.out.println(bpTree.containsAll(tree));
    }
}
