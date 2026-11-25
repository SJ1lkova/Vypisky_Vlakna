
public class vlakno1 {
    public static void main(String[] args) throws InterruptedException {
        Auto auto = new Auto("Audi");
        Auto autoMC = new Auto("McLaren");
        Auto autoRED = new Auto("Redbull racing");
        Auto autoFER = new Auto("Ferrari");

    Thread auto1 = new Thread(auto);
    Thread auto2 = new Thread(autoMC);
    Thread auto3 = new Thread(autoRED);
    Thread auto4 = new Thread(autoFER);

    auto1.start();
    auto2.start();
    auto3.start();
    auto4.start();
        auto1.join();
        auto2.join();
        auto3.join();
        auto4.join();

        long a = auto.getCas();
        long b = autoMC.getCas();
        long c = autoRED.getCas();
        long d = autoFER.getCas();
        String[] poradi = new String[4];
// 1. místo
        if (a <= b && a <= c && a <= d) {
            poradi[0] = auto.getJmeno();
        } else if (b <= a && b <= c && b <= d) {
            poradi[0] = autoMC.getJmeno();
        } else if (c <= a && c <= b && c <= d) {
            poradi[0] = autoRED.getJmeno();
        } else {
            poradi[0] = autoFER.getJmeno();
        }

// 2., 3. a 4. místo
// Zde použijeme jednoduché seřazení indexů podle časů.
        long[] casy = {a, b, c, d};
        String[] jmena = {
                auto.getJmeno(),
                autoMC.getJmeno(),
                autoRED.getJmeno(),
                autoFER.getJmeno()
        };

        for (int i = 0; i < casy.length; i++) {
            for (int j = i + 1; j < casy.length; j++) {
                if (casy[i] > casy[j]) {
                    long docasnyCas = casy[i];
                    casy[i] = casy[j];
                    casy[j] = docasnyCas;

                    String docasneJmeno = jmena[i];
                    jmena[i] = jmena[j];
                    jmena[j] = docasneJmeno;
                }
            }
        }

        System.out.println("VÝSLEDKY ZÁVODU:");

        for (int i = 0; i < jmena.length; i++) {
            System.out.println((i + 1) + ". místo: " + jmena[i]
                    + " – " + casy[i] + " ms");
        }


    }
}
