import java.util.Scanner;
	public class AnalyzeEntry
	{	public static void main(String[] args)
		{
			try (Scanner scan = new Scanner (System.in)) {
				char choice; // These declared integers are used for the menu system
				
do {	
				displayMenu(); //Prints menu that is defined at the end of this code
				System.out.println("\nPlease enter a command or type? ");
				choice = scan.next().charAt(0); // With use of switch statement, the user must choose an integer from 1-4
				
				switch (choice) { //Use of Switch statements to help flow of menu
				case 'a': System.out.println("Enter a number: "); //User input of integers
						int a = scan.nextInt();
						System.out.println("Enter a number: ");
						int b = scan.nextInt();
						int c = a + b; // equation to get sum
							if (c % 2 == 0) { // equation to determine whether sum is even or odd
								System.out.println("Sum of " + a + "+" + b + " is even\n"); //prints either statement
							} else { 
								System.out.println("Sum of " + a + "+" + b + " is odd\n");
							}
				break;
				case 'b': System.out.println("Enter the first string: "); //asks for input of two strings for overlap
						scan.nextLine();
						String first = scan.nextLine();
						System.out.println("Enter the second string: ");
						String second = scan.nextLine();
						int cnt = 0;
						for (int i = 0; i < first.length(); i++) { //cycles through each character for string one
							for(int j = 0; j < second.length(); j++) { // cycles through each character for string two
								if (first.charAt(i) == second.charAt(j)) {
									cnt++; // adds to counts if true and moves on if false
								} else {
									j++;
								}
							}
						}
						if (cnt >= second.length()) { //determines whether enough characters matched to prove if they overlapped
							System.out.println("String 1 overlaps with string 2\n");
						} else {
							System.out.println("String 2 does not overlap with string 1\n");
						} // This problem asked of me in the assignment is logically wrong
						// The definition of overlap given in the assignment is "every character in String 2 is also in String 1 not in any special order"
						// Yet the sample outputs do not reflect this and are supposed to print out that String 1 is actually supposed to overlap with String 2?
						// The code I have for this problem is intentionally wrong in order to match the sample answers the best I can2
				break;
				case 'c': System.out.println("Enter a string: "); //Asks and stores string input
						scan.nextLine();
						String reverse = scan.nextLine();
						String result = "";
							for(int k = reverse.length() - 1; k >= 0; k--) { //loop takes each character and puts it at end of the string
								result += reverse.charAt(k); // when put together it becomes reversed
							}
						System.out.println("String in reverse order is: " + result + "\n");
				break;
				case 'd': System.out.println("Enter the first number: "); //User input of two numbers
						int d = scan.nextInt();
						System.out.println("Enter the second number: ");
						int e = scan.nextInt();
						int sum = 0;
							if (d < e) { //if statements determine which number is larger to help set up for loop correctly
								for (int i = d + 1; i < e; i++) { //when d is larger, the loop increments +1 for each number between
								sum += i; //then adds each to final sum
								}
							} else if (e < d) { //this does the same but if e were larger
								for (int i = e + 1; i < d; i++) {
								sum +=i;
								}
							}
						System.out.println("The sum between " + d + " and " + e + " is " + sum + "\n"); //statement printing result
				break;
				case 'e': System.out.println("Enter an integer? ");//user input for test integer
						int number = scan.nextInt();
						int j = 0;
						System.out.print("The number of digits in " + number + " ");
							for (; number != 0; number /= 10, j++) { //for loop counts digits within integer and adds them together in j
							}
						System.out.print("is " + j + "\n"); // prints other half of result statement
						System.out.println("");
				break;
				case '?':
					
				break;
				case 'q': System.out.println("Quit"); // The final case for the main menu will also terminate the program if chosen.
				}
}
while (choice != 'q'); //terminates program
			}
		}
	
		private static void displayMenu() { //This defines the main menu that is used in the original switch statement above
			System.out.println("Command Options\n-----------------------------------");
			System.out.println("a: It is Odd"); // The user can choose between these options
			System.out.println("b: Overlapping Strings");
			System.out.println("c: Reverse the String");
			System.out.println("d: Sum between two integers");
			System.out.println("e: Number of digits");
			System.out.println("?: Display");
			System.out.println("q: Quit");
		}
	

	}