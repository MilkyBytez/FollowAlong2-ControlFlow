package part06;

// Video: https://www.youtube.com/watch?v=xk4_1vDrzzo&t=4128s
//        if statements start at about 68:48 — stop at about 74:54
// Guide: GUIDE.md in this folder, steps 1–6
//
// Part 06 — if, else if, else
//
// SECTION A — FOLLOW ALONG: type the code from the video (or the guide) in this class.
//    His class is called Main. Yours is called IfStatements.
//    Leave the "package part06;" line and the "public class IfStatements" line alone.
//    Type everything else yourself.
//
// SECTION B — COMMENTS: when you finish, put a // comment ABOVE every line of code,
//    saying in YOUR OWN WORDS what that line does. The README shows an example.

public class IfStatements {
    public static void main(String[] args) {
        // an integer named age is equal to 75
        int age = 75;
        // first condition, if age is truly equal to 75
        if (age == 75) {
            // if age is equal to 75, then print the following, OK boomer! and go to the next line
            System.out.println("OK boomer!");
            // else if statement, if the previous statment above was untrue it comes here to check if age is greater or
            // equal to 18.
        } else if (age >= 18) {
            // If the following statement was true, prints to the system You are an adult! and goes to the next line
            System.out.println("You are an adult!");
            // else if statement, if the previous was not c
        }  else if (age >= 13) {
            System.out.println("You are a teen!");
            // final else if nothing is true, this must be the answer it prints to the console
        } else {
            // Final result it prints
            System.out.println("You are not a teen!");
        }
    }

}
