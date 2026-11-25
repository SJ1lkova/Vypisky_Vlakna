public class Vypisky {
/* CO NAPSAT ZA MAIN
        throws InterruptedException
 */


/* DEAMON - NECEKA SE NA DOKONCENI TOHOTO THREADU (pokud zbyle thready skonci driv -> program taky skonci)
    threadA.setDaemon(true);
 */



/* SET NAME
    Thread vlaknoSpi = new Thread(() -> {
        System.out.println("Jmeno: " + Thread.currentThread().getName());
    });
    vlaknoSpi.setName(sc.next());
    vlaknoSpi.start();
 */




/*   KDYZ CHCI DAT SLEEP DO THREADU + INTERUPT NA 3S == POUZE 3 SE VYPISOU
        Thread threadB = new Thread(() -> {
            for (int i = 1; i <= 10; i++) {
                System.out.println("Vlákno B: " + i);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    System.out.println("Vlákno bylo přerušeno!");
                    break;
                }
            }
        });

        threadB.start();

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        threadB.interrupt();
*/



/*   INTERUPT
        Thread pocitani = new Thread(()->{
            while (!Thread.currentThread().isInterrupted()){
                for(int i = 1; i<=100; i++){
                    if (Thread.currentThread().isInterrupted()) {        -NEMUSI BYT
                        break;
                    }
                    System.out.println(i);
                }
            }
        }, "Pocitani od 1 do 10");

        pocitani.start();
        Thread.sleep(100);
        pocitani.interrupt();
*/



/* SLEEP V RUN()
        public void run() {
            System.out.println("Vlak A jede do stanice 1.");
            try {
                 Thread.sleep(500);
            } catch (InterruptedException e) {
                 e.printStackTrace();
            }
            System.out.println("Vlak A jede do stanice 2.");
        }
 */



/* JOIN - B POCKA AZ DOJEDE A
    try {
        vlaknoA.join();
    } catch (InterruptedException e) {
        e.printStackTrace();
    }
 */



/* SET JMENO
        Thread vlaknoSpi = new Thread(() -> {
            System.out.println("Jmeno " + Thread.currentThread().getName());
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Hotovo");
        });

        vlaknoSpi.setName(sc.next());
        Thread.sleep(1000);                               - USPANI MAIN NA 1S
        vlaknoSpi.start();
 */



/* POKUD CHCI VYUZIT PROMENE V THREAD MUSIM JE DAT MIMO MAIN
        static int promena;
        main{
            THREAD
        }
 */



/* BIG-INTEGER
    static BigInteger faktorial(Long l){
        BigInteger soucin = BigInteger.ONE;
        for (int i = 1; i <= l; i++){
            soucin = soucin.multiply(BigInteger.valueOf(i));
        }

        return soucin;
    }
 */


/* RANDOM R GENERATOR - od 1 do 4
     int postoupit = r.nextInt(4) + 1;
 */














//-----------------------------------------------------------------------------------------------------------



    //-> s.addScore(90);                         = porad se vola stejne
    //ALE s.getAverage(); s.scores.size()        = pokud by s.getAverage() nic nedelal, zkusit getAverage()
    //System.out.println(s.scores.size()); - 2

// VZDYCKY PSAT private ArrayList<Integer> scores = new ArrayList<>(); - jinak je null a pri add hodi chybu
    //A necpa to do konstruktoru

//ABSTRACT
    //public abstract int spocitejCenu(int stran); - rodic
    //public int spocitejCenu(int stran) {return stran * 2;} -potomek

//SUPER - Potomek
    //public void vypis() {
    //        super.vypis();
    //        System.out.println("Jsem student");
    //    }

// PŘETÍŽENÍ
    //void vypis() {}
    //void vypis(String text) {}

//PŘEPSÁNÍ
    //void vypis() {} - jak v Potomkovi tak v Rodicovi

// ROZDIL MEZI Rodic p = new Potomek(); a Potomek p = new Potomek();
    // Muzeme zavolat pouze metody v rodicovi  => p.jenPotomek() nebude fungovat

// HODNOTA METODY OBJEKTU - JENOM POKUD JE ARRAY STEJNEHO TYPU/JE TYPU POD
    //public ITiskarna najdi() {
    //    return new LaserovaTiskarna("Turbo", 10);
    //}
    //
    //if (t1 instanceof LaserovaTiskarna) {
    //    System.out.println("Je to laserová tiskárna");
    //}

//METODY
    //Math.max(a, b)	    Vrátí větší číslo.
    //Math.min(a, b)	    Vrátí menší číslo.
    //Math.ceil(x)	        Zaokrouhlí nahoru.
    //Math.floor(x)	        Zaokrouhlí dolů.
    //Math.round(x)	        Zaokrouhlí na nejbližší celé číslo.
    //Math.abs(x)	        Vrátí absolutní hodnotu.
    //Math.sqrt(25)	        Druhá odmocnina
    //Math.pow(2, 3)	    Mocnina
    //Math.random()	        Náhodné číslo od 0 včetně do 1 bez něj - Pokud od 1 do 10 -> (Math.random() * 10) + 1
    //Math.cbrt(x)	        Třetí odmocnina
    //Math.hypot(x, y)	    Vypočítá phytagorku
    //Math.copySign(x, y)	Převezme znaménko z y

//FUNKCE ARRAY:
    //- scores.size()                   vrací počet prvků, nikoliv poslední index.
    //- scores.get(i)                   vrací prvek na indexu i.
    //- scores.add(x)                   přidá prvek na konec.
    //- scores.remove(i)/(objekt)       při seznamu Integer odstraní prvek na indexu i.
    //- scores.isEmpty()                ověří, zda je seznam prázdný.
    //- scores.set(index, objekt)
    //- scores.contains(objekt)
    //- scores.clear()                  Vymaže celý seznam
    //- scores.indexOf(objekt)
    //- Collections.sort(seznam)	    Seřadí seznam, pokud jsou prvky porovnatelné
    //- Collections.reverse(seznam)	    Obrátí pořadí prvků
    //- list.forEach(prvek -> ...)	    Provede akci pro každý prvek
    //- Arrays.copyOf(cisla, 2)	        Vytvoří kopii prvních dvou prvků
    //Collections.shuffle(cisla)	    Náhodně promíchá prvky
    //Collections.max(cisla)	        Najde největší prvek
    //Collections.min(cisla)	        Najde nejmenší prvek
    //Collections.frequency(cisla, 5)	Spočítá výskyty hodnoty 5
    //Collections.swap(cisla, 0, 1)	    Prohodí dva prvky

//FUKNCE STRING
    //text.length()	                    Počet znaků
    //text.toUpperCase()	            Převede na velká písmena
    //text.contains("Svete")	        Zjistí, zda obsahuje text
    //text.charAt(0)	                Vrátí znak na indexu
    //text.substring(0, 4)	            Vybere část textu	"Ahoj"
    //text.replace("Ahoj", "Nazdar")	Nahradí část textu
    //text.split(" ")	                Rozdělí text podle oddělovače
    //text.strip()	                    Odstraní okrajové bílé znaky

//HLEDANI VSECH POZIC
    //while (pozice >= 0) {
    //  System.out.println(pozice); // 0, 5, 16
    //  pozice = text.indexOf(hledane, pozice + hledane.length());
    //}

//PREVOD
    //Integer.parseInt("123")	    Převede text na int
    //Double.parseDouble("3.14")	Převede text na double
    //String.valueOf(123)	        Převede hodnotu na text
    //Integer.toString(123)	        Převede int na text

//CHARY
    //Character.isDigit('5')	Zjistí, jestli je znak číslice
    //Character.isLetter('A')	Zjistí, jestli je znak písmeno
    //Character.isWhitespace(' ')	Zjistí, jestli jde o bílý znak






//HLEDANI V ARRAY METODE
    //METODA:  public Mazlicek najdiMazlickaPodleJmena(String jmeno, List<Mazlicek> seznamMazlicku) {
    //        for (int i = 0; i < seznamMazlicku.size(); i++) {
    //            if (seznamMazlicku.get(i).getJmeno().equalsIgnoreCase(jmeno)) {
    //                return seznamMazlicku.get(i);
    //            }
    //        }
    //    }

    //MAIN: System.out.print("Zadej jmeno mazlicka: ");
    //    String hledaneJmeno = sc.nextLine();
    //    SpravaMazlicku sprava = new SpravaMazlicku();
    //
    //    Mazlicek nalezeny = sprava.najdiMazlickaPodleJmena(
    //            hledaneJmeno, seznamMazlicku);
    //
    //    if (nalezeny != null) {
    //        System.out.println("Mazlicek nalezen:");
    //        System.out.println(nalezeny);
    //    } else {
    //        System.out.println("Mazlicek nebyl nalezen.");
    //    }
    //    break;

}
