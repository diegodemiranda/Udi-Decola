package repository;

import accounts.AccountAirline;
import java.util.ArrayList;

public class AirlineRepo {
 
  private ArrayList<AccountAirline> airlines;

  public AirlineRepo(){
    this.airlines = new ArrayList<>();
  }

  public void saveNewAirline(AccountAirline airline){
    airlines.add(airline);
  }

  public AccountAirline getAirline(String cnpj){
    for (AccountAirline airl : airlines){
      if(airl.getCNPJ().equals(cnpj))
        return airl;
    }
    return null;
  }

  public boolean removeAirline(String cnpj){
  for(int i = 0; i < airlines.size(); i++){
    AccountAirline airl = airlines.get(i);
    if(airl.getCNPJ().equals(cnpj)){
      airlines.remove(i);
      return true;
    }
  }
  return false;
}

  public void eraseAllAirlines(){
    airlines.clear();
  }
  
  public ArrayList<AccountAirline> showAirlines(){
    return new ArrayList<>(airlines);
  }

  public void showAirl(AirlineRepo repository) {
    for (AccountAirline cia : repository.showAirlines())
      System.out.println(cia);
}

}
