package academy.mindswap.controllers;

import academy.mindswap.views.View;

public class MainController implements Controller {

    private View mainView;
    private UserController userController;

    @Override
    public void init() {
        mainView.show();
    }

    public void setView(View mainView) {
        this.mainView = mainView;
    }

    public void goTo(String where) {
        if (where.equals("addUser")) {
            userController.init();
        }
    }

    public void setUserController(UserController userController) {
        this.userController = userController;
    }
}
