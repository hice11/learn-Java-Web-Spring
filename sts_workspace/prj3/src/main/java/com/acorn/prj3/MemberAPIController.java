package com.acorn.prj3;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MemberAPIController {

	@ResponseBody
	@RequestMapping(value = "/member/list3", method = RequestMethod.GET)
	public List<Customer> list() {
		
		List<Customer> list = new ArrayList<Customer>();
		list.add( new Customer("t1" , "test1"));
		list.add( new Customer("t2" , "test2")); 
		list.add( new Customer("t3" , "test3")); 

		return list;
	}
	
	@ResponseBody
	@RequestMapping(value = "/member/register", method = RequestMethod.POST)
	public Customer register(@RequestBody Customer customer) {
		System.out.println( customer);	//디비 등록

		return customer;
	}
	
	@ResponseBody
	@RequestMapping(value = "/member/modify/{id}", method = RequestMethod.PUT)
	public void modify(@PathVariable String id, @RequestBody Customer customer) {
		System.out.println(customer);
		System.out.println(id);
		
	}
	
}
