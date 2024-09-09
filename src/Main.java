import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean kontynuuj = true;

        while (kontynuuj) {
            System.out.println("=== Kalkulator Zaawansowany ===");
            System.out.println("Wybierz operację:");
            System.out.println("1 - Dodawanie");
            System.out.println("2 - Odejmowanie");
            System.out.println("3 - Mnożenie");
            System.out.println("4 - Dzielenie");
            System.out.println("5 - Potęgowanie");
            System.out.println("6 - Pierwiastek kwadratowy");
            System.out.println("7 - Procenty");
            System.out.println("8 - Wyjście");

            int wybor = scanner.nextInt();

            // Zakończenie programu
            if (wybor == 8) {
                kontynuuj = false;
                System.out.println("Dziękujemy za skorzystanie z kalkulatora!");
                break;
            }

            double liczba1 = 0, liczba2 = 0;
            double wynik = 0;

            // Pobieranie liczb dla operacji (z wyjątkiem pierwiastka kwadratowego)
            if (wybor == 6) {
                // Pierwiastek kwadratowy potrzebuje tylko jednej liczby
                System.out.println("Podaj liczbę do obliczenia pierwiastka:");
                liczba1 = scanner.nextDouble();
            } else if (wybor == 7) {
                // Procenty wymagają liczby i wartości procentu
                System.out.println("Podaj liczbę:");
                liczba1 = scanner.nextDouble();
                System.out.println("Podaj procent (%):");
                liczba2 = scanner.nextDouble();
            } else {
                // Pozostałe operacje wymagają dwóch liczb
                System.out.println("Podaj pierwszą liczbę:");
                liczba1 = scanner.nextDouble();
                System.out.println("Podaj drugą liczbę:");
                liczba2 = scanner.nextDouble();
            }

            // Obsługa operacji
            switch (wybor) {
                case 1:
                    wynik = liczba1 + liczba2;
                    System.out.println("Wynik dodawania: " + wynik);
                    break;
                case 2:
                    wynik = liczba1 - liczba2;
                    System.out.println("Wynik odejmowania: " + wynik);
                    break;
                case 3:
                    wynik = liczba1 * liczba2;
                    System.out.println("Wynik mnożenia: " + wynik);
                    break;
                case 4:
                    if (liczba2 != 0) {
                        wynik = liczba1 / liczba2;
                        System.out.println("Wynik dzielenia: " + wynik);
                    } else {
                        System.out.println("Błąd: Nie można dzielić przez zero!");
                    }
                    break;
                case 5:
                    wynik = Math.pow(liczba1, liczba2);
                    System.out.println("Wynik potęgowania: " + wynik);
                    break;
                case 6:
                    if (liczba1 >= 0) {
                        wynik = Math.sqrt(liczba1);
                        System.out.println("Pierwiastek kwadratowy z " + liczba1 + " to: " + wynik);
                    } else {
                        System.out.println("Błąd: Nie można wyciągnąć pierwiastka z liczby ujemnej!");
                    }
                    break;
                case 7:
                    wynik = (liczba1 * liczba2) / 100;
                    System.out.println(liczba2 + "% z " + liczba1 + " to: " + wynik);
                    break;
                default:
                    System.out.println("Błąd: Nieprawidłowa opcja.");
            }

            System.out.println(); // Pusta linia dla czytelności
        }
    }
}
