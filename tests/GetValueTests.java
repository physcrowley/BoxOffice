package tests;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.Scanner;

import cli.AdminPage;
import cli.FrontPage;
import cli.ShoppingPage;

public class GetValueTests {

    public void testFrontPageWithStringInput() {
        // save System.in for reference and assign a new input stream from a String
        InputStream originalInput = System.in;
        String newInput = "1 2.5 o n Dave true false";
        System.setIn(new ByteArrayInputStream(newInput.getBytes()));

        String passed = "passed: ", failed = "failed: ";

        Scanner reader = new Scanner(System.in);
        FrontPage front = new FrontPage(reader);
        if (front.getValue("", Integer.class) == 1) {
            passed += "int, ";
        } else {
            failed += "int, ";
        }
        if (front.getValue("", Double.class) == 2.5) {
            passed += "double, ";
        } else {
            failed += "double, ";
        }
        if (front.getValue("", Character.class) == 'o') {
            passed += "char (o), ";
        } else {
            failed += "char(o), ";
        }
        if (front.getValue("", Character.class) == 'n') {
            passed += "char (n), ";
        } else {
            failed += "char(n), ";
        }
        if (front.getValue("", String.class).equals("Dave")) {
            passed += "String, ";
        } else {
            failed += "String, ";
        }
        if (front.getValue("", Boolean.class)) {
            passed += "boolean (true), ";
        } else {
            failed += "boolean (true), ";
        }
        if (!front.getValue("", Boolean.class)) {
            passed += "boolean (false), ";
        } else {
            failed += "boolean (false), ";
        }

        System.out.println(passed);
        System.out.println(failed);


        // restore System.in to its original
        System.setIn(originalInput);
    }

     public void testFrontPageWithConsoleInput() {
        String[] tests = "1 2.5 o n Dave true false".split(" ");
        String passed = "passed: ", failed = "failed: ";

        Scanner reader = new Scanner(System.console().reader());
        FrontPage front = new FrontPage(reader);
        
        if (front.getValue(tests[0], Integer.class) == Integer.parseInt(tests[0])) {
            passed += "int, ";
        } else {
            failed += "int, ";
        }
        if (front.getValue(tests[1], Double.class) == Double.parseDouble(tests[1])) {
            passed += "double, ";
        } else {
            failed += "double, ";
        }
        if (front.getValue(tests[2], Character.class) == tests[2].charAt(0)) {
            passed += "char (o), ";
        } else {
            failed += "char(o), ";
        }
        if (front.getValue(tests[3], Character.class) == tests[3].charAt(0)) {
            passed += "char (n), ";
        } else {
            failed += "char(n), ";
        }
        if (front.getValue(tests[4], String.class).equals(tests[4])) {
            passed += "String, ";
        } else {
            failed += "String, ";
        }
        if (front.getValue(tests[5], Boolean.class)) {
            passed += "boolean (true), ";
        } else {
            failed += "boolean (true), ";
        }
        if (!front.getValue(tests[6], Boolean.class)) {
            passed += "boolean (false), ";
        } else {
            failed += "boolean (false), ";
        }

        System.out.println(passed);
        System.out.println(failed);
    }

    public void testAdminPage() {
        // save System.in for reference and assign a new input stream from a String
        InputStream originalInput = System.in;
        String newInput = "1 2.5 o n Dave true false";
        System.setIn(new ByteArrayInputStream(newInput.getBytes()));

        String passed = "passed: ", failed = "failed: ";

        Scanner reader = new Scanner(System.in);
        AdminPage admin = new AdminPage(reader);
        if (admin.getValue("", Integer.class) == 1) {
            passed += "int, ";
        } else {
            failed += "int, ";
        }
        if (admin.getValue("", Double.class) == 2.5) {
            passed += "double, ";
        } else {
            failed += "double, ";
        }
        if (admin.getValue("", Character.class) == 'o') {
            passed += "char (o), ";
        } else {
            failed += "char(o), ";
        }
        if (admin.getValue("", Character.class) == 'n') {
            passed += "char (n), ";
        } else {
            failed += "char(n), ";
        }
        if (admin.getValue("", String.class).equals("Dave")) {
            passed += "String, ";
        } else {
            failed += "String, ";
        }
        if (admin.getValue("", Boolean.class)) {
            passed += "boolean (true), ";
        } else {
            failed += "boolean (true), ";
        }
        if (!admin.getValue("", Boolean.class)) {
            passed += "boolean (false), ";
        } else {
            failed += "boolean (false), ";
        }

        System.out.println(passed);
        System.out.println(failed);


        // restore System.in to its original
        System.setIn(originalInput);
    }

    public void testShoppingPage() {
        // save System.in for reference and assign a new input stream from a String
        InputStream originalInput = System.in;
        String newInput = "1 2.5 o n Dave true false";
        System.setIn(new ByteArrayInputStream(newInput.getBytes()));

        String passed = "passed: ", failed = "failed: ";

        Scanner reader = new Scanner(System.in);
        ShoppingPage shop = new ShoppingPage(reader);
        System.out.println("Type the value prompted:");
        if (shop.getValue("", Integer.class) == 1) {
            passed += "int, ";
        } else {
            failed += "int, ";
        }
        if (shop.getValue("", Double.class) == 2.5) {
            passed += "double, ";
        } else {
            failed += "double, ";
        }
        if (shop.getValue("", Character.class) == 'o') {
            passed += "char (o), ";
        } else {
            failed += "char(o), ";
        }
        if (shop.getValue("", Character.class) == 'n') {
            passed += "char (n), ";
        } else {
            failed += "char(n), ";
        }
        if (shop.getValue("", String.class).equals("Dave")) {
            passed += "String, ";
        } else {
            failed += "String, ";
        }
        if (shop.getValue("", Boolean.class)) {
            passed += "boolean (true), ";
        } else {
            failed += "boolean (true), ";
        }
        if (!shop.getValue("", Boolean.class)) {
            passed += "boolean (false), ";
        } else {
            failed += "boolean (false), ";
        }

        System.out.println(passed);
        System.out.println(failed);


        // restore System.in to its original
        System.setIn(originalInput);
    }

    public static void main(String[] args) {
        GetValueTests tests = new GetValueTests();
        System.out.println("Running tests on FrontPage with String Input...");
        tests.testFrontPageWithStringInput();
        System.out.println("Running tests on FrontPage with Console Input...");
        tests.testFrontPageWithConsoleInput();
        // System.out.println("Running tests on AdminPage...");
        // tests.testAdminPage();
        // System.out.println("Running tests on ShoppingPage...");
        // tests.testShoppingPage();
    }
    
}
