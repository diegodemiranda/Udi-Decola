package utilities;

import java.util.ArrayList;
import java.util.List;
import java.time.LocalDate;

public class ShoppingCart {
    public List<Purchase> purchases;
    private int points;

    //Construtor para criar um carrinho de compras
    public ShoppingCart() {
        this.purchases = new ArrayList<>();
        this.points = 0;
    }
   //Método para criar adicionar um produto ao carrinho de compras
    public void addAirlineTicket(String ticket, String client, double totalValue, String paymentMethod,
                                 double commission) {
        double finalValue = totalValue - (totalValue * commission);
        purchases.add(new Purchase("ticket", ticket, client, null, finalValue, paymentMethod, null, null, null));
        points++;
    }
    //Método para criar adicionar um produto ao carrinho de compras
    public void addHotelRoomStay(String roomStay, String client, double totalValue, String paymentMethod,
                                 double commission, LocalDate checkInDate, LocalDate checkOutDate) {
        double finalValue = totalValue - (totalValue * commission);
        purchases.add(new Purchase("roomstay", roomStay, client, null, finalValue, paymentMethod, checkInDate,
                checkOutDate, null));
        points++;
    }
//Método para retornar os produtos do carrinho de compras
    public int getPoints() {
        return points;
    }
}
