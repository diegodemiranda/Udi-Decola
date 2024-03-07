package repository;

import flights.FlightLeg;
import java.util.ArrayList;

public class FlightLegRepo {
  
  private ArrayList<FlightLeg> flightLegs;

  public FlightLegRepo(){
    this.flightLegs = new ArrayList<>();
  }

  public void saveNewFlightLeg(FlightLeg flightLeg){
    flightLegs.add(flightLeg);
  }

  public FlightLeg getFlightLeg(String identifierCode){
    for (FlightLeg flightL : flightLegs){
      if(flightL.getIdentifierCode().equals(identifierCode))
        return flightL;
    }
    return null;
  }

  public boolean removeFlightLeg(String identifierCode){
    for(int i = 0; i < flightLegs.size(); i++){
      FlightLeg flightL = flightLegs.get(i);
      if(flightL.getIdentifierCode().equals(identifierCode)){
        flightLegs.remove(i);
        return true;
      }
    }
    return false;
  }

  public void eraseAllFlightLegs(){
    flightLegs.clear();
  }
  
  public ArrayList<FlightLeg> getFlightLegs(){
    return new ArrayList<>(flightLegs);
  }

  public void showFlightLegs(FlightLegRepo repository) {
    for (FlightLeg cia : repository.getFlightLegs())
      System.out.println(cia);
}

}
