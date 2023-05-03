package com.samples.sesionthree;

/**
 * 
 * @author Jessica
 *
 */
public class Animal {
    // La edad de cada animal debe estar entre 0 y 100 dkjskdjskjdlksjdjsakljsalkdjksa sjdksjdlsjdklsajdlkjasdkjd
    // klsajdjslakdjlsakjdksajdlks.
    private int age;
    protected String name;

    /**
     * Constructor hace algo.
     * 
     * @param age, que significa.
     * @param name
     */
    public Animal(int age, String name) {
        // comentarios de una sola linea
        super();
        this.age = age;
        this.name = name;
    }

    public Animal(int age) {
        super();
        this.age = age;
        this.name = null;
    }

    /**
     * @return the age
     */
    public int getAge() {
        return age;
    }

}
