public class Person {
    private String firstName;
    private String lastName;
    private int age;

    public Person(String firstName, String lastName, int age) {
        setFirstName(firstName);
        setLastName(lastName);
        setAge(age);
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setAge(int age) {
        if (age < 0) {
            throw new IllegalArgumentException
                    ("Person's age haven't to be negative");
        }
        this.age = age;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (this.getClass().getName() != obj.getClass().getName()) {
            return false;
        }
        Person that = (Person) obj; //приведение типа
        return this.getFirstName().equals(that.getFirstName()) &&
                this.getLastName().equals(that.getLastName()) &&
                this.getAge() == that.getAge();
    }
}
