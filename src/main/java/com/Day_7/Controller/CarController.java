package com.Day_7.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import com.Day_7.Model.Car;
import com.Day_7.Service.CarService;

public class CarController {
	@Autowired
	CarService cs;
	
	@PostMapping("carAdd")
	public boolean postCars(@RequestBody List<Car> c)
	{
		try {
			cs.addCars(c);
			return true;
		}
		catch(Exception e)
		{
			return false;
		}
	}
	
	@GetMapping("carGet")
	public List<Car> getCars(@RequestParam(value = "ownerId") int ownerId)
	{
		return cs.showOwners(ownerId);
	}
	
	@GetMapping("carAddress")
	public List<Car> getCarAddress(@RequestParam(value = "address") String address)
	{
		return cs.showAddress(address);
	}
	
	@GetMapping("carName")
	public List<Car> getCarName(@RequestParam(value = "carname") String carname)
	{
		return cs.showCarName(carname);
	}
	
	@GetMapping("carOwnerAndCartype")
	public List<Car> getCarOwnerAndType(@RequestParam(value = "id") int id, @RequestParam(value = "cartype") String cartype)
	{
		return cs.showOwnersAndCartype(id, cartype);
	}

}
