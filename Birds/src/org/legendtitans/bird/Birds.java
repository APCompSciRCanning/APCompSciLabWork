package org.legendtitans.bird;

//� A+ Computer Science  -  www.apluscompsci.com

//class complete worksheet key

import java.util.Arrays;

public class Birds {
	private Bird[] birds;

	public Birds(int size) {
		birds = new Bird[size];
	}

	public void add(int spot, Bird bird) {
		birds[spot] = bird;
	}

	public String toString() {
		return Arrays.toString(birds);
	}
}