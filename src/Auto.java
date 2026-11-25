import java.util.Random;

public class Auto implements Runnable{
    private String jmeno;
    private int pocetKM = 0;
    private int cil = 20;
    long cas = 0L;
    Random r = new Random();

    public Auto(String jmeno) {
        this.jmeno = jmeno;
    }

    public long getCas() {
        return cas;
    }

    public void setPocetKM(int pocetKM) {
        this.pocetKM = pocetKM;
    }

    public int getPocetKM() {
        return pocetKM;
    }

    public String getJmeno() {
        return jmeno;
    }

    public void zavod() {
        int postoupit = r.nextInt(4);

        if (postoupit+getPocetKM()>cil || postoupit+getPocetKM()==cil) {
            setPocetKM(20);
            System.out.println(getJmeno() + " je v cíli");
        }else{
            setPocetKM(postoupit+getPocetKM());
            System.out.println(getJmeno() + " ujelo " + getPocetKM() + "km");
        }


    }

    public void run() {
        long zacatek = System.currentTimeMillis();
        do{
            zavod();
            try{
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }while (pocetKM != cil);
        long konec = System.currentTimeMillis();
         cas = konec - zacatek;
    }
}
