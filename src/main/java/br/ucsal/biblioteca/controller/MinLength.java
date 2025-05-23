package br.ucsal.biblioteca.controller;

import java.lang.annotation.*;


@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
@Inherited
public @interface MinLength {
    int value() default 3;
}
