package org.legendtitans.bird;

public class Bird {
	private String name;
	private int age;

	public Bird(String n, int a) {
		name = n;
		age = a;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public String toString() {
		return getName() + " - " + getAge();
	}
}