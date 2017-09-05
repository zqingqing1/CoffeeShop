package Model;

import java.util.LinkedList;
import java.util.List;

public class CoffeeAttendent {
	private List<Customer> list;
	private List<Order> completedOrders;
	
	
	public CoffeeAttendent() {
		list = new LinkedList<>();
		completedOrders=new LinkedList<>();
		
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
		double timetaken = Math.random()*10;
		try{
			Thread.sleep((long)(timetaken)*1000);
			completedOrders.add(order);
			System.out.println(order.getName()+"'s order is completed");
		}catch(InterruptedException e){
			System.out.println("Order failed to prepared...");
		}
	}
	
	public void callOut(){
		Customer c = null;
		for(Order o:completedOrders){
			System.out.println(o.getName()+"'s order is being calling...");
			for(Customer w:list){
				System.out.println(w.getName()+" been called");	
				if(w.orderReady(o)){
					c = w;
				}
			}
			list.remove(c);
		}
	
	}
}
