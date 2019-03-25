import java.lang.*;

public class system_scripts
{
  public static void main(String[] args)
  {
    getSecManager();
    getEnv();
    getProp();
    getpath();
    gettemp();
    getUsername();

  }
  public static void getSecManager()
  {
    //Sjekker om et sikkerhetshåndteringssytem har blitt etablert på nåværende software
    System.out.println("System sikkerhetoversikt: ");
    System.out.println(System.getSecurityManager());
  }

  public static void getEnv()
  {
    //Skriver ut nåværende sikkerhetsmiljø og system-eiendeler
    System.out.println("\n Nåværende sikkerhetsmiljø: ");
    System.out.println(System.getenv());
  }

  public static void getProp()
  {
    //Skriver ut nåværende egenskaper rundt systemet
    System.out.println("\n Nåværende system-egenskaper: ");
    System.out.println(System.getProperties());
  }

  public static void getpath()
  {
    //finner verdien til en spesifikk variabel "PATH"
    System.out.println("\n Path: " );
    System.out.println(System.getenv("PATH"));
  }

  public static void gettemp()
  {
    //Finner verdien til en spesifikk variabel "TEMP"
    System.out.println("\n TEMP: ");
    System.out.println(System.getenv("TEMP"));
  }

  public static void getUsername()
  {
    //Finner verdien til en spesifikk verdi: "USERNAME"
    System.out.println("\n USERNAME: ");
    System.out.println(System.getenv("USERNAME"));
  }

}
