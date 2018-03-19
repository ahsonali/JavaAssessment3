package user_management;

import user_management.security.Password;

public class User {

    private Object password;
    private int id;
    private String name;
    private String email;

    public User(int i, String wilhem, String s, Password password)
    {

    }


    @Override
    public String toString() {
        return null;
    }

    @Override
    public boolean equals(Object obj) {
        return false;
    }

    public Object getPassword() {
        return password;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public void setPassword(Password password) {
        this.password = password;
    }
}
