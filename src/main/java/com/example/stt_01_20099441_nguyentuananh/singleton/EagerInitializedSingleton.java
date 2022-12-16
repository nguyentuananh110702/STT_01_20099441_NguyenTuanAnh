package com.example.stt_01_20099441_nguyentuananh.singleton;

public class EagerInitializedSingleton {
    private static final EagerInitializedSingleton instance = new EagerInitializedSingleton();
    private EagerInitializedSingleton(){}
    public  static EagerInitializedSingleton getInstance(){
        return instance;
    }
}
