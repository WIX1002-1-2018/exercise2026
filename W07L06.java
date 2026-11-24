import java.util.Scanner;

public class W07L06 {
    static boolean isPrime(int num){
      if (num%2==0 && num != 2) return false;
      if (num <= 1) return false;
      else if (num%2==1 && num != 1) {
        for (int i=3; i <= num / i; i += 2){
          if (num%i == 0) {
            return false;
          }
        }
      }
      return true;
    }

    static boolean isPalPrime(String x){
      while (x.length() > 1 && x.charAt(0) == '0') {
        x = x.substring(1);
      }
      String y = "";

      for (int i=x.length()-1; i>=0 ; i--){
        y += x.charAt(i);
      }
      
      int num = 0;
      for (int j=0; j<x.length(); j++){
        if (x.charAt(j) < '0' || x.charAt(j) > '9') return false;
        if (num > (Integer.MAX_VALUE - (x.charAt(j) - '0')) / 10) return false;
        num = num * 10 + (x.charAt(j) - '0');
      }

      if (x.equals(y) && isPrime(num)) return true;
      else return false;
    }

    static boolean isEmirp(String x){
      while (x.length() > 1 && x.charAt(0) == '0') {
        x = x.substring(1);
      }
      if (isPalPrime(x)) return false;
      else {
        String y = "";

        for (int i=x.length()-1; i>=0 ; i--){
          y += x.charAt(i);
        }

        int n1 = 0, n2 = 0;
        for (int j=0; j<x.length(); j++){
          if (x.charAt(j) < '0' || x.charAt(j) > '9') return false;
          if (n1 > (Integer.MAX_VALUE - (x.charAt(j) - '0')) / 10 || n2 > (Integer.MAX_VALUE - (y.charAt(j) - '0')) / 10) return false;
          n1 = n1 * 10 + (x.charAt(j) - '0');
          n2 = n2 * 10 + (y.charAt(j) - '0');
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
