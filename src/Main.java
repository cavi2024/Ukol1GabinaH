import java.math.BigDecimal;

      public class Main {

        public static void ukol1() {
            System.out.println("Hello world!");
        }

        public static void ukol2() {
            String uzivatel = "Karel";
            System.out.println(uzivatel);
        }

        public static void ukol3() {
            int pocetLekci = 10;
            System.out.println(pocetLekci);
        }

        public static void ukol4() {
            int cena = 10;
            System.out.println(cena);
        }

        public static void ukol5() {
            BigDecimal cena = BigDecimal.ZERO;
            for (int i = 0; i < 10; i++) {
                cena = cena.add(BigDecimal.valueOf(0.1));
            }
            System.out.println(cena);
        }

        public static void ukol6() {
            BigDecimal cena2 = BigDecimal.ZERO;
            cena2 = cena2.add(BigDecimal.valueOf(0.1));
            System.out.println(cena2);
        }

        public static void ukol7() {
            int vykonMotoru = 120;
            System.out.println("Výkon Motoru je: "+ vykonMotoru +" kW.");
        }

        public static void ukol8() {
            int velikostKosile = 37;
            System.out.println("Velikost košile je: "+ velikostKosile+".");
        }

        public static void ukol9() {
            System.out.println("Metoda *skoro* bez chybičky!");
        }

        public static void main(String[] args) {
            System.out.println("Oprav chyby a spusť všechny metody!");
            System.out.println("Komentáře odstraníš klávesovou "
                    +"zkratkou <Ctrl>+</> - použij lomítko "
                    +"na numerické klávesnici.");
            ukol1();
            ukol2();
            ukol3();
            ukol4();
            ukol5();
            ukol6();
            ukol7();
            ukol8();
            ukol9();
        }
    }