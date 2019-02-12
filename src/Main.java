import java.util.Scanner;

class Main {

    public static void main(String[] args) {

        Person person = new Person();
        Scanner scanner = new Scanner(System.in);
        String firstName;
        String lastName;
        int age;
        boolean error = true;

        System.out.println("Podaj imię: ");
        do {
            try {
                firstName = scanner.nextLine();
                person.setFirstName(firstName);
                error = false;
                System.out.println("Dzięki!");
            } catch (NameUndefinedException e) {
                System.err.println(e.getMessage());
            }
        } while (error);
        error = true;
        System.out.println("Podaj nazwisko: ");
        do {
            try {
                lastName = scanner.nextLine();
                person.setLastName(lastName);
                error = false;
                System.out.println("Dzięki!");
            } catch (NameUndefinedException e) {
                System.err.println(e.getMessage());
            }
        } while (error);
        error = true;
        System.out.println("Podaj wiek: ");
        do {
            try {
                age = scanner.nextInt();
                person.setAge(age);
                scanner.nextLine();
                error = false;
                System.out.println("Dzięki!");
            } catch (IncorrectAgeException /*| InputMismatchException*/ e) {
                System.err.println(e.getMessage());
            }
        } while (error);

        System.out.println("Podaj pesel:");
        String pesel = scanner.nextLine();
        person.setPesel(pesel); //zakładam, że pole pesel może być puste
        System.out.println("Dzięki\n");

        System.out.println(person.toString());
    }

}