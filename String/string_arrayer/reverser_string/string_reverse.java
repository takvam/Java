package string_arrayer.reverser_string;

import java.util.Arrays;
import java.util.Scanner;
import java.util.*;

public class string_reverse
{
  public static void main(String[] args) throws Exception
  {
    String[] setning = {"The", "quick", "brown", "fox", "jumps", "over", "the", "lazy", "dog"};
    String[] ny_setning = {"The quick brown fox jumps over the lazy dog"};
    reverser_Array(setning);
    reverser_Array(ny_setning);
  }

  public static void reverser_Array(String[] a)
  {
    Collections.reverse(Arrays.asList(a));
    System.out.println(Arrays.asList(a));
  }
}
