package com.javaex.ex05;

public class Person {

    private String name;
    private String hp;
    private String company;
    
    public Person() {}
	public Person(String name, String hp, String company) {
		super();
		this.name = name;
		this.hp = hp;
		this.company = company;
	}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getHp() {
		return hp;
	}
	public void setHp(String hp) {
		this.hp = hp;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}

	
	
	@Override
	public String toString() {
		return "Friend [name=" + name + ", hp=" + hp + ", company=" + company + "]";
	}
	
	public String info() {
		return "name, hp, company";
	}
	public void print() {
		System.out.println("이름 : "+name);
		System.out.println("핸드폰 : "+hp);
		System.out.println("회사 : "+company);
	}

	
	
	
    
    



}
