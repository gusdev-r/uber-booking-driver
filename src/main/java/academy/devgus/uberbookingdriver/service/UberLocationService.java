package academy.devgus.uberbookingdriver.service;

import academy.devgus.uberbookingdriver.constant.AppConstant;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class UberLocationService {

    private KafkaTemplate<String,Object> kafkaTemplate;

    public UberLocationService(KafkaTemplate<String, Object> kafkaTemplate) {
        this.kafkaTemplate = kafkaTemplate;
    }

    public boolean updateLocation(String location) {
        kafkaTemplate.send(AppConstant.UBER_LOCATION, location);
        return true;
    }

}
