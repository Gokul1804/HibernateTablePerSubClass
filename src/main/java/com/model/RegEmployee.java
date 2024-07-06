package com.model;

import jakarta.persistence.*;

@Entity
@Table(name="regularemployee103")
@PrimaryKeyJoinColumn(name="ID")
public class RegEmployee extends Employee{
	float salary;
	int bonus;
	public RegEmployee() {
		// TODO Auto-generated constructor stub
	}
	public RegEmployee(String name, float salary, int bonus) {
		super(name);
		this.salary = salary;
		this.bonus = bonus;
	}
	public float getSalary() {
		return salary;
	}
	public void setSalary(float salary) {
		this.salary = salary;
	}
	public int getBonus() {
		return bonus;
	}
	public void setBonus(int bonus) {
		this.bonus = bonus;
	}
	
	
}
