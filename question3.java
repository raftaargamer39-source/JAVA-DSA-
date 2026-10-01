// import java.util.Scanner;
public class question3 {
    static int sumdigits(int n){
        int sum = 0;

        while(n!=0){
            int digit = n% 10;
            sum = sum + digit;
            n = n/10;
        }
        return sum;
    }
    public static void main(String[] args){
        int n = 123;
        sumdigits(n);
        System.out.println(sumdigits(n));
    }

    // static int countdigits(int n){
    //    int  count=0;

    //    while(n!=0){
    //     n=n/10;
    //     count++;
    //    }
    //    return count;


    // }
    // public static void main (String[] args){
    //     int n =12345643;
    //     countdigits(n);
    //     System.out.println(countdigits(n));
    // }


    // static int cube(int n){
    //     return n*n*n;
    // }
    // public static void main(String[] args){
    //     int n = 3;
    //     cube(n);
    //     System.out.print(cube(n));
    // }

    // static int square(int n){
    //     return n*n;
    // }
    // public static void main(String[] args){
    //     int n = 4;
    //     square(n);
    //     System.out.println(square(n));
    // }
    



    // static void max(int a , int b, int c){
    //     if (a>b && a>c){
    //         System.out.println("a is larger");
    //     }else if (b>a && b>c){
    //         System.out.println("b is larger");
    //     }else{
    //         System.out.println("c is larger");
    //     }


    // }
    // public static void main(String[] args){
    //     int a = 15;
    //     int b = 10;
    //     int c = 12;
    //     max(a, b, c);
    // }


//    static  void max(int a , int b){
//         if(a>b){
//             System.out.println("a is larger");
//         }else{
//             System.out.println("b is larger");
//         }

//     }
//     public static void main(String[] args){
//         int a = 10;
//         int b = 20;
//         max(a,b);
//     }


    // static void even(int n){
    //     if(n%2==0){
    //         System.out.println("it is even number");
    //     }else{
    //         System.out.println("it is odd number");
    //     }
       
    // }
    // public static void main(String[]args){
    //     int n=21;
    //     even(n);
    // }



    // static void positive(int n){
    //     if(n>=0){
    //         System.out.println("it is positive");
    //     }else{
    //         System.out.println("negative");
    //     }
    // }
    // public static void main(String[] args){
    //     int n = -5;
    //     positive(n);
    // }
}

    // static int  add(int a , int b){
    //     return a+b;
   
    // }
    // public static void main (String[] args){
    //     int a = 10;
    //     int b = 14;
    //     add(a, b);

    //     System.out.println(add(a,b));
        
       

    // }

//     static int calculateexpenses(int rent, int food, int travel, int recharge,int entertainment){
//         return rent + food + travel + recharge + entertainment;
//     }
//     static int calculatesavings( int income , int expense){
//         return income - expense;

//     }
//     static boolean checkbudget(int savings){
//     return savings >= 0;
    
//     }
//     static void printbudget(int income,int expense, int savings){
//         System.out.println("income:"+ income);
//         System.out.println("expense"+ expense);
//         System.out.println("savings" + savings);
//     }
// public static void main(String[] args) {

//     Scanner sc = new Scanner(System.in);

//     System.out.println("enter the rent :");
//     int rent = sc.nextInt();

//     System.out.println("enter the food");
//     int food = sc.nextInt();

//     System.out.println(" enter the travel");
//     int travel = sc.nextInt();

//     System.out.println("enter the recharge");
//     int recharge = sc.nextInt();

//     System.out.println("enter the entertainment");
//     int entertainment= sc.nextInt();

//     System.out.println("enetr a income");
//     int income =sc.nextInt();





//     // int rent = 2000;
//     // int food = 1000;
//     // int travel = 500;
//     // int recharge = 300;
//     // int entertainment = 1500;

//     // int income = 10000;

//     int expense = calculateexpenses(rent, food, travel, recharge, entertainment);
//     int saving = calculatesavings(income,expense);

//     printbudget(income, expense, saving);
    
// }
// }


// //     static int calculatecompatibility(int patience,int replytime,int budget, int arguments){
// //        int score = 50;

// //         if(patience>=7){
// //             score+=10;
// //         }
// //         if(replytime>=4){
// //             score+=10;

// //         }
// //         if(budget>=550){
// //             score+=10;
// //         }
// //         if(arguments<=2){
// //             score+=10;
// //         }else{
// //             score-=10;
// //         }
// //         return score;

     

// //     }
// //      static String relationshipstatus(int score){
// //         if(score>=78){
// //             return "relationship material";
// //         }
// //         if(score>=60){
// //             return " average material";
// //         }
// //         if(score>=40){
// //             return "breakup";
// //         }else{
// //             return " no talks";
// //         }
// //      }
// //      static void printrelationnshipresult(int score,String status){
// //         System.out.println("compatibilityscore:"+ score + "-"+ status );
// //      }
// //      public static void main(String[] args){
// //         int patience = 3;
// //         int replytimme=  4;
// //         int budget = 100;
// //         int arguments=7;
// //         int score= calculatecompatibility(patience, replytimme, budget, arguments);
// //         String status= relationshipstatus(score);

// //         printrelationnshipresult(score, status);

// //      }
// // }




// // //     static double calculateAttendance(int attended, int total) {
// // //         return (attended * 100.0) / total;
// // //     }

// // //     static double calculateAverage(int m1, int m2, int m3) {
// // //         return (m1 + m2 + m3) / 3.0;
// // //     }

// // //     static boolean checkEligibility(double attendance, double average) {
// // //         return attendance >= 75 && average >= 40;
// // //     }

// // //     static void printAcademicResult(double attendance, double average,  boolean eligible) {

// // //         System.out.println("Attendance: " + attendance + "%");
// //         System.out.println("Average Marks: " + average);
// //         System.out.println("Eligible: " + eligible);
// //     }

// //     public static void main(String[] args) {
       

// //         int attended = 80;
// //         int total = 100;

// //         int m1 = 50;
// //         int m2 = 40;
// //         int m3 = 60;

// //         double attendance = calculateAttendance(attended, total);
// //         double average = calculateAverage(m1, m2, m3);

// //         boolean eligible = checkEligibility(attendance, average);

// //         printAcademicResult( attendance, average,eligible);
// //     }
// // }



    
    
    


