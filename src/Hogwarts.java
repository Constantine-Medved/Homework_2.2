public abstract class Hogwarts {
    private String name;
    private String surname;
    private int magic;
    private int transgression;
    public Hogwarts (String name, String surname, int magic, int transgression){
        this.name = name;
        this.surname = surname;
        this.magic = magic;
        this.transgression = transgression;
    }

    @Override
    public String toString() {
        return  " name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", magic=" + magic +
                ", transgression=" + transgression;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }
    public static void compareTwoStudents (Hogwarts first, Hogwarts second) {
        System.out.println(" ==> Comparing of magic and transgression power between " + first.getName() + " "
                + first.getSurname() + " & " + second.getName() + " " + second.getSurname() + " :");
        if (first.magic > second.magic) {
            System.out.println(first.getName() + " " + first.getSurname() + " has more magic power than "
                    + second.getName() + " " + second.getSurname() + ".");
        } else if (first.magic < second.magic) {
            System.out.println(second.getName() + " " + second.getSurname() + " has more magic power than "
                    + first.getName() + " " + first.getSurname() + ".");
        } else {
            System.out.println(first.getName() + " " + first.getSurname()  + " and " + second.getName() + " "
                    + second.getSurname() + " have same magic power.");
        }
        if (first.transgression > second.transgression) {
            System.out.println(first.getName() + " " + first.getSurname() + " has more transgression power than "
                    + second.getName() + " " + second.getSurname() + ".");
        } else if (first.transgression < second.transgression) {
            System.out.println(second.getName() + " " + second.getSurname() + " has more transgression power than "
                    + first.getName() + " " + first.getSurname() + ".");
        } else {
            System.out.println(first.getName() + " " + first.getSurname()  + " and " + second.getName() + " "
                    + second.getSurname() + " have same transgression power.");
        }

    }
}
