// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        double temperatura = 40;
        System.out.println( String.format("Está %.1fc°",temperatura));
        double fa =  temperatura * 1.8 + 32;
        System.out.println(String.format("""
                A Temperatura está sendo convertida para Fahrenheit...
                Está: %.1f F°
                """,fa));


        }
    }