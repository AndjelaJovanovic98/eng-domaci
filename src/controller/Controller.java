package controller;

import java.sql.SQLException;

import db.Database;
import model.Company;

public class Controller {
	Database db;
	
	public Controller() {
		db = new Database();
	}
	
//	public void saveCompanyToDatabase(Company company)  {
//		try {
//			db.connectToDatabase();
//		} catch (ClassNotFoundException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} catch (SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		
//		try {
//			db.saveToDatabase(company);
//		} catch (SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} finally {
//			db.disconnectFromDatabase();
//		}
//		
//	}
	
//	public void saveToDatabase(Company company) throws Exception  {
//		try {
//			db.connectToDatabase();
//		} catch (ClassNotFoundException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} catch (SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		
//		try {
//			db.saveObjToDatabase(company);
//		} catch (SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} finally {
//			db.disconnectFromDatabase();
//		}
//		
//	}
	
	
	public void saveToDatabase(Object obj) throws Exception  {
		try {
			db.connectToDatabase();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			db.saveObjToDatabase(obj);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			db.disconnectFromDatabase();
		}
		
	}

}
