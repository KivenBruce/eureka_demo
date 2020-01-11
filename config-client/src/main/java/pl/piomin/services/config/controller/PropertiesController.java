package pl.piomin.services.config.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.piomin.services.config.properties.UserInfo;

/**
 * @author kiven
 * @date 2020-01-11 22:08
 * @describe
 */
@RestController
@RequestMapping("/userinfo")
public class PropertiesController {
    @Autowired
    private UserInfo userInfo;

    @GetMapping("/get")
    public Object get() {
        return userInfo;
    }
}
