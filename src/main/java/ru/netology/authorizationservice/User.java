package ru.netology.authorizationservice;

public class User {
    private String name;
    private String password;

    public boolean equals(User user){
        if(this.name.equals(user.getName())&this.password.equals(user.getPassword())){
            return true;
        }else return false;
    }

    public User(String name, String password){
        this.name = name;
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
