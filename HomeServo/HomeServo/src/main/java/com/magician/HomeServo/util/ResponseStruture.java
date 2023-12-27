package com.magician.HomeServo.util;

import lombok.Data;

@Data
public class ResponseStruture<T>{
	
	private int status;
	private T data;
	private String message;
	
}
