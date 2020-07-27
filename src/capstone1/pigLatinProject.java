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
          
		 
		 
		 //count amount of letters removed from beginning
		   for(int i=0; i< beginLetters.length(); i++) {
			   if (beginLetters.charAt(i) != ' ') {
				   indexBegWord++;
			   }
		   }
			
		 //separate end of user's word
		   String endOfWord= (userInput.substring(indexBegWord));
		 
		 //route word- Print words in PigLatin
		   if(isConsonants(userInput).equals(beginLetters)){
		       System.out.println(endOfWord + beginLetters +"ay"); //consonants
		       
		   } else if (isVow(userInput).equals(beginLetters)) {
		       System.out.println(userInput + "way");  //Vows */
		   }
		   
		   System.out.println("Would you like to translate another word? (y/n)");
		    yesNo=scnr.next().startsWith("y");
	     }
}
	
	
	
	
		 //Methods for extracting beginning of words
	     
		 public static String isVow(String word) {
			 String initialVows = word.replaceAll("([^bcdfghjklmnpqrstvwxyz]*).*", "$1");
		   return initialVows; 
		 }  
       
		 public static String isConsonants(String word) {
		 String initialConsonants = word.replaceAll("([^aeiouAEIOU]*).*", "$1");
            return initialConsonants;
		 }
		 
		
		 
  }

		    
	