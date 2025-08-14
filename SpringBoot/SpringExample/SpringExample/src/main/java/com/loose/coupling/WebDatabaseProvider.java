package com.loose.coupling;

public class WebDatabaseProvider implements UserDataProvider{
    @Override
    public String getUserDetails() {
        return "New Database in action";
    }
}
