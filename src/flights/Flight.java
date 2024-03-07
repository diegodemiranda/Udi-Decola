package flights;

import accounts.AccountAirline;

public class Flight{
  private String identifierCode;
  private AirportLocation origin;
  private AirportLocation destination;
  private String departureTime;
  private String arrivalTime;
  private String flightDate;
  private AccountAirline airline;
  private FlightLeg flightLeg;
  private int availableSeats;
  private double ticketPrice;

  public Flight(String identifierCode, AirportLocation origin, AirportLocation destination, String departureTime, String arrivalTime, String flightDate, 
  AccountAirline airline, FlightLeg flightLeg, int availableSeats, double ticketPrice){
    this.identifierCode = identifierCode;
    this.origin = origin;
    this.destination = destination;
    this.departureTime = departureTime;
    this.arrivalTime = arrivalTime;
    this.flightDate = flightDate;
    this.airline = airline;
    this.flightLeg = flightLeg;
    this.availableSeats = availableSeats;
    this.ticketPrice = ticketPrice;
  }

  public void setIdentifierCode(String identifierCode){
    this.identifierCode = identifierCode;
  }
  public String getIdentifierCode(){
    return identifierCode;
  }

  public void setOrigin(AirportLocation origin){
    this.origin = origin;
  }
  public AirportLocation getOrigin(){
    return origin;
  }
  
  public void setDestination(AirportLocation destination){
    this.destination = destination;
  }
  public AirportLocation getDestination(){
    return destination;
  }

  public void setDepartureTime(String departureTime){
    this.departureTime = departureTime;
  }
  public String getDepartureTime(){
    return departureTime;
  }

  public void setArrivalTime(String arrivalTime){
    this.arrivalTime = arrivalTime;
  }
  public String getArrivalTime(){
    return arrivalTime;
  }

  public void setFlightDate(String flightDate){
    this.flightDate = flightDate;
  }
  public String getFlightDate(){
    return flightDate;
  }

  public void setAirline(AccountAirline airline){
    this.airline = airline;
  }
  public AccountAirline getAirline(){
    return airline;
  }

  public void setFlightLeg(FlightLeg flightLeg){
    this.flightLeg = flightLeg;
  }
  public FlightLeg getFlightLeg(){
    return flightLeg;
  }

  public void setAvailableSeats(int availableSeats){
    this.availableSeats = availableSeats;
  }
  public int getAvailableSeats(){
    return availableSeats;
  }

  public void setTicketPrice(double ticketPrice){
    this.ticketPrice = ticketPrice;
  }
  public double getTicketPrice(){
    return ticketPrice;
  }

  public double adjustTicketPrice(double eventFactor){
    return this.ticketPrice *= eventFactor;
  }

}
