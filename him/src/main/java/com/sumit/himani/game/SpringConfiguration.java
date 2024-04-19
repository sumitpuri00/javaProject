package com.sumit.himani.game;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration

//this record will automatically create all the getter and setter ,
//constructor and all the other things for us . this record keyword was 
//introduced in JDK 16 ; And the syntex is below.
record Person(String name,int age) {};
record Address(String state,String city) {};
record Space(String name,String country,Person person) {};
record Anime(String animeName,Person myPerson) {};
record Stoic(String name,String book) {};
//here we will create spring beans;
public class SpringConfiguration {

//@bean: indicates that a method produced a bean
//	to be managed by spring-framwork;
	@Bean
	public String name() {
		return "Himani goswami";
	}
	
	
	@Bean
	public int age() {
		return 21;
	}
	
	@Bean
	public Person person() {
		
//		this is one way;
//		var sumit=new Person("Himani",20);
		
		
//		this is second way; Returning the object itself;
		return new Person("Himani",20);
	}

	@Bean
	public Address address() {
		return new Address("Uttrakhand","nainital0");
	}
	
	
	@Bean
	public Person person2() {
		
//		first way is : using method call;
		return new Person (name(),age());
	}
	
	
// second is use of parameter and for this we use the existing bean as the parameter;
	@Bean
	public Anime she(String name,Person person) {
		return new Anime(name,person);
	}
	
	
	
	@Bean
	public Space space() {
		
		return new Space("nasa","america",new Person("sumit puri",21));
		
	}
	
//	now suppose if we have multiple matching bean or @condidate,
//	when we call them with their class name .
	
	@Bean 
	@Primary
	public Stoic firstStoic() {
		return new Stoic("marcus aurelius","meditation");
	}
	
	@Bean
//	@Qualifier("this is seneca")  also use qualifier but it don't making any sence,
//	i didn't use it .
	public Stoic SecondStoic() {
		return new Stoic("seneca","letter from a stoic");
	}
	
	
	
}
