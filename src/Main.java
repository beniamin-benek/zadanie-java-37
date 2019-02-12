import java.util.InputMismatchException;
import java.util.Scanner;

class Main {

    public static void main(String[] args) {

        Person person = addPerson();
        System.out.println(person.toString());

    }

    static Person addPerson() {
        Scanner scanner = new Scanner(System.in);
        String firstName = null;
        String lastName = null;
        int age = 0;
        try {
            System.out.print("Podaj imię: ");
            firstName = scanner.nextLine();
//            System.out.print("Podaj nazwisko: ");
//            lastName = scanner.nextLine();
        } catch (NameUndefinedException e1) {
            System.out.println(e1.getMessage());
        }
        try {
            System.out.print("Podaj nazwisko: ");
            lastName = scanner.nextLine();
        } catch (NameUndefinedException e3) {
            System.out.println(e3.getMessage());
        }
        try {
            System.out.print("Podaj wiek: ");
            age = scanner.nextInt();
            scanner.nextLine();
        } catch (IncorrectAgeException | InputMismatchException e2) {
            System.out.println(e2.getMessage());
        }
            System.out.print("Podaj pesel: ");
            String pesel = scanner.nextLine();

            return new Person(firstName, lastName, age, pesel);
        }
}