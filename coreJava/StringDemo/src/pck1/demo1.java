package pck1; // package imported then class

import pck2.demo2; // here we have imported class

public class demo1 {
    public static void main(String[] args) {
        demo2 hyd = new demo2();
        hyd.food();
    }
}
