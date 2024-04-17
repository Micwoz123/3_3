import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
      System.out.print("Podaj rozmiar trojkata: ");
        
      Scanner scanner = new Scanner(System.in);
      int size = new Scanner(System.in).nextInt();
      System.out.print("Podaj swój znak: ");
      char name = scanner.next().charAt(0);


       for (int i = 0; i < size; i++) {
         for (int j = size; j>=i; j--) {
            System.out.print(" ");
         }
         for(int j=0;j<=i;j++){
         System.out.print(name);
           }
          System.out.println();
          }
  }
}
