import java.util.Scanner; // Importing Scanner class

public class Counter {
    public static void main(String[] args) { // Main Method
        Scanner sc = new Scanner(System.in); 
        // Taking user input
        String name = sc.nextLine();

        if (name.charAt(name.length() - 1) != '?' && name.charAt(name.length() - 1) != '.') { // Checking if last letter is '?' or ''
            System.out.println("invalid input");
            System.exit(0); // Exiting program is input is invalid
        }

        String[] nameCon = name.split(" "); // Converting string to string array, splitting at every whitespace
        
        for (int i = 0; i < nameCon.length; i++) { // Loop to uppercase first letter of every word
            
            char p = Character.toUpperCase(nameCon[i].charAt(0));
            nameCon[i] = nameCon[i].replace(nameCon[i].charAt(0), p);
            System.out.print(nameCon[i] + " ");
           
        }
    
        System.out.print("\n");
        
        // Printing headings properly
        
        System.out.print("Word\t");
        System.out.print("Vowel\t");
        System.out.print("Consonants\t");
        System.out.print("\n");
         
        // Initialising counter variables
        
        int counterV = 0;
        int counterC = 0;
        
        for (int i = 0; i < nameCon.length; i++) { // Loop to go through each word of the original stringg
            for (int j = 0; j < nameCon[i].length(); j++) { // Nested loop to count vowels and consonants
                nameCon[i] = nameCon[i].toLowerCase(); 
                char[] charName = nameCon[i].toCharArray();
                if (charName[j] == 'a' || charName[j] == 'e' || charName[j] == 'i' || charName[j] == 'o' || charName[j] == 'u') { // If statement to count vowels
                    counterV++; // Increasing counter
                }
                if (charName[j] != 'a' && charName[j] != 'e' && charName[j] != 'i' && charName[j] != 'o' && charName[j] != 'u' && charName[j] != ' ' && charName[j] != '?' && charName[j] != '.') {
                    // if statement to count consonants, accounting for corner cases like whitespaces and special characters
                    // Increasing counter
                    counterC++;
                }
            }
            // Printing formatted output 
            System.out.print("\n");
            System.out.print(nameCon[i] + "\t");
            System.out.print(counterV + "\t");
            System.out.print(counterC + "\t");
            System.out.print("\n");
            
            // Reinitalising counter variables to zero for next word
            
            counterV = 0;
            counterC = 0;
           
        }
    }
}


