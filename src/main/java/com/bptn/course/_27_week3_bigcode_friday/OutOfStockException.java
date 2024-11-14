package com.bptn.course._27_week3_bigcode_friday;

//Customized Exception Class for when a product is out of stock
public class OutOfStockException extends Exception {
 
 // Modify the constructor below to take a String message parameter.   
 public OutOfStockException(String message) {
     // Call the superclass constructor passing the message parameter.
     super(message);
 }
}