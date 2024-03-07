package accounts;

import java.time.LocalDate;
import utilities.Purchase;
import utilities.ShoppingCart;

public class ClientAccount extends TadClientAccount {
	
	ShoppingCart purchasesLog;
	float vipPoint;
	
	public ClientAccount(){
	}

	public ClientAccount(String fullName, String cPF){
		super(fullName, cPF);
	}

	public ClientAccount(String fullName, String cPF, String fullAdress, LocalDate birthday) {
		super(fullName, cPF, fullAdress, birthday);
		this.fullAdress=fullName;
		this.CPF = cPF;
		this.fullAdress = fullAdress;
		this.birthday = birthday;
		this.vipPoint = 0;


	}
	
	public void increasePurchasesLog(Purchase newPurchase) {
		this.purchasesLog.purchases.add(newPurchase);
	}
	
	public ShoppingCart getPurchasesLog() {
		return purchasesLog;
	}

	public float getVipPoint() {
		return vipPoint;
	}
	public void setVipPoint(float vipPoint) {
		this.vipPoint = vipPoint;
	}

	boolean ifCreatVip(){
		if (vipPoint>=1000) {
			return true;
			
		}
		else{
			return false;
		}
	}
	
	
	
	

}
