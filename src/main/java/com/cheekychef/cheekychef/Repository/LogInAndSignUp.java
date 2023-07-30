package com.cheekychef.cheekychef.Repository;

import com.cheekychef.cheekychef.Model.LogIn;
import org.springframework.data.mongodb.repository.MongoRepository;

//MongoRepo provide all basic function
public interface LogInAndSignUp extends MongoRepository<LogIn, String> { //working with LogIn entity and String id
}
