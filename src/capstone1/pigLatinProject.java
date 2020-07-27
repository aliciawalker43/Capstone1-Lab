package capstone1;

import java.util.Scanner;

public class pigLatinProject {

	public static void main(String[] args) {
		
		Scanner scnr= new Scanner(System.in);
		 
		// variable list
		String userInput;
		boolean yesNo= true;
		int indexBegWord= 0;
	
		// Program loop
	   while(yesNo== true){	
		
		 //User's chooses of word.  
		System.out.println( "Please enter a word");
		 userInput= (scnr.next().toLowerCase());
		
		 
		  // find the word beginning
		  
		 String beginLetters= (isConsonants(userInput))+(isVow(userInput));
          
		 //route word beginning
		 
		 //count amount of letters removed from beginning
		   for(int i=0; i< beginLetters.length(); i++) {
			   if (beginLetters.charAt(i) != ' ') {
				   indexBegWord++;
			   }
		   }
			
		 //end of user's word
		   String endOfWord= (userInput.substring(indexBegWord));
		 
		 //Print words in PigLatin
		   if(isConsonants(userInput).equals(beginLetters)){
		       System.out.println(endOfWord + beginLetters +"ay"); //consonants
		       
		   } else if (isVow(userInput).equals(beginLetters)) {
		       System.out.println(userInput + "way");  //Vows */
		   }
		   // String finalWord = userInput.substring(beginLetters.length()) + "-" + beginLetters + "ay";
		   // output.setText(finalWord);
		    
		   
		    //System.out.println(startsWithVow(userInput));
		  
		   System.out.println("Would you like to translate another word? (y/n)");
		    yesNo=scnr.next().startsWith("y");
	     }
}
		 
		 public static String isVow(String word) {
			 String initialVows = word.replaceAll("([^bcdfghjklmnpqrstvwxyz]*).*", "$1");
		   return initialVows; 
		 }  
       
		 //finding the consonants in beginning
		 public static String isConsonants(String word) {
		 String initialConsonants = word.replaceAll("([^aeiouAEIOU]*).*", "$1");
            return initialConsonants;
		 }
		 
		
		 
  }

			
			  
			    
		 
    // if word starts with vowels  
	/*public static void startsWithVow(String userInput) {
		if(userInput.startsWith("a")){
			 System.out.println(userInput+ "way");
		 }else if(userInput.startsWith("i")) {
			 System.out.println(userInput+ "way");
		 }else if(userInput.startsWith("e")) {
			 System.out.println(userInput+ "way");
		 }else if(userInput.startsWith("o")) {
			 System.out.println(userInput+ "way");
		 }else if(userInput.startsWith("u")) {
			 System.out.println(userInput+ "way");*? */
	  
	
  
