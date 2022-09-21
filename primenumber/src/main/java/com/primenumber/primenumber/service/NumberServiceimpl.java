package com.primenumber.primenumber.service;


import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.primenumber.primenumber.entities.Number;

@Service
public class NumberServiceimpl implements NumberService {


	List<Number> list;
	
	public void  NumberServiceImpl() {
		
		list = new ArrayList<>();
	
		list.add(new Number(10,100));
		
	
		
		
	}
	@Override
	public List<Number> getNumbers() {
	
		return list;
	}
	
	@Override
	public NumberService getService(long numberId) {
	    Number c=null;
		for(Number number :list){
		{
			if(number.getid()==numberID)
			{
				c=number;
				break;
			}
				
			
		}
		return c;
		}
	
}
