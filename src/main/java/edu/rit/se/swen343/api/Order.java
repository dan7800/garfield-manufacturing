package edu.rit.se.swen343.api;

import lombok.Value;

@Value
public class Order {
	private int id;
	private ModelType model;
	private boolean stub = true;

	public static enum ModelType {
		BASIC, MIDRANGE, HIGHEND
	}
}
