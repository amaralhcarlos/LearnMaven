package br.com.alura.maven;

public class Product {

	private final String name;
	private final double price;

	public Product(String name, double price) {
		super();
		this.name = name;
		this.price = price;
	}

	@Override
	public String toString() {
		return "Product [name=" + name + ", price=R$" + price + "]";
	}

	public double getPriceWithTax() {
		// TODO Auto-generated method stub
		return this.price * 1.10;
	}

}
