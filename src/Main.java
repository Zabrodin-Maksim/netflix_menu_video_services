import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        Cas p = new Cas(1,50);
        Cas p1 = new Cas(1,30);
        VideoPolozka s1 = new VideoPolozka ("forest", "USA",Druh.FILM,"drama", p);
        VideoPolozka s2 = new VideoPolozka ("PR", "USA",Druh.SERIAL,"drama", p1);
        VideoPolozka s3 = new VideoPolozka ("KUKU", "USA",Druh.SERIAL,"drama", p1);
        Obsah n = new Obsah();
        n.pridejPolozku(s1);
        n.pridejPolozku(s2);
        n.pridejPolozku(s3);
        n.vypisPolozkyPodleDruhu(Druh.SERIAL);
        System.out.println(n.spocitejtePrumernouDelku(Druh.SERIAL).toString());

        n.vypisPolozky();
        n.ulozDoSouboru("test");
    }
}