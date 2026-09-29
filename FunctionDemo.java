class calculator {
    //Function Overloading

    // Methods 1: add two intergers
    int add(int a, int b) {
        return a+b;
    }
      
    //Method 2: Add three integer
    int add(int a, int b, int c){
        return a+b+c;
    }

    //method 3: Add two double values
    double add(double a, double b) {
        return a + b; 
    }
    
}

// Class demonstrating Condtractor and Returning by Reference
class Student {
    String name;
    int age;

    //deault Constructor
    Student () {
        name = "Unknown";
        age = 0;
    }
    //Parameterized Constructor
    Student(String n, int a){
        name = n;
        age = a;
    }
     
    // Copy Constructor
    Student(Student s){
        this.name = s.name;
        this.age = s.age;
    }
    
    //Method to display student details
     void display(){
        System.out.println("Name:" + name +",Age:" + age);
     }
      
     //Method returning reference to current object
     Student getStudent(){
        return this;
     }
}

public class FunctionDemo {
    public static void main(String[] args) {
        
        calculator calc=new calculator();
        System.out.println("Add two integers:" + calc.add(5, 10));
        System.out.println("Add three integers:" + calc.add(5, 10, 15));
        System.out.println("Add two doubles:" + calc.add(5.5, 4.5));


        Student s1 = new Student();
        Student s2 = new Student("Nitin", 22);
        Student s3 = new Student(s2);

        s1.display();
         s2.display();
          s3.display();


          Student s4 = s2.getStudent();
          System.out.println("Student s4 details (reference to s2):");
          s4.display();
    }
}

