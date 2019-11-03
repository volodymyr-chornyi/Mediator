package com.softserveacademy;

import com.softserveacademy.entity.Dispatcher;
import com.softserveacademy.entity.TaxiDriver;
import com.softserveacademy.mediator.Application;

public class MediatorExample {

    public static void main(String[] args) {
        Application application = new Application();
        Dispatcher dispatcher = new Dispatcher(application, "Dispatcher");
        application.addDispatcher(dispatcher);
        TaxiDriver driver_1 = new TaxiDriver(application, "\'105\'");
        application.addTaxiDriver(driver_1);
        TaxiDriver driver_2 = new TaxiDriver(application, "\'210\'");
        application.addTaxiDriver(driver_2);
        TaxiDriver driver_3 = new TaxiDriver(application, "\'330\'");
        application.addTaxiDriver(driver_3);

        dispatcher.sendMessage("new order: Golovna street, 246");
        System.out.println();
        driver_1.sendMessage("the order accepted");
        System.out.println();
        driver_1.sendMessageToDrivers("traffic jam on Komarova street");

    }
}
