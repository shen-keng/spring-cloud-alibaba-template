package com.v5ba.nacos.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.stereotype.Component;

@Component
@RefreshScope
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
