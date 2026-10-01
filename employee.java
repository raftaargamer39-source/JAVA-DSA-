public class employee {
    
    //Instance variables
     String name;
     int age;
     double salary;

    //Instance method
    void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Salary: " + salary);
 }
   
  


    public static void main(String[] args) {

        // Create object
        employee pm= new employee();

        // Assign values
        pm.name = "lakshya";
        pm.age = 20;
        pm.salary = 30000;

        // Call instance method
        pm.displayDetails();
    }
}
   



    

