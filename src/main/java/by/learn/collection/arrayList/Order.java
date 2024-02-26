package by.learn.collection.arrayList;

import java.util.Objects;
import java.util.StringJoiner;

public class Order {
    private long orderId;
    private double amount;

    public Order() {
    }

    public Order(long orderId, double amount) {
        this.orderId = orderId;
        this.amount = amount;
    }

    public long getOrderId() {
        return orderId;
    }

    public void setOrderId(long orderId) {
        this.orderId = orderId;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Order order = (Order) o;
        return orderId == order.orderId && Double.compare(order.amount, amount) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(orderId, amount);
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", Order.class.getSimpleName() + "[", "]")
                .add("orderId=" + orderId)
                .add("amount=" + amount)
                .toString();
    }
}
