package model;

import java.io.Serializable;

public class Human implements Serializable {
	private String name;
	private int age;
	
	
	public Human() {}
	
	public Human(String name, int age) {
		this.name = name;
		this.age = age;
	}

	/**
	 * nameを取得します。
	 * @return name
	 */
	public String getName() {
	    return name;
	}

	/**
	 * nameを設定します。
	 * @param name name
	 */
	public void setName(String name) {
	    this.name = name;
	}

	/**
	 * ageを取得します。
	 * @return age
	 */
	public int getAge() {
	    return age;
	}

	/**
	 * ageを設定します。
	 * @param age age
	 */
	public void setAge(int age) {
	    this.age = age;
	}
	
	
}
