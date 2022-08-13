package com.mytube;


//i need a no of interfaces
//java has an adavatage when a class is public i dont have to instantiate it in my constructor
public class VideoProcessor {

    private VideoEncoder encoder;
    private VideoDatabase database;
    private NotificationService notificationService;

    public VideoProcessor(VideoEncoder encoder, VideoDatabase database, NotificationService notificationService) {
        this.encoder = encoder;
        this.database = database;
        this.notificationService = notificationService;
    }


    public void process(Video video) {
        //i am calling methods in my interface which then will call methods in my injecteables
        encoder.encode(video);
        database.store(video);
        notificationService.sendEmail(video.getUser());
    }
}

