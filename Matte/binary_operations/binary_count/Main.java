package binary_operations.binary_count;

import java.util.Scanner;

public class Main
{
  public static void main(String[] args)
  {
    Scanner s = new Scanner(System.in);

    System.out.println("Skriv inn et tall som skal konverteres til decimal: " );
    int number = s.nextInt();

    Calculations calculate = new Calculations();
    calculate.convert_int_to_binary(number);
  }
}
