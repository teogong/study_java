package com.teogong.dao;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.teogong.model.Film;
import com.teogong.model.Store;
import com.teogong.model.TitleActor;

public enum SakilaDao {
	INSTANCE;
	
	private String url = "jdbc:mysql://localhost:3306/sakila";
	private String usernmae = "teogong";
	private String password = "1234";
	private Connection conn;
	private PreparedStatement pStmt;
	private ResultSet rSet ;
	private CallableStatement cStmt;
	
	private void getConnection() {
		try {
			conn  = DriverManager.getConnection(url,usernmae,password);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	
	private void closeConnection() {
		try {
			if(conn != null)
				conn.close();
			if(pStmt != null)
				pStmt.close();
			if(rSet != null)
				rSet.close();
			if(cStmt != null)
				cStmt.close();
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	
	public List<Film> getFilms(String genre){
		List<Film> films = new ArrayList<>();
		
		getConnection();
		
		StringBuffer sb = new StringBuffer();
		sb.append("select FL.film_id, FL.title, FL.description, CG.name, FL.release_year, LG.name ");
		sb.append("from film as FL join film_category as FC on FL.film_id = FC.film_id ");
		sb.append("join category as CG on FC.category_id = CG.category_id ");
		sb.append("join language as LG on FL.language_id = LG.language_id ");
		sb.append("where CG.name = ? order by FL.title ");
		
		String sql = sb.toString();
		
		try {
			pStmt =  conn.prepareStatement(sql);
			pStmt.setString(1, genre);
			rSet = pStmt.executeQuery();
			Film film = null;
			while(rSet.next()) {
				film = new Film();
				film.setFilmId(rSet.getInt(1));
				film.setTitle(rSet.getString(2));
				film.setDesc(rSet.getString(3));
				film.setCategory(rSet.getString(4));
				film.setYear(rSet.getString(5));
				film.setLanguage(rSet.getString(6));
				films.add(film);
			}
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}finally {
			closeConnection();
		}
		
		return films;
	}
	
	public List<TitleActor> getTitleByActor(String firstName, String lastName){
		List<TitleActor> titles = new ArrayList<>();
		
		getConnection();
		
		StringBuffer sb = new StringBuffer();
		sb.append("select AC.first_name, AC.last_name, FL.title, FL.release_year, FL.rental_rate ");
		sb.append("from actor AC join film_actor FA on AC.actor_id = FA.actor_id ");
		sb.append("join film FL on FA.film_id = FL.film_id ");
		sb.append("where AC.first_name = ? and AC.last_name = ? ");
		sb.append("order by FL.title ");
		
		String sql = sb.toString();
		
		try {
			pStmt =  conn.prepareStatement(sql);
			pStmt.setString(1, firstName);
			pStmt.setString(2, lastName);
			rSet = pStmt.executeQuery();
			TitleActor titleActor = null;
			while(rSet.next()) {
				titleActor = new TitleActor();
				titleActor.setFirstName(rSet.getString(1));
				titleActor.setLastName(rSet.getString(2));
				titleActor.setTitle(rSet.getString(3));
				titleActor.setYear(rSet.getString(4));
				titleActor.setRentalRate(rSet.getDouble(5));
				titles.add(titleActor);
			}
			
		} catch (Exception e) {
			
			e.printStackTrace();
		}finally {
			closeConnection();
		}
		
		return titles;
	}
	
	public List<Store> getStoryByTitle(String title){
		List<Store> stores = new ArrayList<>();
		
		getConnection();
		
		try {
			cStmt = conn.prepareCall("call SP_GET_STORE(?)");
			cStmt.setString(1, title);
			rSet = cStmt.executeQuery();
			
			Store store;
			while(rSet.next()) {
				store = new Store();
				store.setTitle(rSet.getString(1));
				store.setStock(rSet.getInt(2));
				store.setFirstName(rSet.getString(3));
				store.setLastName(rSet.getString(4));
				store.setAddress(rSet.getString(5));
				store.setDistrict(rSet.getString(6));
				store.setCity(rSet.getString(7));
				store.setCountry(rSet.getString(8));
				store.setStock(rSet.getInt(9));
				stores.add(store);
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}finally {
			closeConnection();
		}
		return stores;
		
	}
}
