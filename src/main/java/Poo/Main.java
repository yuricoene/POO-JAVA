package Poo;
public class Main {
    public static void main(String[] args){
        Integer a = 127, b = 127;
        System.out.println(a == b);
        Integer c = 200, d = 200;
        System.out.println(c == d);
        System.out.println(c.equals(d));
    }
}

