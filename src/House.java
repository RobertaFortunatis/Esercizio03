public class House {
    private String address;
    private int numberOfFloors;

    //Metodo costruttore
    public House(String address, int numberOfFloors) {
        System.out.println("A new house was built");
        this.address = address;
        this.numberOfFloors = numberOfFloors;

    }
    public void printDetails1(){
        System.out.println("House 1 " + "is located in " + address + "," + " its floors are " + numberOfFloors );
    }

    public void printDetails2(){
        System.out.println("House 2 " + "is located in " + address + "," + " its floors are " + numberOfFloors);
    }


}
