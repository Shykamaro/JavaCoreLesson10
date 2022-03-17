package lviv.lgs.homework;

import java.util.Scanner;

public class Homework2 {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);

		System.out.println("¬водимо слово");

		String word = scanner.nextLine();
		
        System.out.println(replaceVowels(word));
	}
		static String replaceVowels(String word) {

		
		char wordArray[] = word.toCharArray();

		char vowelArray[] = { 'а', 'о', '≥', 'и', 'у', 'е' };

		for (int i = 0; i < wordArray.length; i++) {

			for (int j = 0; j < vowelArray.length; j++) {

				if (wordArray[i] == vowelArray[j]) {
					wordArray[i] = '-';
				}
			}
		}
		String newWord = new String(wordArray);
		return newWord;
	}
}
