package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Stuentity;
import com.example.demo.repository.Sturepo;

@Service

public class Stuservice {
	@Autowired
	Sturepo sr;
	public Stuentity saveinfo(Stuentity ss)
	{
		return sr.save(ss);
	}
    public List<Stuentity> savedetails(List<Stuentity> ss)
    {
    	return (List<Stuentity>)sr.saveAll(ss);
    }
	public List<Stuentity> showinfo()
	{
		return sr.findAll();
	}
	public Stuentity changeinfo(Stuentity ss)
	{
		return sr.saveAndFlush(ss);
	}
	public void deleteinfo(Stuentity ss)
	{
		sr.delete(ss);
	}

	public void deleteid(int id)
	{
		sr.deleteById(id);
	}

	public void deletepid(int id)
	{
		sr.deleteById(id);
	}
}
