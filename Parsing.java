package major;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;

import com.google.gson.Gson;
import com.google.gson.JsonParseException;

import classDeclaration.TopArray;
import classDeclaration.TopLevel;

public class Parsing {
	public static void main(String [] args) {
		String inputFilename = "";
		Scanner scan = new Scanner(System.in);
		Gson gson = new Gson();  
		TopLevel[] array = null;
		try {
			inputFilename = scan.nextLine();
			array = gson.fromJson(new FileReader(inputFilename), TopLevel[].class);  
		} 	catch (FileNotFoundException fnfe) {
				System.out.println("That file could not be found.");
		} 	catch (JsonParseException e) {
				System.out.println("That file is not a well-formed JSON file.");
				System.out.println(e.getMessage());
		  	}
		
		//how to get the items
			System.out.println(array[0].getFaceRectangle().getHeight());
			System.out.println(array[0].getFaceRectangle().getLeft());
			System.out.println(array[0].getFaceRectangle().getTop());
			System.out.println(array[0].getFaceRectangle().getWidth());
		}
	
}
