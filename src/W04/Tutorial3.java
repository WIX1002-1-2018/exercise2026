package W04;

import java.util.Scanner;

public class Tutorial3{
    public static void main(String[] args){
        //1a Determine whether 3x8=27. 
        String multiplication = 3*8 == 27?"True":"False";
        System.out.println(multiplication);
        
        //1b Determine whether an input integer is an odd number or even number.
        Scanner in = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int a = in.nextInt();
        String integer = a % 2 ==0?"Even":"Odd";
        System.out.println(integer);
        
        //1c Determine whether a character is a capital letter.
        System.out.print("Enter a character: ");
        char b = in.next().charAt(0);
        String letter = Character.isUpperCase(b)?"Capital letter":"Not a capital letter";
        System.out.println(letter);
        
        //1d Display two strings in alphabetical order ignoring their case. 
        in.nextLine();
        System.out.print("Enter a word: ");
        String one = in.nextLine();
        System.out.print("Enter the second word: ");
        String two = in.nextLine();
        int  order = one.compareToIgnoreCase(two);
        
        if (order < 0){
            System.out.println(one + " " + two);
        } else if(order == 0){
            System.out.println("Same word");
        } else {
            System.out.println(two + " " + one);
        }
        
        /* 1e A switch statement that display Sunday, Monday, .., Satudary
         if the input is 0, 1, …, 6. */
        
        System.out.print("Enter a number from 0-6: ");
        int number = in.nextInt();
        
        switch(number){
            case 0:
                System.out.println("Sunday");
            break;
            
            case 1:
                System.out.println("Monday");
            break;
            
            case 2:
                System.out.println("Tuesday");
            break;
            
            case 3:
                System.out.println("Wednesday");
            break;
            
            case 4:
                System.out.println("Thursday");
            break;
            
            case 5:
                System.out.println("Friday");
            break;
            
            case 6:
                System.out.println("Saturday");
            break;
            
            default:
                System.out.println("Please enter a number from 0-6.");
        }
        
        /*2a if (num1 = num2) 
             System.out.println("Number 1 is equal to number 2.");*/
        
        /*if (num1 == num2){
             System.out.println("Number 1 is equal to number 2.");
        }
        */
        
        /*int x = 10;
        int y = 5;
        int z = 2;
         if (x > y && x > z){      
               System.out.println("x is the largest number");
        }*/
         
        /*String s1,s2;
        if (s1.equals(s2)){
            System.out.println("They are equal strings.");
        } else {
            System.out.println("They are not equal strings.");
        }*/
        
        /*if (x > 0 || y > 0){
             System.out.println("Either x or y is positive");
        }*/
        
        /*#####
          $$$$$
        */
        
        /*#####
          $$$$$
        */
        
        //$$$$$
        
        //No output
        
        Scanner calc = new Scanner(System.in);
        System.out.print("Enter three integers(x y z): ");
        int number1 = calc.nextInt();
        int number2 = calc.nextInt();
        int number3 = calc.nextInt();
        
        if (number1 > number2 && number1 > number3){
            System.out.println("x is the biggest number.");
        } else if (number2 > number1 && number2 > number3){
            System.out.println("y is the biggest number.");
        } else {
            System.out.println("z is the biggest number.");
        }
        
        Scanner year = new Scanner(System.in);
        System.out.print("Enter a year: ");
        int Year = year.nextInt();
        String leaporcommon = Year % 400 == 0 || (Year % 4 ==0 && Year % 100 != 0)?"Leap Year":"Common Year";
        System.out.println(leaporcommon);
    }
        

    }