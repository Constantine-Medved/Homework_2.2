public class Hufflepuff extends Hogwarts {
    private int diligence;
    private int loyalty;
    private int honesty;
    public Hufflepuff (String name, String surname, int magic, int transgression, int diligence, int loyalty, int honesty){
        super(name, surname, magic, transgression);
        this.diligence = diligence;
        this.loyalty = loyalty;
        this.honesty = honesty;
    }
    @Override
    public String toString() {
        return "Hufflepuff{" +
                super.toString() +
                ", 2diligence=" + diligence +
                ", loyalty=" + loyalty +
                ", honesty=" + honesty +
                '}';
    }
    public static void compareTwoStudents (Hufflepuff first, Hufflepuff second) {
        int countFirst = first.diligence + first.loyalty + first.honesty;
        int countSecond = second.diligence + second.loyalty + second.honesty;
        if (countFirst > countSecond) {
            System.out.println(first.getName() + " " + first.getSurname() + " is a better Hufflepuff than "
                    + second.getName() + " " + second.getSurname() + ".");
        } else if (countFirst < countSecond) {
            System.out.println(second.getName() + " " + second.getSurname() + " is a better Hufflepuff than "
                    + first.getName() + " " + first.getSurname() + ".");
        } else {
            System.out.println(first.getName() + " " + first.getSurname()  + " and " + second.getName() + " "
                    + second.getSurname() + " have same power.");
        }
    }
}
