class HelloWorld {
    public static void main(String[] args) {
        // Print normally
        System.out.println("Hello, World!");
        System.out.println("Printed normally, using System.out.println(). \n");

        // Print using a predeclared string.
        String sayHello = "Hello, World!";
        System.out.println(sayHello);
        System.out.println("Printed using a predeclared string. \n");

        // Print using a char array, pretty stupid.
        char[] helloWorld = { 'H', 'e', 'l', 'l', 'o', ',', ' ', 'W', 'o', 'r', 'l', 'd', '!' };

        for (int i = 0; i < helloWorld.length; i++) {
            System.out.print(helloWorld[i]);
        }
        System.out.println("\nPrinted using a predeclared char array and printing out each index in a for loop. \n");


        // Print using biary, extremely stupid.
        String binaryHelloWorld = "01001000 01100101 01101100 01101100 01101111 00101100 00100000 01010111 01101111 01110010 01101100 01100100 00100001";
        String output = "";

        for (int index = 0; index < binaryHelloWorld.length(); index += 9) {
            String temp = binaryHelloWorld.substring(index, index + 8);
            int num = Integer.parseInt(temp, 2);
            char letter = (char) num;
            output = output + letter;
        }
        System.out.print(output);
        System.out.println("\nPrinted using a predeclared string of binary numbers, converting those numbers into text in a for loop and outputting the converted string. \n");
    }
}
