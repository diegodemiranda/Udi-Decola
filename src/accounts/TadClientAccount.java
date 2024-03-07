package accounts;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public abstract class TadClientAccount {
	
	protected String fullName;
	protected String CPF;
	protected String fullAdress;
	protected LocalDate birthday;

	public TadClientAccount(){
		
	}

	public TadClientAccount(String fullName,String cpf){
		this.CPF=cpf;
		this.fullName=fullName;
	}
	
	public TadClientAccount(String fullName, String cPF, String fullAdress, LocalDate birthday) {
		this.fullName = fullName;
		CPF = cPF;
		this.fullAdress = fullAdress;
		this.birthday = birthday;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public String getCPF() {
		return CPF;
	}

	public void setCPF(String cPF) {
		CPF = cPF;
	}

	public String getFullAdress() {
		return fullAdress;
	}

	public void setFullAdress(String fullAdress) {
		this.fullAdress = fullAdress;
	}

	public String getBirthday() {
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		return this.birthday.format(formatter);
	}


	public void setBirthday(String birthday) {
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		this.birthday = LocalDate.parse(birthday, formatter);
	}
	
	

}
