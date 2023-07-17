public class Main {
    public static void main(String[] args) {
        /*TASK1*/
        Gryffindor harryPotter = new Gryffindor("Harry", "Potter", 90, 90,100,
                100,100);
        Gryffindor hermioneGranger = new Gryffindor("Hermione", "Granger", 80, 80,
                40,40, 40);
        Gryffindor ronWeasley = new Gryffindor("Ron", "Weasley", 85, 80,20,20,
                20);

        Slytherin dracoMalfoy = new Slytherin("Draco", "Malfoy", 80,90,80,
                70, 90,70, 80);
        Slytherin grahamMontague = new Slytherin("Graham", "Montague", 70, 60, 80,
                50, 60,40,60);
        Slytherin gregoryGoyle = new Slytherin("Gregory", "Goyle", 60, 50, 30,
                50, 40, 50,40);

        Hufflepuff zachariasSmith = new Hufflepuff ("Zacharias", "Smith", 50,100,80,
                90,60);
        Hufflepuff cedricDiggory = new Hufflepuff("Cedric","Diggory", 80, 90, 60,
                80, 60);
        Hufflepuff jastinFinchFletchley = new Hufflepuff("Jastin", "Finch-Fletchley", 60,80,
                60,60,80);

        Ravenclaw zhouChang = new Ravenclaw("Zhou", "Chang", 80,80,80,70,
                50,80);
        Ravenclaw padmaPatil =new Ravenclaw("Padma", "Patil", 60, 80,90, 80,
                60, 50);
        Ravenclaw marcusBelby = new Ravenclaw("Marcus", "Belby", 60, 80, 60,
                50, 40, 50);

        /*TASK2*/
        System.out.println("   ***Task 2 ***");
        System.out.println(harryPotter);
        System.out.println(dracoMalfoy);
        System.out.println(zachariasSmith);
        System.out.println(zhouChang);

        /*TASK3*/
        System.out.println("   ***Task 3 ***");
        Gryffindor.compareTwoStudents(harryPotter,hermioneGranger);
        Gryffindor.compareTwoStudents(hermioneGranger,ronWeasley);

        Hufflepuff.compareTwoStudents(zachariasSmith, cedricDiggory);
        Hufflepuff.compareTwoStudents(cedricDiggory, jastinFinchFletchley);

        Slytherin.compareTwoStudents(dracoMalfoy,grahamMontague);
        Slytherin.compareTwoStudents(grahamMontague,gregoryGoyle);

        Ravenclaw.compareTwoStudents(zhouChang, padmaPatil);
        Ravenclaw.compareTwoStudents(padmaPatil, marcusBelby);

        /*TASK4*/
        System.out.println("   ***Task 4 ***");
        Hogwarts.compareAnyTwoStudents(harryPotter, zachariasSmith);
        Hogwarts.compareAnyTwoStudents(ronWeasley, zhouChang);
    }
}