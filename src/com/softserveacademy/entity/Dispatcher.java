package com.softserveacademy.entity;

import com.softserveacademy.mediator.CommunicationSystem;

public class Dispatcher implements TaxiService {

    private CommunicationSystem communicationSystem;
    private String name;

    public Dispatcher(CommunicationSystem communicationSystem, String name) {
        this.communicationSystem = communicationSystem;
        this.name = name;
    }

    @Override
    public void sendMessage(String message) {
        communicationSystem.sendMessage(message, this);
    }

    @Override
    public void getMessage(String message) {
        System.out.println(this.name + " received a message: " + message);
    }

    @Override
    public void sendMessageToDrivers(String message) {
        communicationSystem.sendMessage(message, this);
    }
}
