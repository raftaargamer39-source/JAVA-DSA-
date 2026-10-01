public class parameter {
    static int sum (int a , int b){
        return  a +b;

    }
    static int sum (int a){
        return a;
    }
    static double sum(double a , int b){
        return a + b ;
    }
    static void main (String[] args){
         int s = sum(3,4 );
         System.out.println(s);

    //    sum(0);
    //    System.out.println(sum(5,7   ));

    double k = sum (5,4);
    System.out.println(k);

    int a = sum( s);
    System.out.println(a);
        
    

    


    }

    
}
