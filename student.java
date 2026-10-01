public class student{
    static void greet(){
        System.out.println("hello");
        return;
    }
    static int sum(){
        int a = 5;
        int b = 10;
        int sum = a + b;
        return sum;
        
    }


    


static void main(String[] args){
    String name = "lakshya";
    String rollno = "2025btced272";
    String branch = "csd";
    String course = "Btech";


    System.out.println("name:" + name);
    System.out.println("course:" + course);
    System.out.println("branch:" + branch);
    System.out.println("roll no:"+ rollno);

     
    greet();
    
    sum();
    System.out.println(sum());
  
    product();
   }


static void product(){
    int a = 10;
    int b = 20;
    int product = a * b ;
    System.out.println(product);
}
}