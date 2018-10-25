package com.verizon.adb;

import org.springframework.beans.factory.*;  
import org.springframework.beans.factory.xml.XmlBeanFactory;  
import org.springframework.core.io.*;  
public class Test {   
public static void main(String[] args) {  
      
	String mesg="Welcome Campus Hires"
			+ "\nPlease login into the prehire portal at prehire.verizon.com"
			+ "\nUse your EMail ID as your username"
			+ "\nPassword:Verizon@123";
Resource r=new ClassPathResource("applicationContext.xml");  
BeanFactory b=new XmlBeanFactory(r);  
MailMail m=(MailMail)b.getBean("mailMail");  
String sender="verizondummymail4@gmail.com";//write here sender gmail id  
String[] receiver={"anannya.annie@gmail.com","snhithpadmanabhan@gmail.com"};//write here receiver id  
m.sendMail(sender,receiver,"PreHire Portal Credentials",mesg);  
      
System.out.println("success");  
}  
}  