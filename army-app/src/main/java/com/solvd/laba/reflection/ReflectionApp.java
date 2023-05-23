package com.solvd.laba.reflection;

import com.solvd.laba.classes.Person;
import com.solvd.laba.classes.Soldier;
import com.solvd.laba.classes.enums.Weapon;

import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.stream.Collectors;

public class ReflectionApp {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException, InstantiationException {
        Class<?> myClass;
        try {
            myClass = Class.forName("com.solvd.laba.classes.Soldier");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

        System.out.println(Arrays.stream(myClass.getDeclaredMethods()).map(element -> element.getName()).collect(Collectors.toList()));
        System.out.println(myClass.getClassLoader());
        System.out.println(myClass.isInterface());
        System.out.println(myClass.isEnum());
        System.out.println(myClass.getMethod("shoot", Weapon.class, Person.class).getDeclaringClass());
        System.out.println(Arrays.toString(myClass.getMethod("shoot", Weapon.class, Person.class).getParameters()));


        Soldier a = new Soldier();
        System.out.println(a.getWeapon());
        myClass.getDeclaredMethod("setWeapon", Weapon.class).invoke(a, Weapon.Revolver);
        System.out.println(a.getWeapon());

        Soldier b = (Soldier) myClass.getConstructor(String.class).newInstance("Country 1");
        System.out.println(b);
    }
}
