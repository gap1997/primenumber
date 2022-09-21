package com.primenumber.primenumber.service;

import java.util.List;

import com.primenumber.primenumber.entities.Number;

public interface NumberService {
	
	public List<Number> getNumbers();
	
    public NumberService getService(long numberId);
}

