package com.v5ba.nacos.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@RefreshScope
@Component
@ConfigurationProperties(prefix = "sms.config")
public class SmsConfig {
    private String canSend;
    private String channel;

    public String getCanSend() {
        return canSend;
    }

    public void setCanSend(String canSend) {
        this.canSend = canSend;
    }

    public String getChannel() {
        return channel;
    }

    public void setChannel(String channel) {
        this.channel = channel;
    }
}
