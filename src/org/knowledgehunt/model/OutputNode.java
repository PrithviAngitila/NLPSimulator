package org.knowledgehunt.model;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class OutputNode {
	
	private static BufferedReader br;
	public static  void displayToUser(String message)
	{
		System.out.println(message);
	}
	public static String getInputFromUser()
	{
		System.out.println("Please provide your Input");
		Scanner sc=new Scanner(System.in);
		String input=sc.nextLine();
		return input;
	}
	public static String getInputFromUser(String prompt) 
	{
		System.out.println(prompt);
		Scanner sc=new Scanner(System.in);
		return sc.nextLine();
	}

}
