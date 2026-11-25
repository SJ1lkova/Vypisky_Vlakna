import java.util.Random;

public class Vlak implements Runnable {
    Random r = new Random();
    private String ID;
    private int maxKapacita;
    private int aktualniKapacita;
    private int naustoupilo;
    private int vystoupilo;
    private int stanice;
    private int celkem = 0;

    public Vlak(String ID, int maxKapacita) {
        this.ID = ID;
        this.maxKapacita = maxKapacita;
        this.aktualniKapacita = 0;
        this.stanice = 1;
    }


    public int getCelkem() {
        return celkem;
    }

    public void setCelkem(int celkem) {
        this.celkem += celkem;
    }

    public void setAktualniKapacita(int aktualniKapacita) {
        this.aktualniKapacita = aktualniKapacita;
    }

    public int getAktualniKapacita() {
        return aktualniKapacita;
    }

    public void setStanice(int stanice) {
        this.stanice = stanice;
    }

    public int getStanice() {
        return stanice;
    }




    public void setNaustoupilo() {
        int nastoupilo =r.nextInt(20);
        boolean ok = false;

        do {
            int soucet = getAktualniKapacita()+nastoupilo;
            if (soucet >maxKapacita) {
                nastoupilo =r.nextInt(20);
            }else {
                ok = true;
                setAktualniKapacita(soucet);
                setCelkem(nastoupilo);
            }
        }while (!ok);

        this.naustoupilo = nastoupilo;
    }

    public void setVystoupilo() {
        int vystoupilo =r.nextInt(20);
        boolean ok = false;

        do {
            int rozdil = getAktualniKapacita()-naustoupilo-vystoupilo;
            if (rozdil <0) {
                vystoupilo =r.nextInt(20);
            }else {
                ok = true;
                setAktualniKapacita(getAktualniKapacita()-vystoupilo);
            }
        }while (!ok);

        this.vystoupilo = vystoupilo;
    }




    public void prijezd(){
        if (stanice == 10){
            System.out.println("Vlak "+ID +" dokončil jízdu. (10 stanice)");
            vystoupilo = aktualniKapacita;
        }else {
            setNaustoupilo();
            setVystoupilo();
            System.out.println("Vlak "+ID+" prijel do stanice "+stanice+". Vystoupilo zde "+vystoupilo+" a nastoupilo "+naustoupilo+" cestujicich.");

        }


    }


    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            prijezd();

            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            setStanice(getStanice() + 1);
        }
    }
}
