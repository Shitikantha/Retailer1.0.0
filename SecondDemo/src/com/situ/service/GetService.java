package com.situ.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.situ.Dao.GetDao;
import com.situ.Util.SubhamUtil;

@Service
public class GetService {
	@Autowired
	private GetDao getDao;
	
	public List<String> getAccess(){
		System.out.println("Hello Services");
		String[] stringArr=getDao.getAccessDetail("subham").split(",");
		List<String> accessDetailList=SubhamUtil.convertStringArrayTOList(stringArr);
		System.out.println("Length:::::"+accessDetailList.size());
		return accessDetailList;
	}

}
