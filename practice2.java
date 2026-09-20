import java.util.Scanner;
public class practice2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the marks");
        int marks = sc.nextInt();
        if (marks >=90 && marks <=100) {
            System.out.println("A+ grade");
            System.out.println("excellent standing");
            System.out.println("cgpa is 4.0");
            System.out.println("Excellent performances to progress in studies");
        } else if (marks >=80 && marks <=89) {
            System.out.println("A grade");
            System.out.println("excellent standing");
            System.out.println("cgpa is 4.0");
            System.out.println("Excellent performances to progress in studies");
        } else if (marks >=75 && marks <=79) {
            System.out.println("A- grade");
            System.out.println("excellent standing");
            System.out.println("cgpa is 3.75 to 3.95");
            System.out.println("Excellent performances to progress in studies");
        } else if (marks >=70 && marks <=74) {
            System.out.println("B+ grade");
            System.out.println("good standing");
            System.out.println("cgpa is 3.50 to 3.70");
            System.out.println("Good to average performances able to progress in studies");
        } else if (marks >=65 && marks <=69) {
            System.out.println("B grade");
            System.out.println("good standing");
            System.out.println("cgpa is 3.00 to 3.45");
            System.out.println("Good to average performances able to progress in studies");
        } else if (marks >=60 && marks <=64) {
            System.out.println("B- grade");
            System.out.println("good standing");
            System.out.println("cgpa is 2.75 to 2.95");
            System.out.println("Good to average performances able to progress in studies");
        } else if (marks >=55 && marks <59) {
            System.out.println("C+ grade");
            System.out.println("good standing");
            System.out.println("cgpa is 2.50 to 2.70");
            System.out.println("Good to average performances able to progress in studies");
        } else if (marks >=50 && marks <=54) {
            System.out.println("C grade");
            System.out.println("good standing");
            System.out.println("cgpa is 2.00 to 2.45");
            System.out.println("Good to average performances able to progress in studies");
        } else if (marks >=47 && marks  <=49) {
            System.out.println("C- grade");
            System.out.println("conditional standing");
            System.out.println("cgpa is 1.75 to 1.95");
            System.out.println("Repeat the course to improve cgpa");
        } else if (marks >=44 && marks <=46) {
            System.out.println("D+ grade");
            System.out.println("conditional standing");
            System.out.println("cgpa is 1.70");
            System.out.println("Repeat the course to improve cgpa");
        } else if (marks >=40 && marks <=43) {
            System.out.println("D grade");
            System.out.println("fail");
            System.out.println("cgpa is 1.00 to 1.65");
            System.out.println("terminated from studies");
        } else if (marks >=30 && marks <=39) {
            System.out.println("E grade");
            System.out.println("fail");
            System.out.println("cgpa is 0.75 to 0.95");
            System.out.println("terminated from studies");
        } else if (marks >=0 && marks <=29) {
            System.out.println("F grade");
            System.out.println("fail");
            System.out.println("cgpa is 0.00 to 0.70");
            System.out.println("terminated from studies");
        } 
        System.out.println("this is your result");

       }

    }
    


        