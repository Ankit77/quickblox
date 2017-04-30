package com.quickblox.sample.chat.utils.chat;

import com.quickblox.chat.model.QBChatMessage;

import org.jivesoftware.smack.SmackException;
import org.jivesoftware.smack.XMPPException;

/**
 * Created by ANKIT on 4/30/2017.
 */

public interface Chat {
    void sendMessage(QBChatMessage message) throws XMPPException, SmackException.NotConnectedException;

    void release() throws XMPPException;

    void stopIstyping();

    void sendIstyping();
}
