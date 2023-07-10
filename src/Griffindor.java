public class Griffindor extends Hogwarts {
    private int nobility;
    private int honor;
    private int bravery;
    public Griffindor (String name, String surname, int magic, int transgression, int nobility, int honor, int bravery){
        super(name, surname, magic, transgression);
        this.nobility =nobility;
        this.honor = honor;
        this.bravery =bravery;
    }
}
