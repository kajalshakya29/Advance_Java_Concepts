package com.loose.coupling;

public class UserManager {
    public UserManager(UserDataProvider userDataProvider) {
        this.userDataProvider = userDataProvider;
    }

    //UserDatabaseProvider userDatabase = new UserDatabaseProvider();
    private UserDataProvider userDataProvider;

    public String getUserInfo(){
        return userDataProvider.getUserDetails();
    }
}
