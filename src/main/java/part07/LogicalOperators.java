package part07;

// Video: https://www.youtube.com/watch?v=xk4_1vDrzzo&t=4843s
//        logical operators start at about 80:43 — stop at about 87:47
// Guide: GUIDE.md in this folder, steps 1–6
//
// Part 07 — the logical operators: && (and), || (or), ! (not)
//
// SECTION A — FOLLOW ALONG: type the code from the video (or the guide) in this class.
//    His class is called Main. Yours is called LogicalOperators.
//    Leave the "package part07;" line and the "public class LogicalOperators" line alone.
//    The import line goes BETWEEN them (the guide shows where).
//
// SECTION B — COMMENTS: when you finish, put a // comment ABOVE every line of code,
//    saying in YOUR OWN WORDS what that line does. The README shows an example.

import java.util.Scanner;

public class LogicalOperators {
    public static void main(String[] args) {
        // new integer called temp is created with value set at 35
        int temp = 35;
        // condition if statement testing if temp is larger than 30
        if (temp > 30) {
            // if condition is true, prints the following
            System.out.println("It is hot outside!");
            // 2nd condition being tested, checks for temp if larger or equal to 20
            // AND less or equal to 30
        } else if (temp >= 20 && temp <= 30) {
            // if condition is true, prints the following
            System.out.println("It is warm outside!");
            // Last resort, else statement
        } else {
            // 3rd condition since now were true, prints the following
            System.out.println("It is cold outside!");
        }
        // creation of scanner, called scanner
        Scanner scanner = new Scanner(System.in);
        // Askes user a question for input
        System.out.println("You are playing a game! Press q or Q to quit");
        // New string created called response and takes scanner input
        String response = scanner.next();

        // first condition, checks response is equal to char q OR char Q
        if (response.equals("q") || response.equals("Q")) {
            // if this conditon is met, prints the following
            System.out.println("You quit the game");
            // Otherwise, else if the previous condition was not met
        } else {
            // Prints the following
            System.out.println("You are still playing the game *pew pew*");
        }
    }

}
