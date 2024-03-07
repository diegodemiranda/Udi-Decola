package flights;

public class AirportLocation {
  private String city;
  private String airport;

  public AirportLocation(String city, String airport){
    this.city = city;
    this.airport = airport;
  }

  public void setCity(String city){
    this.city = city;
  }
  public String getCity(){
    return city;
  }

  public void setAirport(String airport){
    this.airport = airport;
  }
  public String getAirport(){
    return airport;
  }

  @Override
  public String toString(){
    return city + " - " + airport;
  }
}
