public class Ravenclaw extends Hogwarts {
    private int smart;
    private int wisdom;
    private int wit;
    private int creation;

    public Ravenclaw (String name, String surname, int magic, int transgression, int smart, int wisdom, int wit, int creation) {
        super(name, surname, magic, transgression);
        this.smart = smart;
        this.wisdom = wisdom;
        this.wit = wit;
        this.creation = creation;
    }
    @Override
    public String toString() {
        return "Ravenclaw{" +
                super.toString() +
                ", smart=" + smart +
                ", wisdom=" + wisdom +
                ", wit=" + wit +
                ", creation=" + creation +
                '}';
    }
    public static void compareTwoStudents (Ravenclaw first, Ravenclaw second) {
        int countFirst = first.smart + first.wisdom + first.wit + first.creation;
        int countSecond = second.smart + second.wisdom + second.wit + second.creation;
        if (countFirst > countSecond) {
            System.out.println(first.getName() + " " + first.getSurname() + " is a better Ravenclaw than "
                    + second.getName() + " " + second.getSurname() + ".");
        } else if (countFirst < countSecond) {
            System.out.println(second.getName() + " " + second.getSurname() + " is a better Ravenclaw than "
                    + first.getName() + " " + first.getSurname() + ".");
        } else {
            System.out.println(first.getName() + " " + first.getSurname()  + " and " + second.getName() + " "
                    + second.getSurname() + " have same power.");
        }
    }
}
