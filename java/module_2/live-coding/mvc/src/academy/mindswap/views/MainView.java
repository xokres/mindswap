package academy.mindswap.views;

import academy.mindswap.controllers.MainController;
import academy.mindswap.utils.Messages;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MainView implements View {

    MainController controller;

    @Override
    public void show() {
        System.out.println("WELCOME TO OUR APP");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        scanAnswer(reader);
    }

    private void scanAnswer(BufferedReader reader) {
        int option = 0;

        try {
            System.out.println("\nChoose one of the following options:");
            System.out.println("\n 1: add user");
            option = Integer.parseInt(reader.readLine());

        } catch (IOException e) {
            e.printStackTrace();
        }

        if ((option == 1)) {
           controller.goTo("addUser");
        }
        scanAnswer(reader);
    }

    public void setController(MainController controller) {
        this.controller = controller;
    }
}
