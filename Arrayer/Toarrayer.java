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
}
