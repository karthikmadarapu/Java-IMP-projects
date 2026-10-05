package week1;


import org.w3c.dom.ls.LSOutput;

public class WeekOnePractice {


    public static void main(String[]args){

        WeekOnePractice myobj = new WeekOnePractice();

        myobj.sayhello();
        myobj.sayGoodBye("sisi");

        multiply(9, 10);

        myobj.divide(10, 5);

        System.out.println(celsiusToFahrenheit(25.0));
        System.out.println(fahrenheitToCelsius(100.0));



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


    // celcius to fahrenheit and fahrenheit to celcius


    public static double celsiusToFahrenheit(double celsius){

        return (celsius * 9.0/5.0 ) + 32.0;
    }

    public static double fahrenheitToCelsius(double fahrenheit){
        return (fahrenheit  - 32.0) *5.0/9.0;

    }
}
