import java.util.Scanner;
public class question {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the age");
        int age = sc.nextInt();

        System.out.println("number of tickets:");
        int tickets = sc.nextInt();

        System.out.println("Enter the price of ticket:");
        int price = sc.nextInt();
        if (age <=12) {
            System.out.println("get 30% discount");
            double discount = price * 0.30;
            System.out.println("discount amount : " + discount);
            System.out.println("total price :" + ((tickets * price) - discount));
        }
        else if (age>=60 ) {
            System.out.println("get 20% discount");
            double discount = price * 0.20;
            System.out.println("discount amount : " + discount);
            System.out.println("total price :" + ((tickets * price) - discount));
        } else if (age >=13 && age <=59) {
            System.out.println("pay the normal price");
            System.out.println("total price :" + (tickets * price));
        } else if (tickets >= 5) {
            System.out.println("give an additional 100 group discount");
            System.out.println("total price :" + ((tickets * price) - 100));
        }
    } 
}        


