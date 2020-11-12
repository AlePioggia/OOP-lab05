package it.unibo.oop.lab05.ex3;

import java.util.HashSet;
import java.util.Set;

public class WarehouseImpl implements Warehouse {

	public static final int EMPTY = 0;
	
	private final Set<Product> products = new HashSet<>();
	
	public WarehouseImpl() {
	}

	public void addProduct(Product p) {
			this.products.add(p);
	}

	public Set<String> allNames() {
		Set<String> prodBackup = new HashSet<>();
		for(final Product p : this.products) {
			prodBackup.add(p.getName());
		}
		return prodBackup;
	}

	public Set<Product> allProducts() {
		return new HashSet<>(this.products);
	}

	public boolean containsProduct(Product p) {
		return products.contains(p);
	}

	@Override
	public double getQuantity(String name) {
		
		for(final var p : this.products) {
			if(p.getName().equals(name)) {
				return p.getQuantity();
			}
		}
		return EMPTY;
	}

}
