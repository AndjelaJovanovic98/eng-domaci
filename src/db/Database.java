package db;

import java.lang.reflect.Field;
import java.sql.*;

import model.Company;

public class Database {
	Connection conn;
	
	public void connectToDatabase() throws SQLException, ClassNotFoundException {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/baza", "root", "");

			if(conn != null) {
				System.out.println("Uspesna konekcija!");
			} else {
				System.out.println("Neuspesna konekcija!");
			}
		
	}
	
	public void disconnectFromDatabase() {
		try {
			conn.close();
			System.out.println("Uspesno raskinuta konekcija!");
		} catch (SQLException e) {
			System.out.println("Greska prilikom raskidanja konekcije!");
			e.printStackTrace();
		}
	}
	
//	public <T> void saveToDatabase(T obj) throws SQLException {
//		
//		String tableName = obj.getClass().getSimpleName();
//		
//		if(obj instanceof Company) {
//			long id = ((Company) obj).getId();
//			String naziv = ((Company) obj).getNaziv();
//			
//			String querry="INSERT INTO " + tableName + " VALUES ('"+id+"','"+naziv+"')";
//			
//			Statement st = null;
//			
//			try {
//				st = conn.createStatement();
//				System.out.println(querry);
//				st.executeUpdate(querry);
//				System.out.println("Uspesno kreiranje mesta!");
//				
//			} catch (SQLException e) {
//				e.printStackTrace();
//				System.out.println("Greska prilikom inserta!");
//			} finally {
//				if(st != null) {
//					st.close();
//				}
//			}			
//		}
//	}
	
	public <T> void saveObjToDatabase(T obj) throws Exception {
		
		String tableName = obj.getClass().getSimpleName();
		
		Field[] objFields = obj.getClass().getDeclaredFields();
				
		Object fieldValue = null;
		
		Statement st = null;
		
		String values = "";
		
		for(int i = 0; i < objFields.length; i++) {
			// fieldValue = objFields[i].get(obj); 
			
			//values += "'" + objFields[i].get(obj) + "'";
			
			if(i > 0) {
				values += ",'" + objFields[i].get(obj) + "'";
			} else if (i == 0){
				values += "'" + objFields[i].get(obj) + "'";
			} 			
			 
		}
			
		String querry="INSERT INTO " + tableName + " VALUES ("+values+")";
	
		try {
			st = conn.createStatement();
			System.out.println(querry);
			st.executeUpdate(querry);
			System.out.println("Uspesno kreiranje mesta!");
			
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("Greska prilikom inserta!");
		} finally {
			if(st != null) {
				st.close();
			}
		}
		

	}
	
	
}
