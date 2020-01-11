package pl.piomin.services.config.properties;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @author kiven
 * @date 2020-01-11 22:04
 * @describe
 */
@Data
@Component
@ConfigurationProperties(prefix = "userinfo")
public class UserInfo {
    private String username;
    private String password;
}
