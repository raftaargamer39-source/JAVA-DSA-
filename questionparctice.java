public class questionparctice {
    int numa;
    int numb;
    int numc;

    void allnumbers(){
        System.out.println("num a:" + numa);
        System.out.println("num b:" + numb);
        System.out.println("num c:" + numc);

    }
    void largest(){
        if (numa>numb && numa>numc){
            System.out.println("a is larger");
        }
        else if (numb>numa && numb>numc){
            System.out.println("b is larger");

        }
        else{
            System.out.println("c is larger");
        }
    }

    public static void  main(String[]args){
        questionparctice pm= new questionparctice();

        pm.numa=5;
        pm.numb=6;
        pm.numc=7;

        
        pm.allnumbers();
        pm.largest();

    }
    
}
