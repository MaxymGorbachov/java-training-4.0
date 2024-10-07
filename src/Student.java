import java.util.List;


public class Student {
    private int rating;
    private String name;

    public static double ratingSum;
    public static int studentsAmount;


    public Student() {
        studentsAmount++;
    }

    public Student(String name) {
        this.name = name;
        studentsAmount++;
    }

    public Student(String name, int rating) {
        this.name = name;
        this.rating = rating;
        ratingSum += rating;
        studentsAmount++;
    }

    public static double getAvgRating() {
        if (studentsAmount == 0) {
            return 0.0d;
        } else {
            return ratingSum / studentsAmount;
        }
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRating() {
        return this.rating;
    }

    public void setRating(int rating) {
        ratingSum -= this.rating;
        this.rating = rating;
        ratingSum += rating;
    }

    public boolean betterStudent(Student student) {
        return this.rating > student.rating;
    }

    public void changeRating(int rating) {
        ratingSum -= this.rating;
        this.rating = rating;
        ratingSum += rating;

    }

    public static void removeStudent(Student student) {
        studentsAmount--;
        ratingSum -= student.getRating();
    }

    @Override
    public String toString() {
        return "Student{name='" + this.name + "', rating=" + this.rating + "}";
    }

    public static void main(String[] args) {

        Student student1 = new Student("John",10);
        Student student2 = new Student("Bill",25);
        Student student3 = new Student("Rodrigo",33);

        System.out.println(Student.getAvgRating());
        student2.changeRating(11);
        System.out.println(Student.getAvgRating());

    }
}