package org.example;

import org.springframework.stereotype.Component;

@Component
public class ClassicalMusic implements Music {

    //приватный конструктор для того, чтобы ограничить создание через new
//    private ClassicalMusic() {}

    //factory-method
//    public static ClassicalMusic getClassicalMusic(){
//        return new ClassicalMusic();
//    }

    //init-method
    public void doMyInit(){
        System.out.println("Doing my initialization");
    }

    //destroy-method

    public void doMyDestroy(){
        System.out.println("Doing my destruction");
    }

    @Override
    public String getSong() { return "Hungarian Rhapsody"; }
}
