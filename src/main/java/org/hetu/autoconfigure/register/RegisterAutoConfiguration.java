package org.hetu.autoconfigure.register;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author hetu
 */
@ComponentScan(value = {
        "org.hetu.register.api"
})
@Configuration
public class RegisterAutoConfiguration {


}
