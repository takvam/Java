package dimensjonale_arrayer.to_dimensjonal;

import java.util.Arrays;
public class Toarrayer
{
  public static void main(String[] args)
  {
    bytte_paa_index_2D();

    int[][] array = {{10,20,30},
                    {40,50,60}};

    System.out.println("Original Array: ");
    print_2D_array(array);
    System.out.println("Etter å ha endret på rader og kolonner : ");
    endre_rad_og_kolonne(array);

    true_false_2D_array();



  }
  /*Bytter om paa utskriften.
  true,false,true,false,true,false blir til t,f,t,f,t,f*/
  public static void bytte_paa_index_2D()
  {
    boolean[][] a = {{true, false, true},{false, true, false}};
    int rader = a.length;
    int kolonne = a[0].length;

    /*Looper bortover på raden true,false,true*/
    for(int i = 0; i < rader; i++)
    {
      /*Looper nedover på kolonne true,false*/
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

  public static void endre_rad_og_kolonne(int[][] a)
  {
    /*a[0] = nedover, a.length = bortover*/
    int[][] ny_array = new int[a[0].length][a.length];

    for(int i = 0; i < a.length; i++)
    {
      for(int j = 0; j < a[0].length; j++)
      {
        ny_array[j][i] = a[i][j];

      }
    }

    print_2D_array(ny_array);
  }

  public static void print_2D_array(int[][] a)
  {
    /*Løper gjennom array a og printer ut gjennom a[i][j]*/
      for(int i = 0; i < a.length; i++)
      {
        for(int j = 0; j < a[0].length; j++)
        {
          System.out.println(a[i][j] + " ");
        }
        System.out.println();
      }
  }

  public static void true_false_2D_array()
  {
    int temp = 3;
    boolean[][] Array = new boolean[temp][temp];

    for(int i = 0; i < temp; i++)
    {
      for(int j = 0; j < temp; j++)
      {
        /*Fyller arrayen med "true" så lenge resten etter isPrime(i,j) == 1.
        Primtall er kun delelig med seg selv eller 1. */
        /*De 8 første iterasjonene vil resultere i true, mens den 9 vil resultere i false. Da er i < temp false.*/

        /*Array[0][0] = 2 stk true
          Array[1][1] = 2 stk true
          Array[2][2] = 2 stk true
          Array[3][3] = 2 stk true
          Array[4] = 1 stk false, falske ved i < temp. */

        Array[i][j] = isPrime(i,j) == 1;
        System.out.println(Array[i][j] + " ");
      }
      System.out.println();
    }
  }

  public static int isPrime(int nummer_1, int nummer_2)
  {
    /*Rekursiv metode */
    //Sjekker om nr 1 eller 2 er lik 0, stemmer dette returneres 1 også avsluttes programmet.

    if(nummer_1 == 0 || nummer_2 == 0)
    {
      return 1;
    }

    //Hvis forste nummer er mindre enn andre, så kjører vi en operasjon for å sørge for at
    //andre tall blir mindre enn forste tall. Deretter fortsetter vi videre med å kalkulere rest.
    if(nummer_1 < nummer_2)
    {
      int temp = nummer_1;
      nummer_1 = nummer_2;
      nummer_2 = temp;
    }
    //Denne bestemmer om vi skal ta en rekursiv runde til.
    //Om resten blir 0 så avsluttes programmet ved at tall nr 2 returneres som høyest fellesnevner.
    //Er det fremdeles rest så kjøres en ny rekursiv runde for å nærme oss at resten blir 0.
    if(nummer_1 % nummer_2 == 0)
    {
      return nummer_2;
    }
    else
    {
      return isPrime(nummer_2, nummer_1 % nummer_2);
    }
  }


}
