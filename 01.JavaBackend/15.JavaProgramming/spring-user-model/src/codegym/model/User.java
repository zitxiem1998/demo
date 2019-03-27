package codegym.model;

public class User {
    private String user;
    private String password;
    private String name;
    private String email;
    private int age;

    public User(String user, String password, String name, String email, int age) {
        this.user = user;
        this.password = password;
        this.name = name;
        this.email = email;
        this.age = age;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
