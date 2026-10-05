import java.util.Scanner;

public class Array12{
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        
        int[] numbers = new int[10];

        
        for (int index = 0; index < numbers.length; index++){
            numbers[index] = -1;
        }
            for (int index = 0; index < 10; index++){
    `        System.out.print("Enter a number between 10 and 100: ");
                 int number = input.nextInt();

                if (number < 10 || number > 100) {
                    System.out.println("Invalid number. Enter a number between 10 and 100.");
                        index--;
                          continue;
                 }

                          boolean duplicate = false;

                            for (int value = 0; value < numbers.length; value++) {
                                if (numbers[value] == number) {
                                    duplicate = true;
                                      break;
                                }
                               }

            
                          if (duplicate) {
                             for (int j = 0; j < numbers.length; j++) {
                                if (numbers[j] == -1) {
                                    numbers[j] = number;
                                    break;
                                }
                            }

            } else {
                System.out.println("Duplicate number. It will not be stored.");
            }
        }

      
        System.out.println("\nNumbers without duplicates:");

        for (int index = 0; index < numbers.length; index++) {
            if (numbers[index] != -1) {
                System.out.println(numbers[index]);
            }
        }

        input.close();
    }
}
n
