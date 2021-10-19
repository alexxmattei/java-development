package com.company;

import com.company.reflectionExamples.TestClass1;
import com.company.reflectionExamples.TestClass2;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Main {

    public static void main(String[] args) throws NoSuchFieldException, InvocationTargetException, IllegalAccessException, NoSuchMethodException {

        // TestClass1
        TestClass1 myTestObj = new TestClass1();
        Class myClassObj = myTestObj.getClass();
        System.out.println("The class name is: " + myClassObj.getName());
        System.out.println("The constructor name for " + myClassObj.getName() + " is " + myClassObj.getConstructor());
        System.out.println("The public methods of the previous class are: ");

        Method[] myClassObjMethods = myClassObj.getMethods();

        for (Method method : myClassObjMethods) {
            System.out.println(method.getName());
        }

        Method methodCall = myClassObj.getDeclaredMethod("testMethod2", int.class);
        methodCall.invoke(myTestObj, 20);

        Field myObjectField = myClassObj.getDeclaredField("myString");
        myObjectField.setAccessible(true);

        myObjectField.set(myTestObj, "JAVA");

        Method methodCall2 = myClassObj.getDeclaredMethod("testMethod1");
        methodCall2.invoke(myTestObj);

        Method methodCall3 = myClassObj.getDeclaredMethod("testMethod3");
        methodCall3.setAccessible(true);
        methodCall3.invoke(myTestObj);

        // TestClass2
        TestClass2 myObject2 = new TestClass2("This is a private value");
        Field privateStringField = TestClass2.class.getDeclaredField("privateString");

        privateStringField.setAccessible(true);

        // accessing the private field within the object of TestClass2
        String fieldValue = (String) privateStringField.get(myObject2);
        System.out.println("fieldValue = " + fieldValue);

        // accessing the private method within the object of TestClass2
        Method privateStringMethod = TestClass2.class.getDeclaredMethod("getPrivateString", null);
        privateStringMethod.setAccessible(true);

        String returnValue = (String) privateStringMethod.invoke(myObject2, null);

        System.out.println("return value = " + returnValue);
    }
}
