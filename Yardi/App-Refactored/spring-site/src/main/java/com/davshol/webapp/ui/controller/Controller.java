package com.davshol.webapp.ui.controller;


import java.net.InetAddress;
import java.net.UnknownHostException;

import javax.validation.Valid;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.davshol.webapp.ui.request.SiteName;



import org.springframework.http.MediaType;

@RestController
@RequestMapping("users")
public class Controller {
	
	@GetMapping(consumes=MediaType.APPLICATION_JSON_VALUE,produces=MediaType.APPLICATION_JSON_VALUE )
	public String getUsers(@Valid @RequestBody SiteName siteName) {
		
		InetAddress address = null;
		try {
			address = InetAddress.getByName(siteName.getSiteName());
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println(address.getHostAddress()); 
	    return address.getHostAddress();
	}
	
	
	
	
	
	
	@GetMapping(path="/{userid}", produces= {MediaType.APPLICATION_XML_VALUE, MediaType.APPLICATION_JSON_VALUE})
	public String getUser(@PathVariable String userid) {
		
		InetAddress address = null;
		try {
			address = InetAddress.getByName("www.google.com");
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		System.out.println(address.getHostAddress()); 
		return "get user was called, user id =" + userid;
		
	}
	
    @PostMapping
	public String createUser() {
		
		return "create user was called";
	}
    
    @PutMapping
	public String UpdateUser() {
		
		return "update user was called";
	}

}
