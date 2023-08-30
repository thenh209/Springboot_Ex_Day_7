package com.Day_7.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Day_7.Model.Car;
import com.Day_7.Repository.CarRepo;

@Service
public class CarService {
	@Autowired
	CarRepo cr;
	
	public List<Car> addCars(List<Car> c)
	{
		return (List<Car>)cr.saveAll(c);
	}
	
	public List<Car> showOwners(int owners)
	{
		return cr.getCarOwners(owners);
	}
	
	public List<Car> showAddress(String address)
	{
		return cr.getCarAddress(address);
	}
	
	public List<Car> showCarName(String carname)
	{
		return cr.getCarName(carname);
	}
	
	public List<Car> showOwnersAndCartype(int owners, String cartype)
	{
		return cr.getCarOwnerAndCartype(owners, cartype);
	}
	
	
}


