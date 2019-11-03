package com.softserveacademy.mediator;

import com.softserveacademy.entity.TaxiService;

public interface CommunicationSystem {

    void sendMessage(String message, TaxiService taxiService);
    void sendMessageToDrivers (String message, TaxiService taxiService);
}
