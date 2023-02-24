# netflix_menu_video_services

##Zadání Netflix

Zjednodušená verze menu slavné streamovací videoslužby s filmy a seriály.

enum Druh {

FILM,

SERIÁL
}

### Třída Čas

atributy:

• int hodiny;

• int minuty;

metody:

• parametrický konstruktor, gettery

• toString() // 15:35

• převeďNaMinuty() // převede uložený čas z hodin a minut na minuty

### Třída VideoPoložka

atributy:

• String název;

• String zeměPůvodu;

• Druh druh;

• String žánr; // komedie, horor, thriller, drama

• Čas délka;

metody:

• parametrický konstruktor, gettery, toString()

• int podobnostS(VideoPoložka druháPoložka)

> bude počítat podobnost s druhou položkou

> počítání skóre podobnosti

> když bude souhlasit druh položky s druhou položkou skóre +100

> když bude souhlasit žánr položky s druhou položkou skóre +100

> když bude souhlasit země původu položky s druhou položkou skóre +100

> když se délka položky v porovnání s druhou položkou nebude lišit o víc než 20 minut tak skóre +100

### Třída Obsah

atributy:

• pole/seznam videopoložek

• zbytek na vašem uvážení

metody:

• void přidejPoložku(VideoPoložka položka); // přidá videopoložku do pole/seznamu

• void vypišPoložky(); // vypíše všechny videopoložky v poli/seznamu

• void vypišPoložkyPodleDruhu(Druh vybranýDruh); // vypíše buď jen seriály nebo jen filmy

• void vypišPoložkyPodleDruhuPlusŽánru(Druh vybranýDruh, String žánr)

>  podobně jako předchozí, ale zároveň filtrovat i podle žánru

• void najdiNejpodobnějšíPoložku(VideoPoložka položka)

> najde nejpodobnější položku k položce předané v parametru

> využijte metodu podobnostS() u třídy položka

• void spočítejPrůměrnouDélku(Druh vybranýDruh)

> vypočítá průměrnou délku všech filmů nebo všech seriálů, podle parametr vybraný druh

• void uložDoSouboru(String soubor)

> vypíše do souboru všechny filmu ze seznamu/pole jako CSV

> parametry filmu oddělené středníkem

> příklad: Forrest Gump;USA;film;drama;1:5
