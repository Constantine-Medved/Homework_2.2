public class Gryffindor extends Hogwarts {
    private int nobility;
    private int honor;
    private int bravery;
    public Gryffindor (String name, String surname, int magic, int transgression, int nobility, int honor, int bravery){
        super(name, surname, magic, transgression);
        this.nobility = nobility;
        this.honor = honor;
        this.bravery = bravery;
    }
    @Override
    public String toString() {
        return "Gryffindor{" +
                super.toString() +
                ", nobility=" + nobility +
                ", honor=" + honor +
                ", bravery=" + bravery +
                '}';
    }
    public static void compareTwoStudents (Gryffindor first, Gryffindor second) {
        int countFirst = first.nobility + first.honor + first.bravery;
        int countSecond = second.nobility + second.honor + second.bravery;
        if (countFirst > countSecond) {
            System.out.println(first.getName() + " " + first.getSurname() + " is a better Gryffindor than "
                    + second.getName() + " " + second.getSurname() + ".");
        } else if (countFirst < countSecond) {
            System.out.println(second.getName() + " " + second.getSurname() + " is a better Gryffindor than "
                    + first.getName() + " " + first.getSurname() + ".");
        } else {
            System.out.println(first.getName() + " " + first.getSurname() + " and " + second.getName() + " " + second.getSurname()
                    + " have same power.");
        }
    }
}
