package indi.hanlonia.meaning.controller;

import indi.hanlonia.meaning.entity.ServerConfigModel;
import indi.hanlonia.meaning.utils.ZKUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

/**
 * @Author by Hanlonia
 * @Email han.meaningful@gmail.com
 * @Date on 2018/6/3
 */
@RestController
public class HelloTestController {

    public static final Logger logger = LoggerFactory.getLogger(HelloTestController.class);

    @Value("${server.port}")
    private String port;

    @Autowired
    private ServerConfigModel serverConfigModel;

    @RequestMapping(value={"/demo1", "hello"}, method = RequestMethod.GET)
    public String demo1(){
        logger.trace("I am trace log.");
        logger.debug("I am debug log.");
        logger.info("I am info log.");
        logger.warn("I am warn log.");
        logger.error("I am error log.{}", new Date());
        ZKUtils.logPrint();
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
