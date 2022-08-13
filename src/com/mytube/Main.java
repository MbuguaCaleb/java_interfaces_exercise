package com.mytube;

public class Main {

    public static void main(String[] args) {
        var video = new Video();
        video.setFileName("birthday.mp4");
        video.setTitle("Jennifer's birthday");
        video.setUser(new User("john@domain.com"));

        //dependencies will be the three diffrent classes represented by three different interfaces
        var processor = new VideoProcessor(new
                XVideoEncoder(),new SqlVideoDatabase(), new XEmailService());

        //method injection
        processor.process(video);
    }
}
