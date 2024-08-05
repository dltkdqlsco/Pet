package org.example;

public class Pet {

    private String name;
    private int age;

    public Pet() {
        this.name = "";
        this.age = 0;
    }

    public Pet(String name, int age){
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }



    @Override
    public String toString() {
        return "이름: " + name +"\n" +
                "나이: " + age;
    }
}
