public class Main {
    public static void main(String[] args) {

//        for (int i = 1; i <= 5; i++) {
//            LPAStudent s = new LPAStudent("S92300" + i,
//                    switch (i) {
//                case 1 -> "Mary";
//                case 2 -> "Carol";
//                case 3 -> "Tim";
//                case 4 -> "Harry";
//                case 5 -> "Lisa";
//                        default -> "Anonymous";
//                    },
//                    "05/11/1985",
//                    "Java Masterclass");
//            System.out.println(s); // calls toString() as it was created on class
//        }
//
//        Student pojoStudent = new Student("S923006", "Ann",
//                "05/11/1985", "Java Masterclass");
//        LPAStudent recordStudent = new LPAStudent("S923007", "Bill",
//                "05/11/1985", "Java Masterclass");
//
//        System.out.println(pojoStudent);
//        System.out.println(recordStudent);
//
//        // record uses accessor message (without get/set syntax)
//        pojoStudent.setClassList(pojoStudent.getClassList() + ", Java OCP Exam 829");
//        // Cannot compile as record is immutable
//        //recordStudent.setClassList(recordStudent.getClassList() + ", Java OCP Exam 829");
//        System.out.println(pojoStudent.getName() + " is taking " + pojoStudent.getClassList());
//        System.out.println(recordStudent.name() + " is taking " + recordStudent.classList());

//        Point first = new Point(6, 5);
//        Point second = new Point(3, 1);
//
//        System.out.println("distance(0,0)= " + first.distance());
//        System.out.println("distance(second)= " + first.distance(second));
//
//        System.out.println("distance(2,2)= " + first.distance(2, 2));
//        Point point = new Point();
//        System.out.println("distance()= " + point.distance());

        Carpet carpet = new Carpet(3.5);
        Floor floor = new Floor(2.75, 4.0);
        Calculator calculator = new Calculator(floor, carpet);
        System.out.println("total= " + calculator.getTotalCost());

        carpet = new Carpet(1.5);
        floor = new Floor(5.4, 4.5);
        calculator = new Calculator(floor, carpet);
        System.out.println("total= " + calculator.getTotalCost());
    }
}
