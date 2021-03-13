package main.java.reflection.logic;

import main.java.reflection.objects.Cat;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class AgeClass {

    public void setPetAge(Object pet, Integer age) throws NoSuchFieldException, IllegalAccessException {
        Class clazz = pet.getClass();
        Field f = clazz.getDeclaredField("age");
        f.setAccessible(true);
        f.set(pet, age);
    }

    public void invokeSoundMethod(Object obj, String sound) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException, InstantiationException {
        Class clazz = obj.getClass();
        Method method = clazz.getMethod("makeSound", String.class);
        method.setAccessible(true);
        method.invoke(obj, sound);

        Cat cat = (Cat)clazz.getConstructor(String.class).newInstance("Barsik");
        System.out.println(cat);
    }

    public void someMeth(String name, Integer... data) {

    }

    public void someMeth(String name, Integer data) {

    }
}
