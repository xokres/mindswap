package academy.mindswap.views;

import academy.mindswap.controllers.UserController;
import academy.mindswap.utils.Messages;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class UserView implements View{

    private UserController controller;

    @Override
    public void show() {
        System.out.println("\n" + Messages.WELCOME);
        System.out.println("\n" + Messages.CREDENTIALS);
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        askUserInput(reader);

    }

    private void askUserInput(BufferedReader reader) {
        String username = null;
        String password = null;
        String email = null;

        try {
            System.out.print(Messages.USERNAME);
            username = reader.readLine();
            System.out.print(Messages.PASSWORD);
            password = reader.readLine();
            System.out.print(Messages.EMAIL);
            email = reader.readLine();

        } catch (IOException e) {
            e.printStackTrace();
        }

        if (!controller.createUser(username, password, email)) {
            System.out.println("\nCan't create user\n");
            askUserInput(reader);
        }
    }

    public void setController(UserController controller) {
        this.controller = controller;
    }
}
