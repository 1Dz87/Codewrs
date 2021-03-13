package main.java.reflection.objects;

public class Cat {

    private String name;

    private String sound;

    private Integer age;

    public Cat() {
    }

    public Cat(String name) {
        this.name = name;
    }

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

    @Override
    public String toString() {
        return "Cat with name: " + getName();
    }
}
