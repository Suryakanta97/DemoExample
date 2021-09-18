
package com.surya.examples.guice;

import com.surya.examples.guice.aop.MessageSentLoggable;
import com.surya.examples.guice.constant.CommunicationModel;

/**
 *
 * @author surya
 */
public class EmailCommunicationMode implements CommunicationMode {

    @Override
    public CommunicationModel getMode() {
        return CommunicationModel.EMAIL;
    }

    @Override
    @MessageSentLoggable
    public boolean sendMessage(String Message) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
