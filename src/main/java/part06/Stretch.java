package part06;
import java.util.Scanner;

// Video: https://www.youtube.com/watch?v=xk4_1vDrzzo&t=4161s
//        rewatch 69:21–74:54 for if / else if / else, 76:36–80:18 for switch
// Guide: GUIDE.md in this folder
//
// SECTION C — Stretch. Do Stretch A, then Stretch B. The README says what each one should print.
//
// There is no main method here yet. Typing it is part of the stretch.

public class Stretch {
    public static void main(String[] args) {
        /* My guess:
        * B or better
        * Medium
        * I was wrong, because I over guessed it. I knew what it was suppose to run*/
        int score = 85;
        if (score >= 70) {
            System.out.println("C or better");
        } else if (score >= 80) {
            System.out.println("B or better");
        } else {
            System.out.println("Below C");
        }

        int level = 2;
        switch (level) {
            case 1:
                System.out.println("Easy");
            case 2:
                System.out.println("Medium");
            case 3:
                System.out.println("Hard");
                break;
            default:
                System.out.println("Unknown");
        }


        int temperature = 92;
        if (temperature >= 80) {
            System.out.println("Shorts weather");
        } else if (temperature >= 60) {
            System.out.println("Hoodie weather");
        } else{
            System.out.println("Coat weather");
        }

        int month = 13;
        switch(month){
            case 1:
            case 2:
            case 12:
                System.out.println("Winter");
                break;
                case 3:
                    case 4:
                        case 5:
                            System.out.println("Spring");
                            break;
                            case 6:
                                case 7:
                                    case 8:
                                        System.out.println("Summer");
                                        break;
                                        case 9:
                                            case 10:
                                                case 11:
                                                    System.out.println("Fall");
                                                    break;
                                                    default:
                                                        System.out.println("This is not a month");
        }

        Scanner scan = new Scanner(System.in);
        System.out.println("Battery percentage: ");
        int battery = scan.nextInt();

        if(battery <= 20){
            System.out.println("Low battery. Go charge!");
        } else if(battery <= 80){
            System.out.println("Battery OK");
        } else{
            System.out.println("Fully Charged!");
        }



    }

}
