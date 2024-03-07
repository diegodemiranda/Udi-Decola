package flights;

import java.util.ArrayList;
import accounts.AccountAirline;

public class FlightLeg {
  private String identifierCode;
  private AirportLocation origin;
  private AirportLocation destination;
  private String departureTime;
  private String arrivalTime;
  private String flightDate;
  private AccountAirline airline;
  private ArrayList<Flight> flights;

  public FlightLeg(String identifierCode, AirportLocation origin, AirportLocation destination, String departureTime, String arrivalTime, String flightDate, AccountAirline airline){
    this.identifierCode = identifierCode;
    this.origin = origin;
    this.destination = destination;
    this.departureTime = departureTime;
    this.arrivalTime = arrivalTime;
    this.flightDate = flightDate;
    this.airline = airline;
    this.flights = new ArrayList<>();
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

  public void addFlights(Flight flight){
    flights.add(flight);
    flight.setFlightLeg(this);
  }

  public ArrayList<Flight> getFlights(){
    return flights;
  }

  public void showFlights(FlightLeg flightLeg) {
    System.out.println("\nFlights of flight leg: " + flightLeg.getIdentifierCode());
    for (Flight flight : flightLeg.getFlights()) {
      System.out.println("\nFlight code: " + flight.getIdentifierCode() +
        ", \nAirline: " + flight.getAirline().getOfficialName() +
        ", \nDate: " + flight.getFlightDate() +
        ", \nOrigin: " + flight.getOrigin() +
        ", \nDestination: " + flight.getDestination() +
        ", \nDeparture time: " + flight.getDepartureTime() +
        ", \nArrival time: " + flight.getArrivalTime() +
        ", \nAvailable seats: " + flight.getAvailableSeats() +
        ", \nTitcket price: R$ " + flight.getTicketPrice());
    }
    System.out.println();
}

  public String toString(){
    return "Flight leg: {" + "Identifier code = " + getIdentifierCode() + "; Origin and destination: " + getOrigin() + " to " + getDestination() + "; Departure and arrival time: " + getDepartureTime() + " and " + getArrivalTime() + "; Date: " + getFlightDate() + "}";
  }
}
