package com.teogong.service;

import java.util.List;
import java.util.Scanner;

import com.teogong.dao.SakilaDao;
import com.teogong.model.Film;

public class FilmsByGenre implements DbTask{
	private Scanner scanner;

	public FilmsByGenre(Scanner scanner) {
		this.scanner = scanner;
	}

	@Override
	public void getInfo() {
		// TODO Auto-generated method stub
		System.out.println("Input genre> ");
		String genre = scanner.nextLine();
		
		SakilaDao dao =  SakilaDao.INSTANCE;
		
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
		scanner.nextLine();
	}
	
	
	
}
