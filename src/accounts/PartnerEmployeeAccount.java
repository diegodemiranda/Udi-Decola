package accounts;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

public class PartnerEmployeeAccount extends EmployeeAccount {

    private int numberRegisteredHotels;
    List<AccountHotel> myRegisteredHotels;

    public PartnerEmployeeAccount(String fullName, String cPF, String fullAdress, LocalDate birthday,String workCardNumber,double stantardSalary){
    super(fullName, cPF, fullAdress, birthday, workCardNumber, stantardSalary);
    this.numberRegisteredHotels = 0;
    }

    public void increaseResgiteredHotels(AccountHotel hotel){
        myRegisteredHotels.add(hotel);
        numberRegisteredHotels++;


    }   

    public int getNumberRegisteredHotels() {
        return numberRegisteredHotels;
    }
    public List<AccountHotel> getMyRegisteredHotels() {
        return myRegisteredHotels;
    }

    public double calculateSalary(){
        return standardSalary*(1+this.numberRegisteredHotels/50);
    }
}
