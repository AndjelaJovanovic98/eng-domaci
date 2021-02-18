package main;

import controller.Controller;
import model.City;
import model.Company;

public class Main {

	public static void main(String[] args) throws Exception {
		Controller controller = new Controller();
		
		Company company = new Company(101l, "Delta Holding");
		//controller.saveCompanyToDatabase(company);
		controller.saveToDatabase(company); 
		controller.saveToDatabase(new City(81l, "Beograd"));
	}
	

}
