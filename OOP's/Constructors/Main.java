public class Main {
    public static void main(String[] args) {
        // creating constructor
        var student = new Student("Prad",10);
        var student1 = new Student("PPH",9);
        var student2 = new Student(); // overloading constructor or method overloading
        //as set method is private we cant use parameters separately //student.setName("PPH"); student.setGrade(9);
        Student student3 = new Student("PPJ"); // constructor overloading with 1 parameter
        Student stu = new Student(0); // method overloading using this() method

    }

}