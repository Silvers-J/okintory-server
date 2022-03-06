
package com.okizone.okintory.user.repository;

import org.springframework.data.repository.CrudRepository;
import com.okizone.okintory.user.model.User;

public interface UserRepository extends CrudRepository<User, Integer> {

    User findByUid(Integer uid);
    
}
