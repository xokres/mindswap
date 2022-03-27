package academy.mindswap;

import academy.mindswap.controllers.LoginController;
import academy.mindswap.controllers.MainController;
import academy.mindswap.controllers.UserController;
import academy.mindswap.views.LoginView;
import academy.mindswap.views.MainView;
import academy.mindswap.views.UserView;
import academy.mindswap.views.View;

public class Main {

    public static void main(String[] args) {
        LoginController loginController = new LoginController();
        LoginView loginView = new LoginView();
        MainView mainView = new MainView();
        MainController mainController = new MainController();

        UserController userController = new UserController();

        loginController.setView(loginView);
        loginView.setController(loginController);
        loginController.setNextController(mainController);
        loginController.setUserRepository(userController);
        mainController.setView(mainView);


        UserView userView = new UserView();
        userController.setView(userView);
        userView.setController(userController);

        userController.setNextController(mainController);
        mainController.setUserController(userController);
        mainView.setController(mainController);;

        userController.populate();
        loginController.init();
    }
}
