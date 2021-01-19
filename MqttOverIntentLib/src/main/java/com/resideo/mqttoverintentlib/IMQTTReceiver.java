package com.resideo.mqttoverintentlib;

public interface IMQTTReceiver {
    void messageArrived(String topic, String message) throws Exception;
}
