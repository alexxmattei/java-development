package com.company.reflectionExamples;

public class TestClass1 {
    private String myString;

    public TestClass1() {
        myString = "This is myString initialized in the Constructor";
    }

    public void testMethod1() {
        System.out.println("The string says: " + myString);
    }

    public void testMethod2(int number) {
        System.out.println("The number is: " + number);
    }

    public void testMethod3() {
        System.out.println("Private method invoked");
    }
}
