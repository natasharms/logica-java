package entities;

import enums.OrderStatus;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Order {

    private static final SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

    /////////////////////////////////////////// ATRIBUTOS BÁSICOS
    private Date moment;
    private OrderStatus status;
    /////////////////////////////////////////// ASSOCIAÇÕES
    private Client client;
    private List<OrderItem> items = new ArrayList<>();

    /////////////////////////////////////////// CONTRUTORES, GETTERS E SETTERS

    public Order(Date moment, OrderStatus status, Client client) {
        this.moment = moment;
        this.status = status;
        this.client = client;
    }

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

    /////////////////////////////////////////// MÉTODOS

    public void addItem (OrderItem item){
        items.add(item);
    }

    public void removeItem (OrderItem item){
        items.remove(item);
    }

    public double total(){

        double sum = 0.0;
        for (OrderItem item: items){
            sum += item.subTotal();
        }

        return sum;
    }

    /////////////////////////////////////////// IMPRESSÃO


    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("Order moment: ").append(sdf.format(moment));
        sb.append("\nOrder status: ").append(status);
        sb.append("\nClient: ").append(client);
        sb.append("\nOrder items: ");
            for (OrderItem item : items){
                sb.append("\n").append(item);
            }
        sb.append("\nTotal price: $").append(String.format("%.2f", total()));

        return sb.toString();
    }
}
