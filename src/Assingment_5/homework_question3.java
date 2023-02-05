package Assingment_5;

public class homework_question3 {
    public static void main(String[] args) {
        int iterations = 1;
        double x = Math.PI / 4;
        double result = 0;
        double factorial = 1;
        double xPower = x;
        double sign = 1;
        for (int i = 1; i <= iterations; i++) {
          result += xPower / factorial * sign;
          xPower *= -x * x;
          factorial *= (2 * i) * (2 * i + 1);
          sign *= -1;
        }
        System.out.println(result);
      }
    }

