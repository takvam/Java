package arrayer_elementer.finner_i_i_arrayer;

import java.util.Arrays;
import java.lang.*;
import java.util.Collections;
import java.util.*;
import java.io.*;

public class finne_elementer_i_Array
{
  public static void main(String[] args)
  {
    Integer[] tall_array = new Integer[] {20,3,1,10,100,90,87};
    //De 3 største tallene vi skal finne
    int teller = 3;

    finne_de_tre_storste(tall_array, teller);
  }

  public static void finne_de_tre_storste(Integer[] a, int antall_tall)
  {
    System.out.println("Original Array: " + Arrays.toString(a));
    System.out.println(antall_tall + " De 3 største tallene ");
    Arrays.sort(a, Collections.reverseOrder());

    //Etter bruk av metodenene Collection.reverseOrder og Collections.sort får man følgende resultat:
    /* {-3,1,3,10,20,87,90,100}
       {100,90,87,20,10,3,1,-3}
    Så teller man på de 3 forste indeksposisjonene og skriver ut de 3 største tallene i minskende order*/
    for(int i = 0; i < antall_tall; i++)
    {
      System.out.println(a[i] + "");
    }
  }
}
