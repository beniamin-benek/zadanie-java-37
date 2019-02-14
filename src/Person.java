class Person {

    private String firstName;
    private String lastName;
    private int age;
    private String pesel;

    public Person(String firstName, String lastName, int age, String pesel) throws NullPointerException, NameUndefinedException, IncorrectAgeException  {
        if (firstName == null || lastName == null) throw new NullPointerException();
        if (firstName.length() < 2) throw new NameUndefinedException("Długość imienia jest zbyt krótka.");
        if (lastName.length() < 2) throw new NameUndefinedException("Długość imienia jest zbyt krótka.");
        if (age < 1) throw new IncorrectAgeException("Podana wartość wieku jest zbyt niska.");

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

    public void setFirstName(String firstName) throws NameUndefinedException {
        if (firstName == null) throw new NullPointerException();
        if (firstName.length() < 2) throw new NameUndefinedException("Długość imienia jest zbyt krótka. Spróbuj ponownie.");
        this.firstName = firstName;
    }

    public void setLastName(String lastName) throws NameUndefinedException {
        if (lastName == null) throw new NullPointerException();
        if (lastName.length() < 2) throw new NameUndefinedException("Długość nazwiska jest zbyt krótka. Spróbuj ponownie.");
        this.lastName = lastName;
    }

    public void setAge(int age) throws IncorrectAgeException {
        if (age < 1) throw new IncorrectAgeException("Podana wartość jest zbyt niska. Spróbuj ponownie.");
        this.age = age;
    }

    public void setPesel(String pesel) {
        this.pesel = pesel;
    }
}