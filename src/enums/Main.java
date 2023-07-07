package enums;

public class Main {

    public static void main(String[] args) {

        for (Dia dia : Dia.values()) {
            System.out.println("El dia de la semana es: " + dia);
        }

        Dia domingo = Dia.DOMINGO;
        System.out.println(domingo.name());
        System.out.println(domingo.ordinal());
        System.out.println(domingo.toString());
    }
}
