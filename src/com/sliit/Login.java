package com.sliit;

public class Login {

    private Login() {
        System.out.println("instance created");
    }

    private static final class Instance {
        private static Login login = new Login();
    }

    public static Login getInstance() {
        return Instance.login;
    }

    public boolean validateUser(String username, String password) {

        if (username.equals("Udara") && password.equals("Udara")) {
            return true;
        }

        return false;
    }
}
