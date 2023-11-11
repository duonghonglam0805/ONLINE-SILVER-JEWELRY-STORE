package Project;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class OrderItem {
    private Products product;
    private int quantityOrder;
    private String address;
    private String payment;
    private String date;
    private double price;
    
    public OrderItem(){}

    public OrderItem(Products product, int quantityOrder, String address, String payment, String date, double price){
        this.product = product;
        this.quantityOrder = quantityOrder;
        this.address = address;
        this.payment = payment;
        this.date = date;
        this.price = price;
    }



    public static String getDate(){
        LocalDateTime currentDateTime = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        String formattedDateTime = currentDateTime.format(formatter);
        return formattedDateTime;
    }
}