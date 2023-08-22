package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Stuentity;
import com.example.demo.service.Stuservice;

@RestController

public class Stucontroller {
	@Autowired
	Stuservice sser;
	@PostMapping("addstudents")
	public Stuentity addndetails(@RequestBody Stuentity ss)
	{
		return sser.saveinfo(ss);
		
		
	}
	@PostMapping("addnstudents")
	public List<Stuentity> addndetails(@RequestBody List<Stuentity> ss)
	{
		return sser.savedetails(ss);
		
		
	}
	@GetMapping("showdetail")
	public List<Stuentity> show()
	{
		return sser.showinfo();
	}
	@PutMapping("updates")
	public Stuentity modify(@RequestBody Stuentity ss)
	{
		return sser.changeinfo(ss);
	}
	@DeleteMapping("deletedetails")
	public String del(@RequestBody Stuentity ss)
	{
		sser.deleteinfo(ss);
		return"deleted successfully";
	}
	@DeleteMapping("delids/{id}")
	public void deletemyid(@PathVariable int id)
	{
		sser.deleteid(id);
		
	}
	@DeleteMapping("delparamids")
	public void my(@RequestParam int id)
	{
		sser.deletepid(id);
		
	}
		
	


	

}
