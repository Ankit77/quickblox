package com.quickblox.sample.chat.models;

import com.quickblox.chat.model.QBChatMessage;

/**
 * Created by ANKIT on 4/30/2017.
 */

public class ChatModel {
    private QBChatMessage qbChatMessage;
    private boolean isDeliverd = false;
    private boolean isRead = false;

    public ChatModel(QBChatMessage qbChatMessage, boolean isDeliverd, boolean isRead) {
        this.qbChatMessage = qbChatMessage;
        this.isDeliverd = isDeliverd;
        this.isRead = isRead;
    }

    public QBChatMessage getQbChatMessage() {
        return qbChatMessage;
    }

    public void setQbChatMessage(QBChatMessage qbChatMessage) {
        this.qbChatMessage = qbChatMessage;
    }

    public boolean isDeliverd() {
        return isDeliverd;
    }

    public void setDeliverd(boolean deliverd) {
        isDeliverd = deliverd;
    }

    public boolean isRead() {
        return isRead;
    }

    public void setRead(boolean read) {
        isRead = read;
    }
}
