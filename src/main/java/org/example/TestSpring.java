package org.example;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml"
        );

        //создание бина через Spring (объект который расширяется интерфейсом)
        Music music  = context.getBean("musicBean", Music.class);

        //IoC
        MusicPlayer musicPlayer = new MusicPlayer(music);

        musicPlayer.playMusic();


        context.close();
    }
}
