package com.teogong.main;

import java.util.List;
import java.util.Scanner;

import com.teogong.dao.SakilaDao;
import com.teogong.model.Film;
import com.teogong.model.TitleActor;

public class SakilaMain {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String inputString;
		String genre;
		String fullName = null, firstName = null, lastName = null;
		
		while(true) {
			System.out.println("Select Menu");
			System.out.println("===============================");
			System.out.println("a. Films by genre");
			System.out.println("b. Titles by actor");
			System.out.println("q. exit");
			System.out.println("> ");
			
			inputString = scanner.nextLine();
			
			switch(inputString) {
			case "a" :
				System.out.println("Input genre> ");
				genre = scanner.nextLine();
				getFilmsByGenre(genre);
				break;
			case "b" :
				System.out.println("Input First-name Last-name> ");
				fullName = scanner.nextLine();
				firstName = fullName.split("\\s+")[0];
				lastName = fullName.split("\\s+")[1];
				getTitle(firstName,lastName);
				break;
			case "q":
				scanner.close();
				System.exit(0);
				break;
			}
			
		}
	}
	
	public static void getFilmsByGenre(String genre) {
		SakilaDao dao = new SakilaDao();
		
		List<Film> films = dao.getFilms(genre);
		
		System.out.println("   Film ID               Title               	    Genre  	    Release Year        Language");
		System.out.println("=================================================================================================");
		
		if(films.size() == 0) {
			System.out.println("No data found!!");
		}else {
			for(Film film : films) {
				System.out.printf("%5s    %30s     %15s       %5s        %15s\n", 
						film.getFilmId(), film.getTitle(), film.getCategory(), 
						film.getYear(), film.getLanguage());
			}
		}
	}
	
	public static void getTitle(String firstName, String lastName) {
		SakilaDao dao = new SakilaDao();
		
		List<TitleActor> titles = dao.getTitleByActor(firstName,lastName);
		
		System.out.println("First Name        Last Name        Title               Release Year         Rental rate");
		System.out.println("=======================================================================================");
		
		if(titles.size() == 0) {
			System.out.println("No data found");
		}else {

			for(TitleActor title : titles) {
				System.out.printf("%10s    %10s     %20s       %5s                %.2f\n", 
						title.getFirstName(), title.getLastName(), title.getTitle(),
						title.getYear(), title.getRentalRate());
			}			
		}
		
	}
}


