package outils_libre_lab;

import java.util.List;

class Order {
    private Customer customer;
    private List<Item> items;
    public Order(Customer customer, List<Item> items) {
        this.customer = customer;
        this.items = items;
    }
    public Customer getCustomer() {
        return customer;
    }

    public List<Item> getItems() {
        return items;
    }
}
