package com.tech552.springbootactuatordemo.monitor;

import org.springframework.boot.actuate.health.Health;
import org.springframework.boot.actuate.health.HealthIndicator;
import org.springframework.stereotype.Component;

import java.util.Random;

@Component
public class DbHealthIndicator implements HealthIndicator {


    @Override
    public Health health() {
        if(isDBHealthy()){
            return Health.up().withDetail("External Db svc ", "Healthy").build();
        }
        return Health.down().withDetail("External Db svc ", "Is Not Healthy").build();
    }

    //Mimics a call to an external service or DB
    private boolean isDBHealthy(){
        Random random = new Random();
        return random.nextBoolean();
    }


}
