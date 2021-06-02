import java.util.Scanner;

class calculator {
    public static boolean check(String str, int n)
    {
        for (int i = 0; i < n; i++) {
            if (str.charAt(i) == '0' || str.charAt(i) == '1') {
            }
            else {
                return false;
            }
        }
        return true;
    }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);  

    System.out.println("Enter first number");
    String b1= sc.nextLine();
    int len1 = b1.length(); 
    if (check(b1, len1) == true)
    {}
    else 
    {
        System.out.println("Invalid binary number, recheck digits");
        System.exit(1);
    }

    System.out.println("Enter second number");
    String b2= sc.nextLine();
    int len2 = b2.length(); 
    if (check(b2, len2) == true)
    {}
    else 
    {
        System.out.println("Invalid binary number, recheck digits");
        System.exit(1);
    }
    char operator;
    System.out.println("Choose an operator: +, -, *, or /");
    operator = sc.next().charAt(0);

    int number1=Integer.parseInt(b1,2);
    int number2=Integer.parseInt(b2,2);
    int result;

    switch (operator) {

      case '+':
        result = number1 + number2;
        System.out.println("Result is " + Integer.toBinaryString(result));
        break;

      case '-':
        result = number1 - number2;
        System.out.println("Result is " + Integer.toBinaryString(result));
        break;

      case '*':
        result = number1 * number2;
        System.out.println("Result is " + Integer.toBinaryString(result));
        break;

      case '/':
        result = number1 / number2;
        System.out.println("Result is " + Integer.toBinaryString(result));
        break;

      default:
        System.out.println("Invalid operator!");
        break;
    }
    sc.close();
  }
}