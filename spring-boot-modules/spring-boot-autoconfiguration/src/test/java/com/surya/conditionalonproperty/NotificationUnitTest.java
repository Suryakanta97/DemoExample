package com.surya.conditionalonproperty;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.runner.ApplicationContextRunner;

import com.surya.conditionalonproperty.config.NotificationConfig;
import com.surya.conditionalonproperty.service.EmailNotification;
import com.surya.conditionalonproperty.service.NotificationSender;

public class NotificationUnitTest {

    private final ApplicationContextRunner contextRunner = new ApplicationContextRunner();

    @Test
    public void whenValueSetToEmail_thenCreateEmailNotification() {
        this.contextRunner.withPropertyValues("notification.service=email")
            .withUserConfiguration(NotificationConfig.class)
            .run(context -> {
                assertThat(context).hasBean("emailNotification");
                NotificationSender notificationSender = context.getBean(EmailNotification.class);
                assertThat(notificationSender.send("Hello From surya!")).isEqualTo("Email Notification: Hello From surya!");
                assertThat(context).doesNotHaveBean("smsNotification");
            });
    }
}
