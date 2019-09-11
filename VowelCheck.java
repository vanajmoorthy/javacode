// Vanaj Moorthy, 19/08/19

// ISC Practical Midterm Paper

// This is some awful code, ignore the procedural nature an overall -1-ness of it; thanks.

import java.util.Scanner;

public class VowelCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking input for a sentence.
        System.out.println("Enter your sentence");
        String sentence = sc.nextLine();

        // Converting string to lowercase to make the if statement simpler.
        sentence = sentence.toLowerCase();

        // Getting last character of the string.
        char lastIndex = sentence.charAt(sentence.length() - 1);

        // Checking that lastIndex is equal to either '.', '!', or '?'.
        if (lastIndex == '.' || lastIndex == '!' || lastIndex == '?') {
            // Splitting the sentence into a string array with different words based on the whitespaces.
            String[] splitSentence = sentence.split(" ");

            // Initialiing vowelCount variable.
            int vowelCount = 0;

            // Running loop iterating over the words in splitSentence.
            for (int i = 0; i < splitSentence.length; i++) {

                // Getting first and last character of each word.
                char first = splitSentence[i].charAt(0);
                char last = splitSentence[i].charAt(splitSentence[i].length() - 1);

                // Iterating vowelCount by 1 if the first and last character are vowels.
                if ((first == 'a' || first == 'e' || first == 'i' || first == 'o' || first == 'u') && (last == 'a' || last == 'e' || last == 'i' || last == 'o' || last == 'u')) {
                    vowelCount++;
                }
            }

            // Creating new string with size as large as vowelCount.
            String[] vowels = new String[vowelCount];
            int vowelsCount = 0;

            // Creating new string with size as large as original length - vowelCount.
            String[] consonants = new String[splitSentence.length - vowelCount];
            int consonantsCount = 0;

            // Running the same loop to add vowels to vowel array and consonants to consonant array.
            for (int i = 0; i < splitSentence.length; i++) {
                
                // Getting first and last char again.
                char first = splitSentence[i].charAt(0);
                char last = splitSentence[i].charAt(splitSentence[i].length() - 1);

                if ((first == 'a' || first == 'e' || first == 'i' || first == 'o' || first == 'u') && (last == 'a' || last == 'e' || last == 'i' || last == 'o' || last == 'u')) {
                    vowels[vowelsCount] = splitSentence[i];
                    vowelsCount++;
                } else {
                    consonants[consonantsCount] = splitSentence[i];
                    consonantsCount++;
                }
            }

            // Adding space to the end of each word.
            for (int i = 0; i < vowels.length; i++) {
                vowels[i] = vowels[i] + " ";
            }

            for (int i = 0; i < consonants.length; i++) {
                consonants[i] = consonants[i] + " ";
            }

            // Printing out the vowels first, then the consonants.
            for (int i = 0; i < vowels.length; i++) {
                System.out.print(vowels[i].toUpperCase());
            }

            for (int i = 0; i < consonants.length; i++) {
                System.out.print(consonants[i].toUpperCase());
            }

            // Printing out number of vowel words.
            System.out.println(" "); 
            System.out.println("Number of vowels are: " + vowelCount);
        } else {
            // Printing invalid input if last char isn't '.', '!', or '?'.
            System.out.println("Your input is invalid. Please try again.");
            System.exit(0);
        }
    }
}

