package academy.mindswap.models;

// POJO - Plain Old Java Object
public class User {

    private int id;
    private String username;
    private String email;
    private String password;

    public User(String username, int id, String email, String password) {
        this.username = username;
        this.id = id;
        this.email = email;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public int getId() {
        return id;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }
}
