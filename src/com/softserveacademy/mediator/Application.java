package com.softserveacademy.mediator;

import com.softserveacademy.entity.Dispatcher;
import com.softserveacademy.entity.TaxiDriver;
import com.softserveacademy.entity.TaxiService;

import java.util.ArrayList;
import java.util.List;

public class Application implements CommunicationSystem {

    private List<Dispatcher> dispatchers = new ArrayList<>();
    private List<TaxiDriver> taxiDrivers = new ArrayList<>();

    public void addDispatcher(Dispatcher dispatcher){
        this.dispatchers.add(dispatcher);
    }

    public void addTaxiDriver(TaxiDriver taxiDriver){
        this.taxiDrivers.add(taxiDriver);
    }

    @Override
    public void sendMessage(String message, TaxiService taxiService) {
        for (TaxiDriver driver: taxiDrivers) {
            if(taxiService != driver) {
                driver.getMessage(message);
            }
        }
        for (Dispatcher dispatcher: dispatchers) {
            if(taxiService != dispatcher) {
                dispatcher.getMessage(message);
            }
        }
    }

    @Override
    public void sendMessageToDrivers(String message, TaxiService taxiService) {
        for (TaxiDriver driver: taxiDrivers) {
            if(taxiService != driver) {
                driver.getMessage(message);
            }
        }
    }

}
