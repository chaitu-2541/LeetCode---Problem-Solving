public class Copy_Constructor_Example1 {
    String Course_ID;
    String Course_Name;
    int Course_Duration;

    // a parameterized constructor to initialize the course details
    public Copy_Constructor_Example1(String Course_ID, String Course_Name, int Course_Duration) {
        this.Course_ID = Course_ID;
        this.Course_Name = Course_Name;
        this.Course_Duration = Course_Duration;
    }

    // a copy constructor to create a new object by copying the details of an existing object
    public Copy_Constructor_Example1(Copy_Constructor_Example1 course)
    {
        this.Course_ID = course.Course_ID;
        this.Course_Name = course.Course_Name;
        this.Course_Duration = course.Course_Duration;

    }

    public void display() {
        System.out.println("Course ID: " + Course_ID);
        System.out.println("Course Name: " + Course_Name);
        System.out.println("Course Duration: " + Course_Duration + " months");
    }

    public static void main(String[] args) {
        Copy_Constructor_Example1 course1 = new Copy_Constructor_Example1("CS101", "Computer Science", 6);
        Copy_Constructor_Example1 course2 = new Copy_Constructor_Example1(course1);

        System.out.println("Course 1 Details:");
        course1.display();

        System.out.println("\nCourse 2 Details (Copy of Course 1):");
        course2.display();
    }
}

