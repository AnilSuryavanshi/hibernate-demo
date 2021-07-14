package com.demo.test.bean;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
//@AllArgsConstructor
@ToString
@Entity
@Table(name = "laptop_tble")

public class LaptopDemo {

	public LaptopDemo(double d, String string, String string2) {
		// TODO Auto-generated constructor stub
	}

	
	private double laptopPrice;
	
	private String laptopBrand;
	
	@Id
	private String laptopName;
	
	}
