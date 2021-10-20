package com.example.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
// annotation will be available at runtime

@Retention(RetentionPolicy.RUNTIME)
// use this annotation for types, fields, methods
@Target({ElementType.TYPE, ElementType.FIELD, ElementType.METHOD})
@interface MyAnnotation {
	int value();
}
