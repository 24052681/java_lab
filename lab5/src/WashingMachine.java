/*
Define an interface Motor with a data member –capacity and two methods such as run() and consume(). Define a Java class ‘Washing machine’ which implements this interface and write the code to check the value of the interface data member thru an object of the class.
*/


interface Motor {
    int capacity = 5;

    void run();
    void consume();
}

class WashingMachine implements Motor {

    public void run() {
        System.out.println("Washing machine is running");
    }

    public void consume() {
        System.out.println("Washing machine consumes electricity");
    }

    public static void main(String[] args) {
        WashingMachine wm = new WashingMachine();

        wm.run();
        wm.consume();

        System.out.println("Capacity of the motor is " + capacity);
    }
}
