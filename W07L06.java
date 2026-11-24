import java.util.Scanner;

public class W07L06 {
    static boolean isPrime(int num){
      if (num%2==0 && num != 2) return false;
      else if (num%2==1 && num != 1) {
        for (int i=3; i*i <= num; i += 2){
          if (num%i == 0) {
            return false;
          }
        }
      }
      return true;
    }

    static boolean isPalPrime(String x){
      String y = "";

      for (int i=x.length()-1; i>=0 ; i--){
        y += x.charAt(i);
      }
      
      int num = 0;
      for (int j=0; j<x.length(); j++){
        num += (int) (x.charAt(j) - '0') * (Math.pow(10,x.length()-1-j));
      }

      if (x.equals(y) && isPrime(num)) return true;
      else return false;
    }

    static boolean isEmirp(String x){
      if (isPalPrime(x)) return false;
      else {
        String y = "";

        for (int i=x.length()-1; i>=0 ; i--){
          y += x.charAt(i);
        }

        int n1 = 0, n2 = 0;
        for (int j=0; j<x.length(); j++){
          n1 += (int) (x.charAt(j) - '0') * (Math.pow(10,x.length()-1-j));
          n2 += (int) (y.charAt(j) - '0') * (Math.pow(10,y.length()-1-j));
        }

        if (isPrime(n1) && isPrime(n2)) return true;
        else return false;

      }
    }
    
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      String n = sc.nextLine();
      System.out.println("The number is Palindromic Prime: " + isPalPrime(n));
      System.out.print("The number is Emirp: " + isEmirp(n)); 
    }
}