public class Program {
    public static void main(String[] args) {
        int a = 5;
        int b = 5;

        Person p1 = new Person("Daniil", "Gavrilov", 29);
        Person p2 = new Person("Daniil", "Gavrilov", 29);
        if (a == b) {
            System.out.println("same");
        } else {
            System.out.println("different");
        }
        if (p1.equals(p2)) {
            System.out.println("same");
        } else {
            System.out.println("different");
        }
    }

    public static void changePrim(int x) {
        x = 17;
    }

    public static void changeReference(Person per) {
        per.setLastName("Ivanov");
    }


}
