package binary_operations.binary_count;

public class Calculations implements CalculationStrategy
{
  public void convert_int_to_binary(int number)
  {
    int temp = 0;
    int antall_nuller = 0;
    String binary = "";

    while(number > 0)
    {
      temp = number % 2;

      if(temp == 0)
      {
        antall_nuller++;
      }
      binary = binary + "" + temp;
      number = number/2;
    }
    System.out.println("Binært tall: " + binary);
    System.out.println("Antall 0'er: " + antall_nuller);

  }
}
