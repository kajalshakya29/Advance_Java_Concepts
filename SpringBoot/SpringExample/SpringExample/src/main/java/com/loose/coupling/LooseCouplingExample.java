package com.loose.coupling;

import com.tight.coupling.UserDatabase;
//import com.tight.coupling.UserManager;

//import java.nio.file.attribute.UserDefinedFileAttributeView;

public class LooseCouplingExample {
    public static void main(String[] args){
      //  UserManager userManager=new UserManager();
      //  System.out.println(userManager.getUserInfo());
        UserDataProvider databaseProvider = new UserDatabaseProvider();
        UserManager userManagerWithDB = new UserManager(databaseProvider);
        System.out.println(userManagerWithDB.getUserInfo());

        UserDataProvider webServiceProvider = new WebServiceDataProvider();
        UserManager userManagerWithWS = new UserManager(webServiceProvider);
        System.out.println(userManagerWithWS.getUserInfo());

        UserDataProvider webDatabaseProvider = new WebDatabaseProvider();
        UserManager userManagerWithWebDB = new UserManager(webDatabaseProvider);
        System.out.println(userManagerWithWebDB.getUserInfo());
    }
}
