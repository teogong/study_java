package com.teogong.service;

import java.util.List;
import java.util.Scanner;

import com.teogong.dao.SakilaDao;
import com.teogong.model.Store;

public class StoryByTitle implements DbTask{
	private Scanner scanner;

	public StoryByTitle(Scanner scanner) {
		this.scanner = scanner;
	}

	@Override
	public void getInfo() {
		// TODO Auto-generated method stub
		System.out.println("Input title> ");
		String title = scanner.nextLine();
		
		SakilaDao dao = SakilaDao.INSTANCE;
		
		List<Store> stores = dao.getStoryByTitle(title);
		
		System.out.println("Title    Store  First Name        Last Name        Adress  Disrict city country stock ");
		System.out.println("=======================================================================================");
		
		if(stores.size() == 0) {
			System.out.println("No data found");
		}else {

			for(Store store : stores) {
				System.out.printf("%15s  %3d  %15s   %15s  %15s  %15s  %15s  %15s  %2d \n", 
						store.getTitle(),store.getStoreId(), store.getFirstName(), store.getLastName(), store.getAddress(),
						store.getDistrict(), store.getCity(), store.getCountry(), store.getStock());
			}			
		}
		scanner.nextLine();
		
	}
	
	
}
