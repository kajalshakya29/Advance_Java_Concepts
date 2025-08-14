package com.loose.coupling;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
//import com.tight.coupling.UserManager;

//import java.nio.file.attribute.UserDefinedFileAttributeView;

public class IOCExample {
    public static void main(String[] args) {

        ApplicationContext context =
                new ClassPathXmlApplicationContext("inversionOfControlChallenge.xml");
        //  UserManager userManager=new UserManager();
        //  System.out.println(userManager.getUserInfo());

        //UserDataProvider databaseProvider = new UserDatabaseProvider();
        //UserManager userManagerWithDB = new UserManager(databaseProvider);
        UserManager userManagerWithDB = (UserManager)context.getBean("userManagerWithUserDataProvider");
        System.out.println(userManagerWithDB.getUserInfo());

        //UserDataProvider webServiceProvider = new WebServiceDataProvider();
        UserManager userManagerWithWS = (UserManager)context.getBean("userManagerWithWebDatabaseProvider");
        System.out.println(userManagerWithWS.getUserInfo());

        //UserDataProvider webDatabaseProvider = new WebDatabaseProvider();
        UserManager userManagerWithWebDB =  (UserManager)context.getBean("userManagerWithWebServiceDataprovider");
        System.out.println(userManagerWithWebDB.getUserInfo());

        //IOC CHALLANGE
    }
}
