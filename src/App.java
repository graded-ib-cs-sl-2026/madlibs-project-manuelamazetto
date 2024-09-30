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
        // The name of the user is asked and then, in the line below (printGreeting)
        // it's used to greet the user with their name. Return name; returns the user's
        // name.
    }

    public void printGreeting(String userName) {
        System.out.println("Hello, " + userName);
        // This prints out the username that was collected above.
    }

    public void printInstructions() {
        System.out.println("Put in the following information to get a fun madlib!");
        // System.out.println prints out the intructions for the task.
    }

    public void doMadlib() {

        Scanner input = new Scanner(System.in);

        System.out.println("What story would you like to do?");
        System.out.println("[1] [2] [3]");
        // This is setting up for the if statements
        int storyChosen = input.nextInt();
        input.nextLine();
        // input.nextLine asks for the next line, so the next line the user types in
        // will affect the code.
        if (storyChosen == 1) {
            // the if statement asks if what the user typed in was 1. If it was, then it'll
            // print out the first story.
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
            // I like when it's organized, so this is setting up the method names for all
            // the different methods the story is going to use. These are the same ones used
            // in the beginning.
            System.out.println("Once upon a time, there was a(n) " + nounOne + ". It was a(n) " + adjectiveOne + " "
                    + adjectiveTwo + " " + nounOne + ". One day, it wanted to go " + verbOne + " but its " + nounTwo
                    + " was stopping it because its " + nounTwo + " was stopping it because it was very "
                    + adjectiveThree + ". To fix this, the " + nounOne + " gave the " + nounTwo + " a " + adjectiveFour
                    + " " + adjectiveFive + " " + nounThree + ". Finally, the " + nounOne + " went to " + verbOne
                    + " but once it got there, it was " + verbTwo + " the " + adjectiveSix + " " + nounOne
                    + "went home and " + verbThree + " its " + nounThree);
            // This prints out the first story. It uses all the previous words from the
            // methods in the story.
        } else if (storyChosen == 2) {
            // else if means that if storyChosen is not equal to one but is still equal to
            // something specific, like, in this case, two, what should happen. For exampe,
            // if it's 3 put in, this else will not trigger this.
            String nounone = getNounone();
            String nountwo = getNountwo();
            String verbone = getVerbone();
            String verbtwo = getVerbtwo();
            String nounthree = getNounthree();
            String adjectiveone = getAdjectiveone();
            String nounfour = getNounfour();
            String adjectivetwo = getAdjectivetwo();
            String verbthree = getVerbthree();
            String adjectivethree = getAdjectivethree();
            System.out.println("In tennis there are two main serves, the " + nounone + " serve and the " + nountwo
                    + " serve. The first serve will " + verbone + " your performance while the second serve will "
                    + verbtwo + " your game. Then, there are two receiving plays. There are called the " + nounthree
                    + " and " + nounfour + ". The " + nounthree + " play is very " + adjectiveone + " and the "
                    + nounfour + " play is very " + adjectivetwo + ". Overall, all of these help " + verbthree
                    + " your tennis skills and they will make you " + adjectivethree + " at tennis.");
        } else if (storyChosen == 3) {
            String firstNoun = getFirstNoun();
            String secondNoun = getSecondNoun();
            String firstDaytime = getFirstDaytime();
            String firstAdjective = getFirstAdjective();
            String firstName = getFirstName();
            String secondAdjective = getSecondAdjective();
            String secondName = getSecondName();
            String firstVerb = getFirstVerb();
            String firstPlace = getFirstPlace();
            String thirdAdjective = getThirdAdjective();
            System.out.println("A group of " + firstNoun + " entered a " + secondNoun + " in the middle of the "
                    + firstDaytime + ". It was " + firstAdjective
                    + " dark meaning they couldn’t see anything. One of the " + firstNoun + " named " + firstName
                    + " started to get " + secondAdjective + " so their other friend, " + secondName + " " + firstVerb
                    + " to cheer him up. Once they finally left the " + secondNoun + ", " + firstName
                    + " cheered up and they went to a(n) " + firstPlace + " to calm everyone down after their "
                    + thirdAdjective + " adventure at the " + secondNoun + ".");
        } else {
                                         System.out.println("You did the wrong thing! Please restart if you would like to play correctly.");
            // this else statement accounts for everything that's not one, two or three. So,
            // if someone types in another number or something like a word, it will tell you
            // to do it correctly.
        }

    }

    }

    public String getNounOne() {
        System.out.println("Enter a noun below");
        Scanner input = new Scanner(System.in);
        String nounOne = input.nextLine();
        return nounOne;
    }
    // This is asking for the first noun in story one. It scans for a response then
    // asks for an input. The input is used for the noun and whatever noun the
    // person puts will be used for the madlibs.

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

    public String getNounone() {
        System.out.println("Enter a noun below");
        Scanner input = new Scanner(System.in);
        String nounone = input.nextLine();
        return nounone;
    }

    public String getNountwo() {
        System.out.println("Enter a noun below");
        Scanner input = new Scanner(System.in);
        String nountwo = input.nextLine();
        return nountwo;
    }

    public String getVerbone() {
        System.out.println("Enter a verb below");
        Scanner input = new Scanner(System.in);
        String verbone = input.nextLine();
        return verbone;
    }

    public String getVerbtwo() {
        System.out.println("Enter a verb below");
        Scanner input = new Scanner(System.in);
        String verbtwo = input.nextLine();
        return verbtwo;
    }

    public String getNounthree() {
        System.out.println("Enter a noun below");
        Scanner input = new Scanner(System.in);
        String nounthree = input.nextLine();
        return nounthree;
    }

    public String getNounfour() {
        System.out.println("Enter a noun below");
        Scanner input = new Scanner(System.in);
        String nounfour = input.nextLine();
        return nounfour;
    }

    public String getAdjectiveone() {
        System.out.println("Enter an adjective below");
        Scanner input = new Scanner(System.in);
        String adjectiveone = input.nextLine();
        return adjectiveone;
    }

    public String getAdjectivetwo() {
        System.out.println("Enter an adjective below");
        Scanner input = new Scanner(System.in);
        String adjectiveone = input.nextLine();
        return adjectiveone;
    }

    public String getVerbthree() {
        System.out.println("Enter a verb below");
        Scanner input = new Scanner(System.in);
        String verbthree = input.nextLine();
        return verbthree;
    }

    public String getAdjectivethree() {
        System.out.println("Enter an adjective below");
        Scanner input = new Scanner(System.in);
        String adjectivethree = input.nextLine();
        return adjectivethree;
    }

    public String getFirstNoun() {
        System.out.println("Enter a noun below");
        Scanner input = new Scanner(System.in);
        String firstNoun = input.nextLine();
        return firstNoun;
    }

    public String getSecondNoun() {
        System.out.println("Enter a noun below");
        Scanner input = new Scanner(System.in);
        String secondNoun = input.nextLine();
        return secondNoun;
    }

    public String getFirstDaytime() {
        System.out.println("Enter a daytime below (eg. day, night, midnight, dusk, etc)");
        Scanner input = new Scanner(System.in);
        String firstDaytime = input.nextLine();
        return firstDaytime;
    }

    public String getFirstAdjective() {
        System.out.println("Enter an adjective below");
        Scanner input = new Scanner(System.in);
        String firstAdjective = input.nextLine();
        return firstAdjective;
    }

    public String getFirstName() {
        System.out.println("Enter a name below");
        Scanner input = new Scanner(System.in);
        String firstName = input.nextLine();
        return firstName;
    }

    public String getSecondAdjective() {
        System.out.println("Enter an adjective below");
        Scanner input = new Scanner(System.in);
        String secondAdjective = input.nextLine();
        return secondAdjective;
    }

    public String getSecondName() {
        System.out.println("Enter a name below");
        Scanner input = new Scanner(System.in);
        String secondName = input.nextLine();
        return secondName;
    }

    public String getFirstVerb() {
        System.out.println("Enter a verb below");
        Scanner input = new Scanner(System.in);
        String firstVerb = input.nextLine();
        return firstVerb;
    }

    public String getFirstPlace() {
        System.out.println("Enter a place below");
        Scanner input = new Scanner(System.in);
        String adjectivethree = input.nextLine();
        return adjectivethree;
    }

    public String getThirdAdjective() {
        System.out.println("Enter an adjective below");
        Scanner input = new Scanner(System.in);
        String thirdAdjective = input.nextLine();
        return thirdAdjective;
    }
    // add and implement the other methods you need in this area below!

    /* DO NOT TOUCH OR EDIT THE METHOD BELOW! ADD NO CODE BELOW THIS LINE */
    public static void main(String[] args) throws Exception {
        new App().start();

    }
}
