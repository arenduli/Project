package org.example.controller.annotations;

import org.springframework.core.annotation.AliasFor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import java.lang.annotation.*;

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented

@CrossOrigin(origins = "${crossOrigins}")
@org.springframework.web.bind.annotation.RestController
@RequestMapping("${appRoot}")
public @interface RestController {

    @AliasFor(annotation = Controller.class)
    String value() default "";
}