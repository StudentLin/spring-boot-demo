package indi.hanlonia.meaning.controller;

import indi.hanlonia.meaning.entity.ServerConfigModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author by Hanlonia
 * @Email han.meaningful@gmail.com
 * @Date on 2018/6/3
 */

@RestController
public class HelloTestController {

    @Value("${server.port}")
    private String port;

    @Autowired
    private ServerConfigModel serverConfigModel;

    @RequestMapping(value={"/demo1", "hello"}, method = RequestMethod.GET)
    public String demo1(){
        return "hello";
    }

    @RequestMapping(value="/demo2", method = RequestMethod.GET)
    public String demo2(){
        return port;
    }

    @RequestMapping(value="/demo3", method = RequestMethod.GET)
    public String demo3(){
        return serverConfigModel.getPort() + ":" + serverConfigModel.getServlet();
    }

    @RequestMapping(value="/demo4/{id}", method = RequestMethod.GET)
    public String demo4(@PathVariable("id") Integer id){
        return "id=" + id;
    }
}
