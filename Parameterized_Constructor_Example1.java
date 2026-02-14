public class Parameterized_Constructor_Example1 {
    int id;
    String name; 
    
    Parameterized_Constructor_Example1(int id, String name) {
        this.id = id;
        this.name = name;
    }

    void display() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
    }

    public static void main(String[] args) {
        Parameterized_Constructor_Example1 obj = new Parameterized_Constructor_Example1(101, "John");
        obj.display();
    }
}

