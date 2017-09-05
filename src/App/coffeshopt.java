package App;

import java.util.LinkedList;
import java.util.List;

import Model.CoffeeAttendent;
import Model.Customer;
import Model.Order;

public class coffeshopt {

	public static void main(String[] args) {
		CoffeeAttendent ca = new CoffeeAttendent();
		Customer c1 = new Customer("Bob");
		Customer c2 = new Customer("Alice");
		Customer c3 = new Customer("Lily");
		
		Order o1 = new Order(c1.getName());
		Order o2 = new Order(c2.getName());
		Order o3 = new Order(c3.getName());
		
		List<String> l1= new LinkedList<>();
		l1.add("espresso"); l1.add("lemone");
		List<String> l2= new LinkedList<>();
		l2.add("Mocha"); l2.add("orange juice");
		List<String> l3= new LinkedList<>();
		l3.add("Latte"); 
		
		
		ca.takeOrder(c1, o1, l1);
		ca.takeOrder(c2, o2, l2);
		ca.takeOrder(c3, o3, l3);
		
		ca.prepareDrink(o1);
		ca.prepareDrink(o2);
		ca.prepareDrink(o3);
		
		ca.callOut();
		
		
	}

}
