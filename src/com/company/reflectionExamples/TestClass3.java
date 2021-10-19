package com.company.reflectionExamples;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@TestClass3.MyAnnotation(name="TestClass3Name", value = "Hello World")
public class TestClass3 {
    private String privateField = null;
    protected String protectedField = null;
    public String publicField = null;

    TestClass3() {
        this.privateField = "private";
        this.protectedField = "protected";
        this.publicField = "public";
    }

    TestClass3(String privateField) { this.privateField = privateField; }
    TestClass3(String privateField, String protectedField) { this.privateField = privateField; this.protectedField = protectedField; }
    TestClass3(String privateField, String protectedField, String publicField) { this.privateField = privateField; this.protectedField = protectedField; this.publicField = publicField; }

    @Retention(RetentionPolicy.RUNTIME)
    @Target(ElementType.TYPE)
    public @interface MyAnnotation {
        public String name();
        public String value();
    }
}
