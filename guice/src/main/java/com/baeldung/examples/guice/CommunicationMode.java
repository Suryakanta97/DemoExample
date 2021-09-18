
package com.surya.examples.guice;

import com.surya.examples.guice.constant.CommunicationModel;

public interface CommunicationMode {

    public CommunicationModel getMode();
    
    public boolean sendMessage(String message);

}
