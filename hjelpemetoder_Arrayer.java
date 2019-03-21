import java.util.Arrays;
import java.util.*;
import java.io.*;

public class multipliser
{
  /*multipliserer to arrayer med hverandre.
  [0]*[0], [1]*[1], [2]*[2] osv*/
  public static void multipliser_array(int[] a, int[] b)
  {
    int en = 0;
    int to = 0;
    int sum = 0;
    String resultat = "";
    String resultat1 = "";

    for(int i = 0; i < a.length; i++)
    {
      en = a[i];
      to = b[i];
      sum = en * to;
      resultat += Integer.toString(en * to) + " ";

    }
    System.out.println("Multiplisert blir det " + resultat);

    /*Ikke en egen metode.
    Multipliserer [0] med [0],[1],[2] også [1] med [0],[1],[2] osv.*/
    for(int i = 0; i < a.length; i++)
    {
      en = a[i];
      for(int j = 0; j < b.length; j++)
      {
        to = b[j];
        sum = en * to;
        resultat1 += Integer.toString(sum) + " ";
      }
    }
    System.out.println("");
    System.out.println(resultat1);
  }

  //Sjekker om en array er null eller tom
  public static void check_array_null(int[] a)
  {
    if(a.length == 0)
    {
      System.out.println("Arrayen er lik 0, fyll den opp");
    }
  }

  public static void check_gruppe(int[] a)
  {
    int resultat = 0;
    /*hvor stor gruppen man skal sjekke er
    2 indikerer at man skal sjekke de 2 forste og de 2 siste*/
    int gruppe = 2;
    int start = 0;
    int slutt = a.length-1;

    System.out.println("Original gruppe-array: " + Arrays.toString(a));

    for(int l = 0; l > 0; l--)
    {
      if(a[start] != a[slutt])
      {
        resultat = 1;
      }
      else
      {
        start++;
        slutt++;
      }
    }

    if(resultat == 1)
    {
      System.out.println(String.valueOf(false));
    }
    else
    {
      System.out.println(String.valueOf(true));
    }
    System.out.println("\n");
  }
}
