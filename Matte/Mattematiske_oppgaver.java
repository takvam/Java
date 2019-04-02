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

    bytte_paa_index_2D();
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

  public static void bytte_paa_index_2D()
  {
    boolean[][] a = {{true, false, true},{false, true, false}};
    int rader = a.length;
    int kolonne = a[0].length;

    for(int i = 0; i < rader; i++)
    {
      for(int j = 0; j < kolonne; j++)
      {
        if(a[i][j])
        {
          System.out.println("t");
        }
        else
        {
          System.out.println("f");
        }
      }
    }
    System.out.println("");

  }



}
