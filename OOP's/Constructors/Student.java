public class Student {
    private String name;
    private int grade;

    //constructor
    public Student(String name, int grade) {    // constructor with default parameters // building constructor inside a class default constructor
        setName(name);
        setGrade(grade);
    }
    public Student() {    // constructor with default parameters // building constructor inside a class default constructor
        System.out.println("no data  "+"method overloading");
    }

    public Student(String name){
        setName(name);
    }
    // or
    public Student(int grade){
        this("",0);   // use this(). instead of Student()
    }
    private void setName(String name) {
        this.name = name;
        System.out.println(name);
    }

    private String getName() {    // here getters are not required, prints the name without this method
        return name;
    }

    private void setGrade(int grade) {    // getgrade isnt required here,(can be used-optional)
        this.grade = grade;
        System.out.println(grade);
    }
}
