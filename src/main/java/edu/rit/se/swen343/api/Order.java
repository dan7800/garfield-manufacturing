package edu.rit.se.swen343.api;

import lombok.Value;

@Value
public class Order {
	private final int id;
	private final ModelType model;
	private final boolean stub = true;
	
	public static enum ModelType {
		BASIC,
		MIDRANGE,
		HIGHEND
	}
}
