package eulids_algoritme.src;

/* GCD står for GREATEST COMMON DIVISOR*/
/* GCD for 2 tall er det største positive tallet som deller begge tallene fullt uten noen form for rest*/

/* Denne løsningen tar for seg rekurson */
/* Det er to regler for rekurson:

1. Base case, siste punkt som kan løses uten kall på rekursiv funksjon, f.eks.
ved fibonacci-seriene så vil løsningen være 1 eller 2, hvorav løsningen her vil være 1.

2. Ved hvert rekursivt metode-kall, så problemet reduseres og til slutt tilnærme seg basen.
Hvis ikke dette er tilfellet får man java.lang.StackOverFlowError */

import java.util.Scanner;

public class Euclids_algoritme
{
  public static void main(String[] args)
  {

    Scanner scanner = new Scanner(System.in);
    System.out.println("Skriv inn første tall til Euclids algoritme: " );
    int første_tall = scanner.nextInt();
    System.out.println("Skriv inn andre tall til Euclids algoritme: " );
    int andre_tall = scanner.nextInt();

    System.out.println("Største fellesnevner: " + Eulids_find_GCD(første_tall,andre_tall));



  }

  public static int Eulids_find_GCD(int x, int y)
  {
    //Sjekker først om begge tallene er 0, kaster ut illegaltargument hvis det er tilfellet
    if(x == 0 && y == 0)
    {
      throw new IllegalArgumentException("Begge tallene er 0, tast høyere tall enn 0 :" + x + " " + y);
    }
    //Hvis y == 0, så er største felles divitør for begge x
    else if(y == 0)
    {
      return x;
    }
    /*Hvis y ikke er 0 så assigner vi y til x og y blir til x % y,
    så sjekker vi igjen om y er lik 0 over. Hvis y nå er 0 så har vi største felles divisør.
    Hvis ikke gjentar vi prosessen. */
    return Eulids_find_GCD(y, x%y);
    }
}
