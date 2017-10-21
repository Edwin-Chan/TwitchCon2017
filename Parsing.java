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
        
        //conversion of values from String to Double
        
        Double anger  = null;
        Double contempt  = null;
        Double disgust = null;
        Double fear = null;
        Double neutral = null;
        Double happiness = null;
        Double sadness = null;
        Double surprise = null;
        anger = Double.parseDouble(array[0].getScores().getAnger());
        contempt = Double.parseDouble(array[0].getScores().getContempt());
        disgust = Double.parseDouble(array[0].getScores().getDisgust());
        fear = Double.parseDouble(array[0].getScores().getFear());
        neutral = Double.parseDouble(array[0].getScores().getNeutral());
        happiness = Double.parseDouble(array[0].getScores().getHappiness());
        sadness = Double.parseDouble(array[0].getScores().getSadness());
        surprise = Double.parseDouble(array[0].getScores().getSurprise());
        
        ArrayList<Double> compare = new ArrayList<Double>();
        compare.add(anger);
        compare.add(contempt);
        compare.add(disgust);
        compare.add(fear);
        compare.add(neutral);
        compare.add(happiness);
        compare.add(sadness);
        compare.add(surprise);
        int largestIndex = 0;
        Double largest = 0.0;
        String largestString = "";
        for (int i = 0; i < compare.size(); i++) {
            if (largest.compareTo(compare.get(i)) < 0) {
                largest = compare.get(i);
                largestIndex = i;
            }
        }
        if (largestIndex == 0) {
            largestString = "anger";
        }else if (largestIndex == 1) {
            largestString = "contempt";
        } else if (largestIndex == 2) {
            largestString = "disgust";
        }else if (largestIndex == 3) {
            largestString = "fear";
        }else if (largestIndex == 4) {
            largestString = "neutral";
        }else if (largestIndex == 5) {
            largestString = "happiness";
        }else if (largestIndex == 6) {
            largestString = "sadness";
        }else if (largestIndex == 7) {
            largestString = "surprise";
        }
        
        anger*=100;
        contempt*=100;
        disgust*=100;
        fear *= 100;
        neutral*= 100;
        happiness *= 100;
        sadness *= 100;
        surprise *= 100;
        
        
        
        
        
    }
    //	sampleResult.json
    //function:
    //String function(String str){
    //	Gson gson = new Gson();
    //	TopLevel[] array = null;
    //	try {
    //		array = gson.fromJson(str, TopLevel[].class);
    //	} 	catch (FileNotFoundException fnfe) {
    //			System.out.println("That file could not be found.");
    //	} 	catch (JsonParseException e) {
    //			System.out.println("That file is not a well-formed JSON file.");
    //			System.out.println(e.getMessage());
    //	  	}
    //
    //	//conversion of values from String to Double
    //
    //	Double anger  = null;
    //	Double contempt  = null;
    //	Double disgust = null;
    //	Double fear = null;
    //	Double neutral = null;
    //	Double happiness = null;
    //	Double sadness = null;
    //	Double surprise = null;
    //	anger = Double.parseDouble(array[0].getScores().getAnger());
    //	contempt = Double.parseDouble(array[0].getScores().getContempt());
    //	disgust = Double.parseDouble(array[0].getScores().getDisgust());
    //	fear = Double.parseDouble(array[0].getScores().getFear());
    //	neutral = Double.parseDouble(array[0].getScores().getNeutral());
    //	happiness = Double.parseDouble(array[0].getScores().getHappiness());
    //	sadness = Double.parseDouble(array[0].getScores().getSadness());
    //	surprise = Double.parseDouble(array[0].getScores().getSurprise());
    //
    //	ArrayList<Double> compare = new ArrayList<Double>();
    //	compare.add(anger);
    //	compare.add(contempt);
    //	compare.add(disgust);
    //	compare.add(fear);
    //	compare.add(neutral);
    //	compare.add(happiness);
    //	compare.add(sadness);
    //	compare.add(surprise);
    //	int largestIndex = 0;
    //	Double largest = 0.0;
    //	String largestString = "";
    //	for (int i = 0; i < compare.size(); i++) {
    //		if (largest.compareTo(compare.get(i)) < 0) {
    //			largest = compare.get(i);
    //			largestIndex = i;
    //		}
    //	}
    //	if (largestIndex == 0) {
    //		largestString = "anger";
    //	}else if (largestIndex == 1) {
    //		largestString = "contempt";
    //	} else if (largestIndex == 2) {
    //		largestString = "disgust";
    //	}else if (largestIndex == 3) {
    //		largestString = "fear";
    //	}else if (largestIndex == 4) {
    //		largestString = "neutral";
    //	}else if (largestIndex == 5) {
    //		largestString = "happiness";
    //	}else if (largestIndex == 6) {
    //		largestString = "sadness";
    //	}else if (largestIndex == 7) {
    //		largestString = "surprise";
    //	}
    //
    //	anger*=100;
    //	contempt*=100;
    //	disgust*=100;
    //	fear *= 100;
    //	neutral*= 100;
    //	happiness *= 100;
    //	sadness *= 100;
    //	surprise *= 100;
    // return largestString;
    //}
    
    
    /* This is used for the SALT METER */
    //Double function(String str){
    //	Gson gson = new Gson();
    //	TopLevel[] array = null;
    //	try {
    //		array = gson.fromJson(str, TopLevel[].class);
    //	} 	catch (FileNotFoundException fnfe) {
    //			System.out.println("That file could not be found.");
    //	} 	catch (JsonParseException e) {
    //			System.out.println("That file is not a well-formed JSON file.");
    //			System.out.println(e.getMessage());
    //	  	}
    //
    //	//conversion of values from String to Double
    //
    //	Double anger  = null;
    //	Double contempt  = null;
    //	Double disgust = null;
    //	Double fear = null;
    //	Double neutral = null;
    //	Double happiness = null;
    //	Double sadness = null;
    //	Double surprise = null;
    //	anger = Double.parseDouble(array[0].getScores().getAnger());
    //	contempt = Double.parseDouble(array[0].getScores().getContempt());
    //	disgust = Double.parseDouble(array[0].getScores().getDisgust());
    //	fear = Double.parseDouble(array[0].getScores().getFear());
    //	neutral = Double.parseDouble(array[0].getScores().getNeutral());
    //	happiness = Double.parseDouble(array[0].getScores().getHappiness());
    //	sadness = Double.parseDouble(array[0].getScores().getSadness());
    //	surprise = Double.parseDouble(array[0].getScores().getSurprise());
    //
    //	ArrayList<Double> compare = new ArrayList<Double>();
    //	compare.add(anger);
    //	compare.add(contempt);
    //	compare.add(disgust);
    //	compare.add(fear);
    //	compare.add(neutral);
    //	compare.add(happiness);
    //	compare.add(sadness);
    //	compare.add(surprise);
    //	int largestIndex = 0;
    //	Double largest = 0.0;
    //	String largestString = "";
    //	for (int i = 0; i < compare.size(); i++) {
    //		if (largest.compareTo(compare.get(i)) < 0) {
    //			largest = compare.get(i);
    //			largestIndex = i;
    //		}
    //	}
    //	if (largestIndex == 0) {
    //		largestString = "anger";
    //	}else if (largestIndex == 1) {
    //		largestString = "contempt";
    //	} else if (largestIndex == 2) {
    //		largestString = "disgust";
    //	}else if (largestIndex == 3) {
    //		largestString = "fear";
    //	}else if (largestIndex == 4) {
    //		largestString = "neutral";
    //	}else if (largestIndex == 5) {
    //		largestString = "happiness";
    //	}else if (largestIndex == 6) {
    //		largestString = "sadness";
    //	}else if (largestIndex == 7) {
    //		largestString = "surprise";
    //	}
    //	
    //	anger*=100;
    //	contempt*=100;
    //	disgust*=100;
    //	fear *= 100;
    //	neutral*= 100;
    //	happiness *= 100;
    //	sadness *= 100;
    //	surprise *= 100;
    // return anger;
    //}
}
