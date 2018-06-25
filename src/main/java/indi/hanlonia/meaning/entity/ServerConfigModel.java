package indi.hanlonia.meaning.entity;

/**
 * @Author by Hanlonia
 * @Email han.meaningful@gmail.com
 * @Date on 2018/6/9
 */

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "server")
public class ServerConfigModel {
    private String port;
    private String servlet;

    public String getPort() {
        return port;
    }

    public void setPort(String port) {
        this.port = port;
    }


    public String getServlet() {
        return servlet;
    }

    public void setServlet(String servlet) {
        this.servlet = servlet;
    }
}
