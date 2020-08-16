package com.sliit;

public class LoginMain {

    public static void main(String[] args) {

        // validate from first object
        Login login1 = Login.getInstance();
        System.out.println("first validation result: " + login1.validateUser("Udara", "Udara"));
        System.out.println("first validation wrong credentials result: " + login1.validateUser("Udara1", "Udara1"));

        // validate from second object
        Login login2 = Login.getInstance();
        System.out.println("second validation result: " + login2.validateUser("Udara", "Udara"));
        System.out.println("second validation wrong credentials result: " + login1.validateUser("Udara2", "Udara2"));
    }
}
