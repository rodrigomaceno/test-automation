package com.solvd.laba.reflection;

import com.solvd.laba.classes.Person;
import com.solvd.laba.classes.Soldier;
import com.solvd.laba.classes.enums.Weapon;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.stream.Collectors;

public class ReflectionApp {
    private static final Logger logger = LogManager.getLogger();

    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException, InstantiationException {
        Class<?> myClass;
        try {
            myClass = Class.forName("com.solvd.laba.classes.Soldier");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

        logger.info(Arrays.stream(myClass.getDeclaredMethods()).map(element -> element.getName()).collect(Collectors.toList()));
        logger.info(myClass.getClassLoader());
        logger.info(myClass.isInterface());
        logger.info(myClass.isEnum());
        logger.info(myClass.getMethod("shoot", Weapon.class, Person.class).getDeclaringClass());
        logger.info(Arrays.toString(myClass.getMethod("shoot", Weapon.class, Person.class).getParameters()));


        Soldier a = new Soldier();
        logger.info(a.getWeapon());
        myClass.getDeclaredMethod("setWeapon", Weapon.class).invoke(a, Weapon.Revolver);
        logger.info(a.getWeapon());

        Soldier b = (Soldier) myClass.getConstructor(String.class).newInstance("Country 1");
        logger.info(b);
    }
}
