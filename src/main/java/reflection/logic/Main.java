package main.java.reflection.logic;

import main.java.reflection.objects.Cat;
import main.java.reflection.objects.Crocodile;
import main.java.reflection.objects.Dog;

import java.lang.reflect.InvocationTargetException;

public class Main {

    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException, NoSuchMethodException, InvocationTargetException, InstantiationException {
        Cat cat = new Cat();
        Dog dog = new Dog();
        Crocodile crocodile = new Crocodile();
        AgeClass ageClass = new AgeClass();
        ageClass.setPetAge(cat, 3);
        ageClass.setPetAge(dog, 5);
        ageClass.setPetAge(crocodile, 200);
/*        System.out.println(cat.getAge());
        System.out.println(dog.getAge());
        System.out.println(crocodile.getAge());*/

        ageClass.invokeSoundMethod(cat, "Meow");
    }
}
