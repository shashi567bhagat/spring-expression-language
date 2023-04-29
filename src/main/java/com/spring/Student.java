package com.spring;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("student")

public class Student {

	@Value("#{2+3}")
	public int sum;
	
	@Value("#{ 5-2}")
	public int sub;
	
	@Value("#{5*6}")
	public int mul;
	
	@Value("#{30/5}")
	public int div;
	
	@Value("#{ 1>1} ")
	public boolean equalvalid;

	
	@Value("#{1==4 ||  2==2}")
	public boolean checkstatue;

     @Value("#{2>3 ? 'Yes' :'No'}")
	public String terinaryCheck;

     
     
     @Value("#{T(java.lang.Math).sqrt(144)}")
     public int num;

     
     @Value("#{T(java.lang.Math).PI}")
     public int num1;


     
     
     public  static String call()
     {
    	return "Method call" ;
    	 
     }
     
     @Value("#{T(com.spring.Student).call()}")
     public String Result;




	@Override
	public String toString() {
		return "Student [sum=" + sum + ", sub=" + sub + ", mul=" + mul + ", div=" + div + ", equalvalid=" + equalvalid
				+ ", checkstatue=" + checkstatue + ", terinaryCheck=" + terinaryCheck + ", num=" + num + ", num1="
				+ num1 + ", Result=" + Result + "]";
	}
     
     
     
     
	
	
	
	
	
	
	
}
