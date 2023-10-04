package com.example.landmarkbook;

public class Singleton {

    private tracks selectedTrack;
    private static Singleton singleton;

    private Singleton(){}

    public tracks getSelectedTrack(){

        return selectedTrack;

    }

    public void setChosenTrack(tracks selectedTrack){
        this.selectedTrack=selectedTrack;

    }

    public static Singleton getInstance(){
        if (singleton==null){
            singleton=new Singleton();

        }
        return singleton;


    }




}
