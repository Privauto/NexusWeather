package com.kaikai.nexusweather.core.domain.test;

/**
 * @author kaikai
 * @createTime 2021年12月11日 17:12
 * @Description :
 */
public class Postman {
    private int id;
    private int age;
    private String name;
    private Sex sex;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Sex getSex() {
        return sex;
    }

    public void setSex(Sex sex) {
        this.sex = sex;
    }

    public Postman(int id,int age, String name, Sex sex) {
        this.id = id;
        this.age=age;
        this.name = name;
        this.sex = sex;
    }

    public Postman() {
    }
}
