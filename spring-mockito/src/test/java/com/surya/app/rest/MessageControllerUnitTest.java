package com.surya.app.rest;

import static org.mockito.Mockito.times;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.ArgumentMatchers;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import com.surya.app.api.MessageApi;
import com.surya.domain.model.Message;
import com.surya.domain.service.MessageService;
import com.surya.domain.util.MessageMatcher;

@RunWith(MockitoJUnitRunner.class)
public class MessageControllerUnitTest {

    @Mock
    private MessageService messageService;

    @InjectMocks
    private MessageController messageController;

    @Test
    public void createMessage_NewMessage_OK() {
        MessageApi messageApi = new MessageApi();
        messageApi.setFrom("me");
        messageApi.setTo("you");
        messageApi.setText("Hello, you!");

        messageController.createMessage(messageApi);

        Message message = new Message();
        message.setFrom("me");
        message.setTo("you");
        message.setText("Hello, you!");

        Mockito.verify(messageService, times(1)).deliverMessage(ArgumentMatchers.argThat(new MessageMatcher(message)));
    }
}
