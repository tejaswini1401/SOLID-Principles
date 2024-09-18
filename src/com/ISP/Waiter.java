//Interface Segression Principle : Interfaces should be such, that clients should not implement unnecessary functions they do not need
package com.ISP;

interface RestaurantEmployees{
	public void washDishes();
	public void serveCustomers();
	public void cookFood();
}
/*
public class Waiter implements RestaurantEmployees{
	
	@Override
	public void washDishes() {
		//not my job
	}
	
	@Override
	public void serveCustomers() {
		System.out.println("Serving the customer");
	}
	
	@Override
	public void cookFood() {
		//not my jobb
	}
}
*/

interface HelperInterface{
	public void washDishes();
}
interface WaiterInterface{
	public void serveCustomers();
	public void takeOrders();
}
interface ChefInterface{
	public void cookFood();
}


class Waiter implements WaiterInterface{
	
	@Override
	public void serveCustomers() {
		System.out.println("Serving the customers");
	}
	
	@Override
	public void takeOrders() {
		System.out.println("Taking the  orders");
	}
}
