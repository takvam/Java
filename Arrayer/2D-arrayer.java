public class 2D-arrayer
{
  public static void main(String[] args)
  {
    bytte_paa_index_2D();
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
