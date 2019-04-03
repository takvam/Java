import java.util.Scanner;

public class Mattematiske_oppgaver
{
  public static void main(String[] args)
  {
    int a = 25;
    int b = 25;
    int c = 25;
    int d = 25;
    er_alle_like(a,b,c,d);

    double range_en = 1.0;
    double range_to = 2.0;
    System.out.println("Sjekker om tallene er innenfor 0 og 1: " + innenfor_range(range_en,range_to));

    int original_nummer = 2350;
    System.out.println(not_bigger("Originalt nummer: " + original_nummer));
  }

  //Sjekker om alle verdiene er like
  public static void er_alle_like(int a, int b, int c, int d)
  {
    if(a == b && a == c && a == d && b == c && b == d && c == d)
    {
      System.out.println("Alle tallene er like ");
    }
    else
    {
      System.out.println("Alle tallene er ikke like ");
    }
  }

  //Sjekker om to double tall er innenfor en range på 0 og 1.
  public static boolean innenfor_range(double a, double b)
  {
    if((a >= 0 && a <= 1) && (b >= 0 && b <= 1))
    {
      return true;
    }
    else
    {
      return false;
    }
  }

  public static int not_bigger(int original_nummer)
  {
    int shift_mot_hoyre = 0;

    do{
      /* Dette er en "right shift", den skifter en bit-rad til høyre.
      2350 er binært: 100100101110, etter en shift blir det følgende:
      010010010111 = 1175 */
      original_nummer >>= 1;
      shift_mot_hoyre++;
    }
    /* Så lenge original_nummer(som var 2350) er større enn 0,
    etterhvert som vi right shifter nedover, så vil int shift_mot_høyre plusses med 1.*/
    while(original_nummer != 0);
    {
      /*I det oyeblikket original_nummer ikke er større enn 0, trekker vi en i fra på
      shift_mot_hoyre og returnerer resultatet*/
      shift_mot_hoyre--;
      return shift_mot_hoyre;
    }
  }
}
