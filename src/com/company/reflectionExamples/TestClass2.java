package com.company.reflectionExamples;

public class TestClass2 {
    private String privateString = null;

    public TestClass2(String privateString) {
        this.privateString = privateString;
    }

    private String getPrivateString() {
        return this.privateString;
    }
}
