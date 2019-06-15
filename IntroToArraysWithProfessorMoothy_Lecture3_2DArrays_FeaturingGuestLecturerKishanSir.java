import java.util.Scanner;

public class IntroToArraysWithProfessorMoothy_Lecture3_2DArrays_FeaturingGuestLecturerKishanSir {
    public static void main (String[] args) {
        Scanner one = new Scanner(System.in);

        System.out.println("Please input 8 numbers");

        int p = one.nextInt();
        int o = one.nextInt();
        int d = one.nextInt();
        int h = one.nextInt();
        int q = one.nextInt();
        int r = one.nextInt();
        int m = one.nextInt();
        int n = one.nextInt();

        int a[][] = {{p,o},{d,h}};
        int b[][] = {{q,r},{m,n}};
        int c[][] = new int [2][2];

        // char add = '+';
        // char sub = '-';
        // char mul = 'x';

        Scanner sc = new Scanner(System.in);

        System.out.println("Please choose an operation: ");
        System.out.println("1. Addition \n2. Subtraction \n3. Multiplication");
        int menu = sc.nextInt();

        switch (menu) {
            case 1: 
            for(int i = 0; i < 2; i++) {
                for(int j = 0; j < 2; j++) {
                    c[i][j] = a[i][j] + b[i][j];
                }
            }
    
            for(int i = 0; i < 2; i++) {
                for(int j = 0; j < 2; j++) {
                    System.out.print(c[i][j] + "\t");
                }
                System.out.println("");
            }
            
            break;

            case 2: 
            for(int i = 0; i < 2; i++) {
                for(int j = 0; j < 2; j++) {
                    c[i][j] = a[i][j] - b[i][j];
                }
            }

            for(int i = 0; i < 2; i++) {
                for(int j = 0; j < 2; j++) {
                    System.out.print(c[i][j] + "\t");
                }
                System.out.println("");
            }    
            
            break;

            case 3: 
            for(int i = 0; i < 2; i++) {
                for(int j = 0; j < 2; j++) {
                    int sum = 0;
                    for(int k = 0; k < 2; k++) {
                        sum += a[i][k] * b[k][j];                       
                    }   
                    c[i][j] = sum;                   
                }
            }
    
            for(int i = 0; i < 2; i++) {
                for(int j = 0; j < 2; j++) {
                    System.out.print(c[i][j] + "\t");
                }
                System.out.println("");
            }    
                
            break;

            default: System.out.println("Please choose Addition, Subtraction or Multiplication.");
            break;
        }

    }
}
