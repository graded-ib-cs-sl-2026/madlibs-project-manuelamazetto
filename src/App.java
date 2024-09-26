import java.util.Scanner;

public class App {
    
    /**
     * This method is the primary driver method for your program.
     * It should primarily call other methods to do its work.
     * Do NOT edit this method until after you have fully satisfied the reqs for a 5
     */

    public void start() {
        String userName = getUserName();
        printGreeting(userName);
        printInstructions();
        doMadlibOne();
        doMadlibTwo();
        doMadlibThree();
    }
    
    /**
     * Document what this method does here!
     */
    


    

    public String getUserName() {
        System.out.println("      ▄▄▌ ▐ ▄▌▄▄▄ .▄▄▌   ▄▄·       • ▌ ▄ ·. ▄▄▄ .  ▄▄▄▄▄      ");
        System.out.println("      ██· █▌▐█▀▄.▀·██•  ▐█ ▌▪ ▄█▀▄ ·██ ▐███▪▀▄.▀·  •██   ▄█▀▄ ");
        System.out.println("      ██▪▐█▐▐▌▐▀▀▪▄██ ▪ ██ ▄▄▐█▌.▐▌▐█ ▌▐▌▐█·▐▀▀▪▄   ▐█.▪▐█▌.▐▌");
        System.out.println("      ▐█▌██▐█▌▐█▄▄▌▐█▌ ▄▐███▌▐█▌.▐▌██ ██▌▐█▌▐█▄▄▌   ▐█▌·▐█▌.▐▌");
        System.out.println("       ▀▀▀▀ ▀▪ ▀▀▀ .▀▀▀ ·▀▀▀  ▀█▄▀▪▀▀  █▪▀▀▀ ▀▀▀    ▀▀▀  ▀█▄▀▪");
        System.out.println("             • ▌ ▄ ·.  ▄▄▄· ·▄▄▄▄  ▄▄▌  ▪  ▄▄▄▄· .▄▄ ·");
        System.out.println("             ·██ ▐███▪▐█ ▀█ ██· ██ ██•  ██ ▐█ ▀█▪▐█ ▀.");
        System.out.println("             ▐█ ▌▐▌▐█·▄█▀▀█ ▐█▪ ▐█▌██ ▪ ▐█·▐█▀▀█▄▄▀▀▀█");
        System.out.println("             ██ ██▌▐█▌▐█▪ ▐▌██. ██ ▐█▌ ▄▐█▌██▄▪▐█▐█▄▪▐█");
        System.out.println("             ▀▀  █▪▀▀▀ ▀  ▀ ▀▀▀▀▀• .▀▀▀ ▀▀▀·▀▀▀▀  ▀▀▀▀");
        System.out.println("Please enter your name below!");
        Scanner input = new Scanner(System.in);
        String name = input.nextLine();
        return name;
       
    }

    public void printGreeting(String userName){
        System.out.println("Hello, " + userName);
    }
    

    public void printInstructions() {
        System.out.println ("Put in the following information to get a fun madlib!");
        System.out.println ("Please select which madlib you would like by typing the following number:");
        System.out.println ("1st Story: Simple");
        System.out.println("2nd Story: Tennis" );
        System.out.println("3rd Story: Haunted House");
     }

    
     public void doMadlibOne() {
        String nounOne = getNounOne();
        String adjectiveOne = getAdjectiveOne();
        String adjectiveTwo = getAdjectiveTwo();
        String verbOne = getVerbOne();
        String nounTwo = getNounTwo();
        String adjectiveThree = getAdjectiveThree();
        String adjectiveFour = getAdjectiveFour();
        String adjectiveFive = getAdjectiveFive();
        String nounThree = getNounThree();
        String verbTwo = getVerbTwo();
        String adjectiveSix = getAdjectiveSix();
        String verbThree = getVerbThree();
       System.out.println("Once upon a time, there was a(n) " + nounOne + ". It was a(n) " + adjectiveOne + " " +  adjectiveTwo + " " + nounOne + ". One day, it wanted to go " + verbOne + " but its " + nounTwo + " was stopping it because its " + nounTwo + " was stopping it because it was very " + adjectiveThree + ". To fix this, the " + nounOne + " gave the " + nounTwo + " a " + adjectiveFour + " " + adjectiveFive + " " + nounThree + ". Finally, the " + nounOne + " went to " + verbOne + " but once it got there, it was " + verbTwo + " the " + adjectiveSix + " " + nounOne + "went home and " + verbThree + " its " + nounThree);
     }
     public String getNounOne() {
        System.out.println("Enter a noun below");
        Scanner input = new Scanner(System.in);
        String nounOne = input.nextLine();
        return nounOne;
     }
    public String getAdjectiveOne() {
        System.out.println("Enter an adjective below");
        Scanner input = new Scanner(System.in);
        String adjectiveOne = input.nextLine();
        return adjectiveOne;
    }
    public String getAdjectiveTwo() {
        System.out.println("Enter an adjective below");
        Scanner input = new Scanner(System.in);
        String adjectiveTwo = input.nextLine();
        return adjectiveTwo;
     }
     public String getNounTwo() {
        System.out.println("Enter a noun below");
        Scanner input = new Scanner(System.in);
        String nounTwo = input.nextLine();
        return nounTwo;
     }
public String getVerbOne() {
        System.out.println("Enter an ing verb below");
        Scanner input = new Scanner(System.in);
        String verbOne = input.nextLine();
        return verbOne; 
}
public String getAdjectiveThree() {
    System.out.println("Enter an adjective below");
    Scanner input = new Scanner(System.in);
    String adjectiveThree = input.nextLine();
    return adjectiveThree;
}
public String getAdjectiveFour() {
    System.out.println("Enter an adjective below");
    Scanner input = new Scanner(System.in);
    String adjectiveFour = input.nextLine();
    return adjectiveFour;
}
public String getAdjectiveFive() {
    System.out.println("Enter an adjective below");
    Scanner input = new Scanner(System.in);
    String adjectiveFive = input.nextLine();
    return adjectiveFive;
}
public String getNounThree() {
    System.out.println("Enter a noun below");
    Scanner input = new Scanner(System.in);
    String nounThree = input.nextLine();
    return nounThree;
}
public String getVerbTwo() {
    System.out.println("Enter a verb below");
    Scanner input = new Scanner(System.in);
    String verbTwo = input.nextLine();
    return verbTwo;
}
public String getAdjectiveSix() {
    System.out.println("Enter an adjective below");
    Scanner input = new Scanner(System.in);
    String adjectiveSix = input.nextLine();
    return adjectiveSix;
}
public String getVerbThree() {
    System.out.println("Enter an past tense verb below");
    Scanner input = new Scanner(System.in);
    String verbThree = input.nextLine();
    return verbThree;
}
public void doMadlibTwo(){

}
public void doMadlibThree(){

}
    

    // add and implement the other methods you need in this area below!
    
  

    /* DO NOT TOUCH OR EDIT THE METHOD BELOW! ADD NO CODE BELOW THIS LINE */
    public static void main(String[] args) throws Exception {
        new App().start();
    }
}
