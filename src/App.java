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
        doMadlib();
    }
    
    /**
     * Document what this method does here!
     */
    


    

    public String getUserName() {
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
     }
    
     public void doMadlib() {
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
       System.out.println("Once upon a time, there was a " + nounOne + ". It was an " + adjectiveOne + adjectiveTwo + nounOne + ". One day, it wanted to go " + verbOne + " but its " + nounTwo + " was stopping it because its " + nounTwo + " was stopping it because it was very " + adjectiveThree + ". To fix this, the " + nounOne + " gave the " + nounTwo + " a " + adjectiveFour + adjectiveFive + nounThree + ". Finally, the " + );
     }
     public String getNounOne() {
        System.out.println("Type a noun below");
        Scanner input = new Scanner(System.in);
        String nounOne = input.nextLine();
        return nounOne;
     }
    public String getAdjectiveOne() {
        System.out.println("Type an adjective below");
        Scanner input = new Scanner(System.in);
        String adjectiveOne = input.nextLine();
        return adjectiveOne;
    }
    public String getAdjectiveTwo() {
        System.out.println("Type an adjective below");
        Scanner input = new Scanner(System.in);
        String adjectiveTwo = input.nextLine();
        return adjectiveTwo;
     }
     public String getNounTwo() {
        System.out.println("Type a noun below");
        Scanner input = new Scanner(System.in);
        String nounTwo = input.nextLine();
        return nounTwo;
     }

public String getVerbOne() {
        System.out.println("Type a verb below");
        Scanner input = new Scanner(System.in);
        String verbOne = input.nextLine();
        return verbOne; 
}
public String getAdjectiveThree() {
    System.out.println("Type an adjective below");
    Scanner input = new Scanner(System.in);
    String adjectiveThree = input.nextLine();
    return adjectiveThree;
}
public String getAdjectiveFour() {
    System.out.println("Type an adjective below");
    Scanner input = new Scanner(System.in);
    String adjectiveFour = input.nextLine();
    return adjectiveFour;
}
public String getAdjectiveFive() {
    System.out.println("Type an adjective below");
    Scanner input = new Scanner(System.in);
    String adjectiveFive = input.nextLine();
    return adjectiveFive;
}
public String getNounThree() {
    System.out.println("Type a noun below");
    Scanner input = new Scanner(System.in);
    String nounThree = input.nextLine();
    return nounThree;
}
public String getVerbTwo() {
    System.out.println("Type a verb below");
    Scanner input = new Scanner(System.in);
    String verbTwo = input.nextLine();
    return verbTwo;
}
public String getAdjectiveSix() {
    System.out.println("Type an adjective below");
    Scanner input = new Scanner(System.in);
    String adjectiveSix = input.nextLine();
    return adjectiveSix;
}
public String getVerbThree() {
    System.out.println("Type a verb below");
    Scanner input = new Scanner(System.in);
    String verbThree = input.nextLine();
    return verbThree;
}

    

    // add and implement the other methods you need in this area below!
    
  

    /* DO NOT TOUCH OR EDIT THE METHOD BELOW! ADD NO CODE BELOW THIS LINE */
    public static void main(String[] args) throws Exception {
        new App().start();
    }
}
