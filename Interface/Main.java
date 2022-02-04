package com.company;

public class Main {
    interface Printable {
        void print();
    }

    interface Showable {
        void print();
    }
    static class TestInterface3 implements Printable, Showable {
        public void print() {
            System.out.println("Hello");
        }
        }
    public static void main(String args[]) {
        TestInterface3 obj = new TestInterface3();
        obj.print();
    }
}