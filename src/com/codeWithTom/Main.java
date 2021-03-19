package com.codeWithTom;

import com.codeWithTom.OOP.Student;
import com.codeWithTom.Types.EnumT;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println(EnumT.BLUE);
        Student st = new Student("Ton", false,"123","123");
        st.sayHello();
        st.choseJob("DEV");
    }
}
