package Project;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Order{
    private Map<Customer, List<OrderItem>> customerOrderItems;

    public Order() {
        customerOrderItems = new HashMap<>();
    }
    //thêm đơn hàng vào danh sách đã mua hoặc mua
    public void addOrder(Customer customer, OrderItem orderItem) {
        List<OrderItem> orderItems = customerOrderItems.getOrDefault(customer, new ArrayList<>());
        orderItems.add(orderItem);
        customerOrderItems.put(customer, orderItems);
    }

    // public List<OrderItem> getOrder(Customer customer) {
    //     return customerOrderItems.getOrDefault(customer, new ArrayList<>());
    // }

    public void printOrder(Customer customer) {
        int i = 1;
        List<OrderItem> orderItems = customerOrderItems.getOrDefault(customer, new ArrayList<>());
        for (OrderItem orderItem : orderItems) {
            System.out.println("Don hang " + (i++) + ": " + orderItem.toString());
        }
    }
}