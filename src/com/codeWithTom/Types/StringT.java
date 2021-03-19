package com.codeWithTom.Types;

import java.util.Locale;

public class StringT {
    public static void main(String[] args) {
        String name = "Ton";
        System.out.println("Hello " + name);

        // Method Of String
        System.out.println(name.toLowerCase(Locale.ROOT));
        System.out.println(name.toUpperCase(Locale.ROOT));
        System.out.println(name.charAt(0));
        System.out.println(name.compareTo("Hanh"));
        System.out.println(name.concat(" Nguyen"));
        System.out.println(name.contains("T"));
        System.out.println(name.equals("Ton"));
        System.out.println(name.matches("^\\D+$"));
        System.out.println(name.replace("Ton", "Tom"));
        name = name + " " + "!!";
        System.out.println(name.replaceAll("!", "*"));
    }
}
