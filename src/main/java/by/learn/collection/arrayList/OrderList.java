package by.learn.collection.arrayList;

import java.util.List;
import java.util.StringJoiner;

public class OrderList {
    private List<Order> orders;

    public OrderList() {
    }

    public OrderList(List<Order> orders) {
        this.orders = orders;
    }

    public List<Order> getOrders() {
        return orders;
    }

    public void setOrders(List<Order> orders) {
        this.orders = orders;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", OrderList.class.getSimpleName() + "[", "]")
                .add("orders=" + orders)
                .toString();
    }
}
