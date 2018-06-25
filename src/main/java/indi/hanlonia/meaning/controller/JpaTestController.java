package indi.hanlonia.meaning.controller;

import indi.hanlonia.meaning.dao.UserDao;
import indi.hanlonia.meaning.entity.dbentity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Author by Hanlonia
 * @Email han.meaningful@gmail.com
 * @Date on 2018/6/9
 */

@RestController
public class JpaTestController {
    @Autowired
    private UserDao userDao;

    @GetMapping(value= "/user")
    public List<User> getUser(){
        Sort sort = new Sort(Sort.Direction.ASC, "id");
        int pageNoNum = 0;
        int pageSizeNum = 10;
        Pageable pageable = new PageRequest(pageNoNum, pageSizeNum, sort);
        Page<User> userPage = userDao.findAll(pageable);
        return userPage.getContent();
    }

    @PostMapping(value = "/user")
    public User addUser(@RequestParam("name") String name,
                        @RequestParam("age") Integer age,
                        @RequestParam("description") String description){
        User user = new User();
        user.setAge(age);
        user.setDescription(description);
        user.setName(name);
        User newUser = userDao.save(user);
        return newUser;
    }

}
