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
}
