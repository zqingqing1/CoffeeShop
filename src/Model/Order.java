package Model;

import java.util.Date;
import java.util.LinkedList;
import java.util.List;

public class Order {
	private List<String> ordered;
	private String name;
	private Date date;
	
	public Order(String name) {
		this.ordered = new LinkedList<>();
		this.name = name;
		this.date = null;
	}
	
	
	public void orderDrink(String drink){
		ordered.add(drink);	
	}
	
	public void stopOrder(){
		date = new Date();
		System.out.println(date.toString()+" "+name+" ordered:");
		for(String drink:ordered)
			System.out.println(drink);
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}
	
}
