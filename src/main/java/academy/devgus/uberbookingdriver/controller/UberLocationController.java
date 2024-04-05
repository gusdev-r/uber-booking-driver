package academy.devgus.uberbookingdriver.controller;

import academy.devgus.uberbookingdriver.service.UberLocationService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("v1/api/location")
public class UberLocationController {
    private UberLocationService uberLocationService;

    public UberLocationController(UberLocationService uberLocationService) {
        this.uberLocationService = uberLocationService;
    }


    @PutMapping
    public ResponseEntity updateLocation() throws InterruptedException {

        int track = 100;
        while (track > 0) {
            uberLocationService.updateLocation(Math.random() + " , " + Math.random());
            Thread.sleep(1000);
            track --;
        }

        return new ResponseEntity<>(Map.of("message", "Location Updated")
                , HttpStatus.OK);
    }
}
