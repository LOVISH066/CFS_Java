package MethodDemo;

public class Methoddemo {
    public static void main(String[] args) {

        print(); // calling
        int s = food1();
        System.out.println(s);

        display("lovish", 21);

        //sum
        int num = sum(2,3);
        System.out.println(num);
    }

    // we can write this method as method with no return and no parameter
    public static void print(){
        System.out.println("Hello lovish");
    }

    // this methid we can write with return but no parameter
    public static int food1(){
        return 69;
    }

    //mwthod with no return but with paramter
    public static void display(String name, int age){ // here we writen parmater like string name
        System.out.println(name);
        System.out.println(age);
    }

    // this method with paramter as wel las return
    public static int sum(int a,int b){
        int sum = a + b;
        return sum;
    }






}
