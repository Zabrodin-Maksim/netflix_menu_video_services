public class Cas {
    int hodiny, minuty;

    public Cas(int hodiny, int minuty) {
        this.hodiny = hodiny;
        this.minuty = minuty;
    }

    public int getHodiny() {
        return hodiny;
    }

    public int getMinuty() {
        return minuty;
    }

    @Override
    public String toString() {
        return "Cas{" +
                "hodiny=" + hodiny +
                ", minuty=" + minuty +
                '}';
    }
    public int prevedNaMinuty(){
        int t = (hodiny * 60) + minuty;
        return t;
    }
}
