public class studentMain {

    public static void main(String[] args) {
        studentSetPrivate std = new studentSetPrivate();
        std.setID("0001");
        std.setName("phaengkham");
        std.setScore(80.0);

        studentSetPrivate std1 = new studentSetPrivate();
        std1.setID("0002");
        std1.setName("Baby");
        std1.setScore(90.0);

        std.disPlayEmployee();
        std1.disPlayEmployee();

        studentSetPrivate std2 = new studentSetPrivate();
        std2.setName("phaengkham && baby");
        System.out.println("Student Name is: " + std2.getName());
    }
}
