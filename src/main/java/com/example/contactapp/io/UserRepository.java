package com.example.contactapp.io;


import com.example.contactapp.io.entity.UserEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository  //spring managed repository, telling spring to create bean of this repository so to use later in the application.
public interface UserRepository extends CrudRepository<UserEntity, Long> { //it has inherited the CRUD methods for the userEntity
    UserEntity findByEmail(String email); //Custom quiery methods

    UserEntity findByUserId(String id); //we donot need to make SQL quiry in our database as we can find our user by email and id
}