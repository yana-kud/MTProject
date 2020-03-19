package study;

public class Program {

    public static void main(String[] args) {
        Person tom = new Employee("Tom", "Google");
        tom.display();
        Person sam = new Employee("Sam", "Oracle");
        sam.display();
        Person kate = new Client("Kate", "DeutcheBank",3000);
        kate.display();


    }
}
