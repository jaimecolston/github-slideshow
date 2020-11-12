import java.util.Scanner;

  public class MadLib {
      public static void main(String[] args){

          Scanner userInput = new Scanner(System.in);      
          int weightLimit = 50;
    
          System.out.println("How much weight do you want to lose?");
          
          int age = Integer.parseInt(userInput.nextLine());


          if (pounds < weightLimit){
            System.out.printf("You should diet slowly!\n");
            System.exit(0);
          } else {

          Scanner userInput = new Scanner(System.in);
          System.out.println("Enter a name: ");
          String name = userInput.nextLine();
          System.out.println("Give me an adjective: ");
          String adjective = userInput.nextLine();
          System.out.println("Give me a verb: ");
          String verbOne = userInput.nextLine();
          System.out.println("Give me another verb: ");
          String verbTwo = userInput.nextLine();
          System.out.println("Give me another verb: ");
          String verbThree = userInput.nextLine();
          System.out.println("Give me a number: ");
          String number = userInput.nextLine();
          System.out.println("Give me your name: ");
          String yourName = userInput.nextLine();

          System.out.printf("This is the analysis: \n");
          System.out.printf("\n Dear %s,", name);
          System.out.printf("\n You are really %s and we should help you %s weight!", adjective, verbOne);
          System.out.printf("\n You should %s at least %s times a week and %s portioned meals.", verbTwo, number, verbThree);
          System.out.printf("\n Sincerely, %s \n", yourName);

          }
      }    

}

