import java.io.FileWriter;
import java.io.IOException;

public class Obsah {
   private VideoPolozka[] videopolozka;
   private int actualni;
   private int max;

    public Obsah() {
        this.max = 50;
        this.videopolozka = new VideoPolozka[max];
        this.actualni = 0;
    }

    public void pridejPolozku(VideoPolozka polozka){
        if (actualni <= max) {
            this.videopolozka[actualni] = polozka;
            actualni++;
        } else {
            System.out.println("Nemate dost mista");
        }
    }

    public void vypisPolozky(){
        boolean flag = false;
        for (int i = 0; i < max; i++) {
            if (videopolozka[i] != null) {
                System.out.println(videopolozka[i].toString());
                flag = true;
            }
        }
        if (!flag) System.out.println("Pole je prazdne!");
    }

    public void vypisPolozkyPodleDruhu(Druh vybranyDruh){
        boolean flag = false;
        for (int i = 0; i < max; i++) {
            if (videopolozka[i] != null && videopolozka[i].getDruh().equals(vybranyDruh)) {
                System.out.println(videopolozka[i].toString());
                flag = true;
            }
        }
        if (!flag) System.out.println("Pole je prazdne!");
    }

    public void vypisPolozkyPodleDruhuPlusZanru(Druh vybranyDruh, String zanr){
        boolean flag = false;
        for (int i = 0; i < max; i ++) {
            if (videopolozka[i] != null && videopolozka[i].getDruh().equals(vybranyDruh) && videopolozka[i].getZanr().equals(zanr)){
                System.out.println(videopolozka[i].toString());
                flag = true;
            }
        }
        if (!flag) System.out.println("Pole je prazdne!");
    }

    public VideoPolozka najdiNejpodobnejsiPolozku(VideoPolozka polozka){
        boolean flag = false;
        int temp = 0;
        int tt = 0;
        for(int i = 0; i < max; i++){
            if (videopolozka[i] != null){
                if(videopolozka[i].podobnostS(polozka) >= temp){
                    temp = videopolozka[i].podobnostS(polozka);
                    tt = i;
                }
                flag = true;
            }
        }
        if (!flag) System.out.println("Pole je prazdne!");
        return videopolozka[tt];
    }
    public Cas spocitejtePrumernouDelku(Druh vybranyDruh){
        int s = 0;
        Cas sum = new Cas(0,0);
        for (int i = 0; i < max; i++) {
            if (videopolozka[i] != null && videopolozka[i].getDruh().equals(vybranyDruh)) {
                sum.minuty = sum.minuty + videopolozka[i].delka.minuty;
                sum.hodiny = sum.hodiny + videopolozka[i].delka.hodiny;
                s = videopolozka[i].delka.prevedNaMinuty() + s;
            }
        }
        return sum;
    }
    public void ulozDoSouboru(String Soubor) throws IOException {
        FileWriter writer = new FileWriter(Soubor + ".csv");
        boolean flag = false;
        for (int i = 0; i < max; i++) {
            if (videopolozka[i] != null ) {
                writer.write(videopolozka[i].toString() + "\n");
                flag = true;
            }
        }
        writer.close();
        if (!flag) System.out.println("Pole je prazdne!");
    }
}
