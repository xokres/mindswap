package academy.mindswap.controllers;

import academy.mindswap.models.User;
import academy.mindswap.views.View;

import java.util.LinkedList;
import java.util.Optional;

public class LoginController implements Controller {

    private View view;
    private Controller nextController;
    private UserController userRepository;

    public LoginController() {
    }

    @Override
    public void init() {
        view.show();
        nextController.init();
    }


    public boolean doAuthentication(String username, String password) {
        return userRepository
                .getUserByUsernameAndPassword(username, password)
                .isPresent();
    }

    public void setView(View view) {
        this.view = view;
    }

    public void setNextController(Controller nextController) {
        this.nextController = nextController;
    }

    public void setUserRepository(UserController userRepository) {
        this.userRepository = userRepository;
    }
}
