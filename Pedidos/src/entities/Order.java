package entities;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Order {
	
	private Date moment;
	private OrderStatus status;
	private Client client;
	
	private List<OrderItem> items = new ArrayList<>();
	
	public Order(Date moment, OrderStatus status, Client client) {
		this.moment = moment;
		this.status = status;
		this.client = client;
	}

	public Order() {
	}

	private static final SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

	public Date getMoment() {
		return moment;
	}

	public void setMoment(Date moment) {
		this.moment = moment;
	}

	public OrderStatus getStatus() {
		return status;
	}

	public void setStatus(OrderStatus status) {
		this.status = status;
	}

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	public List<OrderItem> getItems() {
		return items;
	}

	public void addItem (OrderItem item) {
		items.add(item);
	}
	
	public void removeItem(OrderItem item) {
		items.remove(item);
	}
	
	public double total () {
		double sum = 0.0;
		for (OrderItem item : items) {
			sum = sum + item.Subtotal();
		}
		return sum;
	}
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("ORDER SUMMARY: \nOrder moment: " + sdf.format(moment));
		sb.append("\nOrder status: " + status);
		sb.append("\nClient: " + client);
		sb.append("\nOrder items:\n");
		for (OrderItem item : items) {
		sb.append(item + "\n");
		
		}
		sb.append("\nTotal price: $" + String.format("%.2f", total()));
		return sb.toString();
	}
}
