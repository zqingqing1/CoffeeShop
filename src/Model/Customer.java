package Model;

public class Customer implements WaitingCustomer{
	private String name;
	private Order drinkOrdered;
	

	public Customer(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public Order getDrinkOrdered() {
		return drinkOrdered;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setDrinkOrdered(Order drinkOrdered) {
		this.drinkOrdered = drinkOrdered;
	}
	
	public boolean orderReady(Order o){
		if(o.equals(drinkOrdered)){
			exitStore();
			return true;
		}
		else
			return false;
	}
	
	public void exitStore(){
		System.out.println(name+": Thanks you, I've received my order, and leaving now");
	}

}
