package org.hetu.autoconfigure.register;

import org.springframework.context.annotation.Import;

import java.lang.annotation.*;

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Import(RegisterAutoConfiguration.class)
public @interface EnableHetuRegister {

}
