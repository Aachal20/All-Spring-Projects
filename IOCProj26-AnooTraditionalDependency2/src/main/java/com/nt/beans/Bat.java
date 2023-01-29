package com.nt.beans;

import java.util.Random;

import org.springframework.stereotype.Component;

@Component("bat")
public class Bat {

	public int scoreRun() {
		System.out.println("Bat.scoreRun()");
		return new Random().nextInt(100);
	}
	public Bat() {
		System.out.println("Bat.Bat()::0-param constructor");
	}
}
