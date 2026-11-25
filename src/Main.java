import java.util.Scanner;
import java.util.InputMismatchException;

public class Main {
    public static void main(String[] args) throws InterruptedException  {
        Scanner sc = new Scanner(System.in);
        int kapacita;

        try {
            System.out.print("Zadej kapacitu vlaku: ");
            kapacita = sc.nextInt();
        } catch (InputMismatchException e) {
            System.err.println("CHYBA: Musis zadat cislo!");
            return;
        }

        
        Vlak vlak1 =new Vlak("R123",kapacita);
        Vlak vlak2 =new Vlak("R",200);
        Thread vlakno1 = new Thread(vlak1);
        Thread vlakno2 = new Thread(vlak2);

        vlakno1.start();
        vlakno2.start();

        vlakno1.join();
        vlakno2.join();

        int soucet;
        soucet = vlak1.getCelkem() + vlak2.getCelkem();
        System.out.println("Vsechny vlaky dokoncily jizdu. Celkem prepravily "+ soucet +" cestujicich.");
    }
}
