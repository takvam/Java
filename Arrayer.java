import java.util.Arrays;
import java.lang.*;
import java.util.Collections;
import java.util.*;
import java.io.*;
//import org.apache.commons.lang.ArrayUtils;

public class Arrayer
{
  public static void main(String[] args)
  {

    int[] data = {9,-20,0,30,7,40,60,8};
    int[] data2 = {0};

    int[] forste = {50,-20,0,30,40,60,12};
    int[] andre = {50, 20, 10, 20, 30, 50, 12};

    int[] test = {1,-3,-5,4};
    int[] test2 = {5,-50,10};
    int[] test3 = {1,4,-5,-2};

    int[] gruppe = {11,15,11,15};

    int[] ny_array = {test[0], test2[2]};
    System.out.println("Ny array: " + Arrays.toString(ny_array));

    int[] test4 = {40,30,20};

    System.out.println(Arrays.toString(test4));

    int antall_rotasjoner = 1;

    hjelpemetoder_Arrayer multi = new multipliser();

    multi.multipliser_array(test,test3);
    multi.check_gruppe(gruppe);
    multi.finn_index_array(data);

    forst_eller_sist(data);
    forst_samme_som_sist(data2);
    teste_to_arrayer(forste, andre);
    contains(test3);
    roter(test4,antall_rotasjoner);
    //maximum_tall(test4);
    maximum(test4);
    bytt(test4);

  }

  //metode for aa sjekke hvorvidt et tall eksisterer paa forste eller siste punkt i en array
  public static void forst_eller_sist(int[] a)
  {
    int x = a.length;

    if(x >= 2 && (a[0] == 10 || a[a.length-1] == 10))
    {
      System.out.println("10 er enten det forste eller siste tallet ");
    }
    else if(x < 2)
    {
      System.out.println("Beklager, men arrayen er ikke lang nok ");
    }
    else
    {
      System.out.println("Beklager, men 10 var verken siste tallet eller det forste tallet ");
    }
  }

  //Sjekke om forste og siste indeksplass er lik
  public static void forst_samme_som_sist(int[] a)
  {
    hjelpemetoder_Arrayer multi = new multipliser();
    int x = a.length;

    if(x >= 2 && (a[0] == a[a.length-1]))
    {
      System.out.println("Forste og siste tall i arrayen er lik");
    }
    else if(a[0] != a[a.length-1])
    {
      System.out.println("Beklager, men forste og siste tall i arrayen var ikke like");
    }
    else
    {
      multi.check_array_null(a);
    }
  }

  //Sjekke om indeksplass 0 og siste er lik som 0 og siste i en annen array av ulik lengde
  public static void teste_to_arrayer(int[] a, int[] b)
  {
    int y = a.length;
    int x = b.length;

    if(y >= 2 && x >= 2)
    {
      if(a[0] == b[0] && a[a.length-1] == b[b.length-1])
      {
        System.out.println("Forste og siste i første arryat er like forste og andre i andre array");
      }
      else
      {
        System.out.println("Beklager, men det er ikke likt");
      }
    }
    else
    {
      System.out.println("Beklager, men arrayen er ikke lang nok");
    }
  }

  //Sjekke om en array inneholder et angitt tall
  public static boolean contains(int[] a)
  {
    int x = a.length;
    int y = 0;

    if(x > 2)
    {
      for(int i = 0; i < a.length; i++)
      {
        y = a[i];
        if(y == 4 || y == 7)
        {
          System.out.println("Den inneholder enten 4 eller 7");
          return true;
        }
        else
        {
          return false;
        }
      }
    }
    else
    {
      return false;
    }
    return false;
  }

  //roterer en array mot venstre, n angir hvor mange rotasjoner man ønsker
  public static void roter(int[] a, int n)
  {
    int temp = 0;

    for(int i = 0; i < n; i++)
    {
      temp = a[0];

      for(int j = 0; j < a.length-1; j++)
      {
        a[j] = a[j + 1];
      }

      a[a.length-1] = temp;
    }
    System.out.println(Arrays.toString(a));
  }

  /*public static void maximum_tall(int[] a)
  {
    List b = Arrays.asList(ArrayUtils.toObject(a));

    System.out.println(Collections.min(b));
    System.out.println(Collections.max(b));
  }*/

  //Skriver ut storste tall i en array
  public static void maximum(int[] a)
  {
    int max = 0;

    for(int i = 0; i < a.length; i++)
    {
      max = a[i];

      for(int j = 0; j < a.length; j++)
      {
        if(a[j] > max)
        {
          max = a[j];
        }
      }
    }
    System.out.println("Max element: " +  max);
  }

  //bytter to indekser i en array med hverandre
  public static void bytt(int[] a)
  {
    int x = a.length;
    if(x > 1)
    {
      int temp_0 = a[0];
      a[0] = a[a.length-1];
      a[a.length-1] = temp_0;
      System.out.println(Arrays.toString(a));
    }
    else
    {
      System.out.println("Arrayen er for kort ");
    }
  }
}
