package com.loose.coupling;

public class UserDatabaseProvider implements UserDataProvider{
    @Override
    public String getUserDetails(){
        //directly Access database here
        return "User details from database";
    }
}
