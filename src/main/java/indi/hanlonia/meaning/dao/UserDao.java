package indi.hanlonia.meaning.dao;

import indi.hanlonia.meaning.entity.dbentity.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @Author by Hanlonia
 * @Email han.meaningful@gmail.com
 * @Date on 2018/6/9
 */
public interface UserDao extends JpaRepository<User, Integer> {
    
}
