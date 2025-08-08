package com.applicationgroup.journalApp.repository;
import com.applicationgroup.journalApp.entity.JournalEntry;
import com.applicationgroup.journalApp.entity.User;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;


public interface UserRepository extends MongoRepository<User, ObjectId>{
    User findByUserName(String username);

}
