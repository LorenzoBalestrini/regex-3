package it.develhope.regex3;

public class Main {
    public static void main(String[] args) {

        String are = "are you able to climb, are you able to swim or are you able to fly?";
        System.out.println(are.replaceAll("\s+are","_xyz"));
    }
}
