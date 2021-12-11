package com.kaikai.nexusweather.core.domain.test;

/**
 * @author kaikai
 * @createTime 2021年12月11日 17:12
 * @Description :
 */
public class Postman {
    private int id;
    private String name;
    private Sex sex;

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

    public Postman(int id, String name, Sex sex) {
        this.id = id;
        this.name = name;
        this.sex = sex;
    }

    public Postman() {
    }
}
