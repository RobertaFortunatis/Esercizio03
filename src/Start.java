public class Start {
    public static void main(String[] args) {

        //Dichiarazione

        House house1, house2;

        //Creazione

        house1 = new House("Via Manzoni", 5);
        house2 = new House("Via Garibaldi", 4);

        house1.printDetails1();
        house2.printDetails2();
    }
}