package com.example.muesum.GeneralVisitor;

import javafx.event.ActionEvent;

import javax.print.attribute.standard.Media;
import java.io.File;

public class DigitalGuideController
{
    private String mediaPlayer;
    private String guideMediaView;

    public DigitalGuideController(String guideMediaView, String mediaPlayer) {
        this.guideMediaView = guideMediaView;
        this.mediaPlayer = mediaPlayer;
    }

    public String getMediaPlayer() {
        return mediaPlayer;
    }

    public void setMediaPlayer(String mediaPlayer) {
        this.mediaPlayer = mediaPlayer;
    }

    public String getGuideMediaView() {
        return guideMediaView;
    }

    public void setGuideMediaView(String guideMediaView) {
        this.guideMediaView = guideMediaView;
    }

    @Override
    public String toString() {
        return "DigitalGuideController{" +
                "mediaPlayer='" + mediaPlayer + '\'' +
                ", guideMediaView='" + guideMediaView + '\'' +
                '}';
    }

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void playGuideOA(ActionEvent actionEvent) {
        System.out.println("Digital Guide: Play/Resume");
    }

    @javafx.fxml.FXML
    public void pauseGuideOA(ActionEvent actionEvent) {
        System.out.println("Digital Guide: Pause");
    }

    @javafx.fxml.FXML
    public void stopGuideOA(ActionEvent actionEvent) {
        System.out.println("Digital Guide: Stop");

    }
}