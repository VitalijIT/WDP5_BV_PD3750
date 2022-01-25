# WDP5_BV_PD3750
Uruchamianie kodów w wątkach i kończenie wątków
Zbudować klasę Letters, która posłuży do równoleglego uruchamiania kodów, wypisujących co sekundę litery podane w napisie przekazanym do konstruktora klasy.
Po stworzeniu obiektu klasy Letters w metodzie main(...) klasy Main wystartować wszystkie wątki, w których mają być wypisywane podane litery.
Po wstrzymaniu działania metody main(...) na 5 sekund - zakończyć działanie wszystkich kodów, wypisujących litery.

Uruchomienie poniższego programu:
    public class Main {

      public static void main(String[] args) throws InterruptedException {
        Letters letters = new Letters("ABCD");
        for (Thread t : letters.getThreads()) System.out.println(t.getName());
        /*<- tu uruchomić 
             wszystkie kody w wątkach 
         */

        Thread.sleep(5000);

        /*<- tu trzeba zapisać
           fragment, który kończy działanie kodów, wypisujących litery 
        */
        System.out.println("\nProgram skończył działanie");
      }

    }
powinno (w tej postaci) wypisać:
Thread A
Thread B
Thread C
Thread D

(po 5 sekundach)
Program skończył działanie

Natomiast po uzupełnieniu kodu w miejscah wskazanych przez /*<-   */ - coś w rodzaju:

Thread A
Thread B
Thread C
Thread D
ACDBDBACACDBCBDA
Program skończył działanie.

Uwaga 1: modyfikacje klasy Main są dopuszczalne tylko w miejscach wskazanych przez /*<- */
Uwaga 2: nie wolno stosować System.exit
Uwaga 3: warto przy definiowaniu metody run() zastosować lambda-wyrażenie
Uwaga 4. W tyn zadania można nie stosować (a nawet nie należy stosować) ExecutorService

__________________________________________________________________________________________________________________

Zadanie: Towary (8 punktów)

Kod, działający w wątku A czyta z pliku ../Towary.txt informacje o towarach w postaci:

id_towaru waga 

tworzy obiekty klasy Towar, zawierające przeczytane informacje oraz wyprowadza na konsolę informacje o liczbie utworzonych  obiektów. Informacja ma być wyprowadzana co 200 obiektów w postaci:

utworzono 200 obiektów
utworzono 400 obiektów
utworzono 600 obiektów
itd.

Kod działający równolegle w innym wątku (B) sięga po te obiekty, sumuje wagę  towarów i  wyprowadza na konsolę informację o przeprowadzonym sumowaniu co 100 obiektów np.:
policzono wage 100 towarów
policzono wage 200 towarów
policzono wage 300 towarów
itd.
Na końcu podaje sumaryczną wagę wszystkich towarów.

Uwagi: 

Plik powinien zawierać co najmniej 10 tys. opisów towarów (należy sobie go wygenerować programistycznie, ale na boku, nie w tym programie),  nazwa pliku (wraz ze ścieżką) jest obowiązkowa , proszę nie dołączać tego pliku do projektu..
Zapewnić synchronizację i koordynację pracy obu wątków.
Forma wydruku na konsoli jest obowiązakowa
Wszystkie klasy w programie winny być publiczne (w różnych plikach)
Wykonanie programu winno zaczynać się w metodzide main()  obowiązakowej klasy Main.
Plik winien znajdować się w nadkatalogu projektu (czyli w katalogu workspace'u)

Za niespełnienie tych warunków nie będą przyznawane punkty.
