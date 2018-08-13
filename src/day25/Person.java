package day25;

import java.io.Serializable;

public class Person implements Serializable{
    private int id;
    private String name;
    static final long serialVersionUID=5464648648946L;
    public Person(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public Person() {
		
	}
	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + "]";
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}
