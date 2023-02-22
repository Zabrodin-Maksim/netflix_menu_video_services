public class VideoPolozka {
    String nazev, zemePuvodu;
    Druh druh;
    String zanr;
    Cas delka;

    public VideoPolozka(String nazev, String zemePuvodu, Druh druh, String zanr, Cas delka) {
        this.nazev = nazev;
        this.zemePuvodu = zemePuvodu;
        this.druh = druh;
        this.zanr = zanr;
        this.delka = delka;
    }

    public String getNazev() {
        return nazev;
    }

    public String getZemePuvodu() {
        return zemePuvodu;
    }

    public Druh getDruh() {
        return druh;
    }

    public String getZanr() {
        return zanr;
    }

    public Cas getDelka() {
        return delka;
    }

    @Override
    public String toString() {
        return  nazev + ';' +
                zemePuvodu + ';' +
                druh + ';' +
                zanr + ';' +
                delka.hodiny + ':' +
                delka.minuty
                ;
    }
    public int podobnostS(VideoPolozka druhaPolozka){
        int ref = 0;
        int raz = this.delka.prevedNaMinuty() - druhaPolozka.delka.prevedNaMinuty();
        if (this.druh == druhaPolozka.druh){ref= ref + 100;}
        if (this.zanr == druhaPolozka.zanr){ref= ref + 100;}
        if(this.zemePuvodu == druhaPolozka.zemePuvodu){ref= ref + 100;}
        if(Math.abs(raz) <= 20){ref= ref + 100;}
        return ref;
    }
}
