package com.groovy.groovy;

import groovy.lang.GroovyClassLoader;
import groovy.lang.GroovyObject;
import org.springframework.http.converter.json.GsonBuilderUtils;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;

public class CongigureToGroovy
{




    public static void main(String[] args) throws IOException, IllegalAccessException, InstantiationException, NoSuchMethodException, InvocationTargetException {


        Class scriptClass =  new GroovyClassLoader().parseClass(new File("/home/ankit/Downloads/groovy/GroovyDemo/jp.groovy"));

        GroovyObject calc = (GroovyObject) scriptClass.newInstance();

       Integer a =(Integer) calc.invokeMethod("b", new Object[] { 12, 13 });
        System.out.println(a);
        Integer b =(Integer) calc.invokeMethod("mul", new Object[] { 12, 13 });
        System.out.println(b);
        String c = (String) calc.invokeMethod("addString", new Object[] { "Ankit", "Patel" });
        System.out.println(c);



    }









}
