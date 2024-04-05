package academy.devgus.uberbookingdriver.config;

import academy.devgus.uberbookingdriver.constant.AppConstant;
import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

@Configuration
public class KafkaConfig {

    public NewTopic newTopic() {
        return TopicBuilder
                .name(AppConstant.UBER_LOCATION)
                .build();
    }
}
