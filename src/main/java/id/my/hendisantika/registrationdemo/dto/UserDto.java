package id.my.hendisantika.registrationdemo.dto;

import lombok.Getter;
import lombok.Setter;

/**
 * Created by IntelliJ IDEA.
 * Project : spring-boot-registration-demo
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 6/25/24
 * Time: 07:10
 * To change this template use File | Settings | File Templates.
 */
@Getter
@Setter
public class UserDto {
    private String username;
    private String password;
    private String fullname;
}
