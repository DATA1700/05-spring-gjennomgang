# DATA1700 Webprogrammering - Løsningsforslag

## Oppgave 1

Det skal lages et klient-tjener-program som svarer med  gjennomsnittstemperaturen for Oslo for en gitt måned. Det skal kunne skrives inn en måned på nettsiden, denne skal så overføres til server når en knapp trykkes.  På server skal det ligge et array med tolv temperaturer (én for hver måned). Den tilsvarende temperaturen skal så overføres tilbake til get-kallet i klienten og vises på nettsiden.

En HTML-fil (index.html) skal inneholde all klientkode og det skal opprettes en controller på server med en get-metode.

Bruk følgende kode for å opprette arrayet på server:

private final Integer[] tempArray = new Integer[]{-3,-2,2,7,12,16,18,17,12,7,3,-2};

Bruk videre en switch for å "oversette" månedsnavn til array-indeks.

## Oppgave 2

Lag en valutakalkulator med valutakursene lagret i et array på server. En "Valuta" er et objekt med to attributter, valutasort (USD, SEK, etc.) og valutakurs. Applikasjonen skal ha to HTML-sider. Den første HTML-siden initierer valutakursene i arrayet på server. Denne må kalles etter applikasjonen har startet, før valutakalkulatoren kan brukes.

Arrayet på server kan være:

private ArrayList<Valuta> valutaRegister = new ArrayList<>();

Den andre HTML-siden skal inneholde to inputfelter, én for valutasort og én for verdien man ønsker å omforme til NOK. Når så en knapp trykkes skal de to inputfeltene overføres som et "Valuta"-objekt (nå med beløpet i attributtet/feltet for valutakurs) til server. Der skal man så bruke valutasorten til å finne den tilsvarende valutakursen i arrayet. Så skal man beregne norske kroner fra dette, returnere beløpet til klienten og vise det der. (Alternativt kan det lages en egen klasse for overføringen av beløp og valutasort til server for å unngå å bruke "Valuta"-klassen til to ulike konsepter.)

## Ekstraoppgave

Implementer kalkulatoroppgaven fra forrige uke på nytt, slik at alle beregningene (pluss, minus, gange og dele) gjøres på tjener/server. Det skal sjekkes at input er tall både på klienten (i JavaScript/jQuery) og på serveren/tjeneren (i Java). Dersom det deles med 0 så bør det returneres en feilmelding fra server/tjener.