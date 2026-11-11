package part07;


import java.util.Scanner;


// Video: https://www.youtube.com/watch?v=xk4_1vDrzzo&t=4895s
//        rewatch 81:35–87:47 for && || !, 89:29–91:54 for while
// Guide: GUIDE.md in this folder
//
// SECTION C — Stretch. Do Stretch A, then Stretch B. The README says what each one should print.
//
// There is no main method here yet. Typing it is part of the stretch.
// If your program never stops: click the red square (Stop) in the Run window.

public class Stretch {
    public static void main(String[] args) {
        int x = 7;
        System.out.println(x > 5 && x < 10);
        System.out.println(x > 5 && x > 10);
        System.out.println(x < 5 || x == 7);
        System.out.println(!(x == 7));
        int count = 3;
        while (count > 0) {
            System.out.println("count is " + count);
            count = count - 1;
        }
        System.out.println("done");

        int numdown = 5;
        while (numdown > 0 ){
            System.out.println(numdown);
            numdown--;
        }
        System.out.println("Liftoff!");

        String password = "java123";
        do{
            System.out.println("Password: " );
            Scanner sc = new Scanner(System.in);
            password = sc.nextLine();
        } while(!password.equals("java123"));;

        if(password.equals("java123")){
            System.out.println("Access granted");
        }

        int number = 0;
        while (number < 1 || number > 10){
            System.out.println("Pick a number between 1 and 10 ");
            Scanner sc = new Scanner(System.in);
            number = sc.nextInt();
        }
        System.out.println("you picked " + number);

    }
    /* My Guess
    true
    false
    true
    false
    count is 3
    count is 2
    count is 1
    done
    * */

}
