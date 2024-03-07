package utilities;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Arrays;

public class Purchase {
    private String purchaseType;
    private String item;
    private LocalDateTime dateTime;
    private String client;
    private double totalValue;
    private String paymentMethod;
    private LocalDate checkInDate;
    private LocalDate checkOutDate;
    private LocalDate departureDate;

    //Construtor para criar um produto
    public Purchase(String purchaseType, String item, String client, LocalDateTime dateTime, double totalValue,
                    String paymentMethod, LocalDate checkInDate, LocalDate checkOutDate, LocalDate departureDate) {
        this.purchaseType = purchaseType;
        this.item = item;
        this.client = client;
        this.dateTime = dateTime;
        this.totalValue = totalValue;
        this.paymentMethod = paymentMethod;

        if (purchaseType.equals("ticket")) {
            this.departureDate = departureDate;
        } else if (purchaseType.equals("roomstay")) {
            this.checkInDate = checkInDate;
            this.checkOutDate = checkOutDate;
        }
    }
   //Método para retornar os produtos do carrinho de compras
    @Override
    public String toString() {
        String purchaseDetails = "Purchase{" +
                "purchaseType='" + purchaseType + '\'' +
                ", item='" + item + '\'' +
                ", dateTime=" + dateTime +
                ", client='" + client + '\'' +
                ", totalValue=" + totalValue +
                ", paymentMethod='" + paymentMethod + '\'';

        if (purchaseType.equals("ticket")) {
            purchaseDetails += ", departureDate=" + departureDate;
        } else if (purchaseType.equals("roomstay")) {
            purchaseDetails += ", checkInDate=" + checkInDate +
                    ", checkOutDate=" + checkOutDate;
        }

        purchaseDetails += '}';
        return purchaseDetails;
    }
}
