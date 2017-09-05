package Model;

import java.util.LinkedList;
import java.util.List;

public class CoffeeAttendent {
	private List<Customer> list;
	private Order completedOrder;
	
	
	public CoffeeAttendent() {
		this.list = new LinkedList<>();
		this.completedOrder = null;
	}

	public void takeOrder(Customer c,Order order,List<String> drinks){
		for(int i=0;i<drinks.size();i++)
			order.orderDrink(drinks.get(i));
		order.stopOrder();
		c.setDrinkOrdered(order);
		list.add(c);
	}
	
	public void prepareDrink(Order order){
		System.out.println("Order is preparing");
	}
	
	public void completeDrink(Order order){
		System.out.println("Order is done");
		completedOrder = order;
	}
	public void callOut(){
		Customer c = null;
		for(Customer w:list){
			System.out.println(w.getName()+" been called");	
			if(w.orderReady(completedOrder)){
				c = w;
			}
		}
	
		System.out.println(c.getName()+"'s order is finished");	
		list.remove(c);		
	}
}
