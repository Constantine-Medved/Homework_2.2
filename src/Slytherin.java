public class Slytherin extends Hogwarts{
    private int cunning;
    private int determination;
    private int ambition;
    private int inventiveness;
    private int powerLust;

    public Slytherin(String name, String surname, int magic, int transgression, int cunning, int determination, int ambition, int inventiveness, int powerLust) {
        super(name, surname, magic, transgression);
        this.cunning = cunning;
        this.determination = determination;
        this.ambition = ambition;
        this.inventiveness = inventiveness;
        this.powerLust = powerLust;
    }

    @Override
    public String toString() {
        return "Slytherin{" +
                super.toString() +
                ", cunning=" + cunning +
                ", determination=" + determination +
                ", ambition=" + ambition +
                ", inventiveness=" + inventiveness +
                ", powerLust=" + powerLust +
                '}';
    }
    public static void compareTwoStudents (Slytherin first, Slytherin second) {
        int countFirst = first.cunning + first.determination + first.ambition + first.inventiveness + first.powerLust;
        int countSecond = second.cunning + second.determination + second.ambition + second.inventiveness + second.powerLust;
        if (countFirst > countSecond) {
            System.out.println(first.getName() + " " + first.getSurname() + " is a better Slytherin than "
                    + second.getName() + " " + second.getSurname() + ".");
        } else if (countFirst < countSecond) {
            System.out.println(second.getName() + " " + second.getSurname() + " is a better Slytherin than "
                    + first.getName() + " " + first.getSurname() + ".");
        } else {
            System.out.println(first.getName() + " " + first.getSurname()  + " and " + second.getName() + " "
                    + second.getSurname() + " have same power.");
        }
    }
}
