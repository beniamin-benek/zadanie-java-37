class Person {

    private String firstName;
    private String lastName;
    private int age;
    private String pesel;

    public Person(String firstName, String lastName, int age, String pesel) {

        if (firstName == null || lastName == null)
            throw new NullPointerException();
        if (firstName.length() < 2 || lastName.length() < 2)
            throw new NameUndefinedException("Wprowadzona wartość jest niepoprawne.");
        if (age < 1)
            throw new IncorrectAgeException("Wprowadzona wartość jest nipoprawna.");

        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.pesel = pesel;

    }

    public Person() {
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", pesel='" + pesel + '\'' +
                '}';
    }

}