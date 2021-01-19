package com.resideo.mqttoverintentlib;

/**
 * this interface to notify the implementer when it receives requests
 * from other apps
 */
public interface IMQTTExternalRequest {
    void onExternalRequestSubscribe(String topic, String owner, String qos);

    void onExternalRequestUnSubscribe(String topic, String owner);

    void onExternalRequestPublish(String topic, String message, String qos);
}
