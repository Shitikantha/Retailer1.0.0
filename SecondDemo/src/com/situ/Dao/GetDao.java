package com.situ.Dao;

import org.springframework.stereotype.Repository;

import com.situ.Util.PropertiesFileUtils;

@Repository
public class GetDao {

	public String getAccessDetail(String userName) {
		System.out.println("AAAAAAAAA");
		try {
			new PropertiesFileUtils().readProperties();
		} catch (Exception e) {
			// TODO: handle exception
		}
		return "success";
	}
}
