package main.java.reflection.objects;

public class Dog {

    private String name;

    private String sound;

    private Integer age;

    public void makeSound(String sound) {
        this.sound = sound;
        System.out.println(finalSound());
    }

    private String finalSound() {
        return getSound() + "!";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSound() {
        return sound;
    }

    public void setSound(String sound) {
        this.sound = sound;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
