import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;


public class FalloutHacker {

	public static Random rand = new Random();
	public static Scanner sc = new Scanner(System.in);
	
	public static void readTXT(List<String> words) throws IOException{
		
		String token = "";
		
		Scanner sc = new Scanner(new File("enable1.txt"));
		
		while(sc.hasNext()){
			token=sc.next();
			words.add(token);
		}
		
		sc.close();
		
	}
	
	public static List<String> selectWords(int difficulty, List<String> words){
		
		List<String> ret = new ArrayList<String>();
		int index = 0;
		
		if(difficulty == 1){
			for(int i = 0; i < 8; i++){
				index = rand.nextInt(words.size());
				while(words.get(index).length() != 4){
					index = rand.nextInt(words.size());
				}
				ret.add(words.get(index));
			}
		}else if(difficulty == 2){
			for(int i = 0; i < 11; i++){
				index = rand.nextInt(words.size());
				while(words.get(index).length() != 6){
					index = rand.nextInt(words.size());
				}
				ret.add(words.get(index));
			}
		}else if(difficulty == 3){
			for(int i = 0; i < 16; i++){
				index = rand.nextInt(words.size());
				while(words.get(index).length() != 8){
					index = rand.nextInt(words.size());
				}
				ret.add(words.get(index));
			}
		}
		
		return ret;
		
	}
	
	public static int compare(String input, String correct){
		
		int correctLetters = 0;
		
		char[] inputChar = input.toLowerCase().toCharArray();
		char[] correctChar = correct.toLowerCase().toCharArray();
		
		for(int i = 0; i < inputChar.length; i++){
			if(inputChar[i] == correctChar[i]){
				correctLetters++;
			}
		}
		
		return correctLetters;
		
	}
	
	
	
	public static void main(String[] args) throws IOException{
		
		List<String> words = new ArrayList<String>();
		readTXT(words);
		
		System.out.println("Difficulty (1-3):");
		int choice = sc.nextInt();
		while(!(choice < 4 && choice > 0)){
			choice = sc.nextInt();
		}
		
		List<String> selectedWords = selectWords(choice, words);
		int index = rand.nextInt(selectedWords.size());
		String correct = selectedWords.get(index);
		
		System.out.println("Words:");
		for(String s : selectedWords){
			if(s.equals(correct)){
				System.out.println(s + " - correct");
			}else{
				System.out.println(s);
			}
		}
		
		System.out.println();
		
		int guesses = 4;

		while(guesses > 0){
			
			System.out.println("Guess " + guesses + ":");
			String guess = sc.next();
			
			if(guess.equalsIgnoreCase(correct)){
				System.out.println("Correct!");
				break;
			}else{
				System.out.println("Similarity: " + compare(guess, correct));
			}
			
			guesses--;
		}
		if(guesses == 0){
			System.out.println("Better luck next time");
		}
		
	}
}
