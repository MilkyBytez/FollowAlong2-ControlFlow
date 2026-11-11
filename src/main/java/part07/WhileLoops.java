package part07;
import java.util.Scanner;

// Video: https://www.youtube.com/watch?v=xk4_1vDrzzo&t=5302s
//        while loops start at about 88:22 — stop at about 91:54
// Guide: GUIDE.md in this folder, steps 7–11
//
// Part 07 — while loops and do-while loops
//
// SECTION A — FOLLOW ALONG: type the code from the video (or the guide) in this class.
//    His class is called Main. Yours is called WhileLoops.
//    Leave the "package part07;" line and the "public class WhileLoops" line alone.
//    The import line goes BETWEEN them (the guide shows where).
//
// SECTION B — COMMENTS: when you finish, put a // comment ABOVE every line of code,
//    saying in YOUR OWN WORDS what that line does.
//
// If your program never stops: click the red square (Stop) in the Run window.

public class WhileLoops {
    public static void main(String[] args) {
        //creates a new scanner called scanner to take inputs from user
        Scanner scanner = new Scanner(System.in);
        // creates new String called name, currently empty right now
        String name = "";
        // while loop made for name and boolean isBlank and will check this condition, if true enters loop
        while (name.isBlank()) {
            // Loop entered, askes user for name
            System.out.print("Enter a name: ");
            // name is filled with input from user
            name = scanner.nextLine();
        }
        // After name is given, exit loop and prints the following, Hello and then name from the user earlier
        System.out.println("Hello, " + name);
        // do-while loop, countines until condition has been met
        do {
            // Askes user to input name
            System.out.println("Enter your name :");
            // name will collect input from user
            name = scanner.nextLine();
            // while name is blank, it will continue to ask this question until fulfilled
        } while (name.isBlank());

    }
    // explained
}
