package com.java.yage.rabbit;


/**
 * Description: 队列名称
 *
 * @Author:Jinmu Date: 2018/6/26
 */
public class QueueDemo {

    private  String name;

    private Integer age;

    private String address;

    public QueueDemo(String name, Integer age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
