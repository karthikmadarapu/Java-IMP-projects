package week1;


import org.w3c.dom.ls.LSOutput;

public class WeekOnePractice {


    public static void main(String[]args){

        WeekOnePractice myobj = new WeekOnePractice();

        myobj.sayhello();
        myobj.sayGoodBye("sisi");

        multiply(9, 10);

        myobj.divide(10, 5);
    }
    String my_name = "alou";



    public void sayhello(){
        System.out.println("hello to an object!!");
    }

    public static void sayGoodBye(String name){

        System.out.println("Good bye " + name);
    }


    public static int multiply(int a, int b){
        System.out.println("Multiplying " + a + " and " + b);
        int finalres = a * b;
        System.out.println("Multiplying..... Result = " + finalres);
        return a*b;
    }

    public int divide(int a, int b){
        System.out.println("Dividing " + a + " and " + b);
        int finalres = a / b;
        System.out.println("Dividing..... Result = " + finalres);
        return  a / b;
    }

}
