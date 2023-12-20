package tests;

import tickets.Show;

public class ShowsToStringTest {

    public void testShowToString(){
        String passed = "passed: ", failed = "failed: ";
        Show show = Show.createShow("Les cuillères du ciel", 150);
        System.out.println(show.toString());
        if (show.toString().equals("Les cuillères du ciel (0/150)")){
            passed += "Show.toString(), ";
        } else {
            failed += "Show.toString(), ";
        }
        System.out.println(passed);
        System.out.println(failed);
    }

    public void testShowListToString(){
        Show.createShow("Les cuillères du ciel", 150);
        Show.createShow("Les fourchettes de l'enfer", 150);
        for (Show s : Show.getShows()) {
            System.out.println(s);
        }
    }

    public static void main(String[] args) {
        ShowsToStringTest tests = new ShowsToStringTest();
        System.out.println("Running tests on Show.toString()...");
        tests.testShowToString();
        System.out.println("Running tests on Show.list.toString()...");
        tests.testShowListToString();
    }
    
}
