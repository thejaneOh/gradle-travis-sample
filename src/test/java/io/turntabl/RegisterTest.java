package io.turntabl;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class RegisterTest {

    @Test
    public void getTheClients()
    {
        //String clientName, int clientId, Service serviceLevel
        List <Client> clientsList = List.of(
                new Corporate("MS", 1, Service.Premium, "Kofi Fish"),
                new Private("Ella Maize", 2, Service.Premium),
                new Corporate("MS", 3, Service.Gold, "Ama Good"),
                new Private("Kofi Joy", 4, Service.Gold),
                new Corporate("Tomtom", 5, Service.Platinum, "Dede Peace"),
                new Corporate("Bread", 6, Service.Premium, "Kofi Fish"),
                new Private("Bela Rice", 7, Service.Platinum),
                new Corporate("Soap", 8, Service.Gold, "Gina Milk"),
                new Private("Yaa Corn", 9, Service.Premium),
                new Corporate("Butters", 10, Service.Premium, "Tea Sugar")
        );

        Register turnRegister = new Register(clientsList);
        String theName;
        List <String> clientNames = new ArrayList<>();

        for(int n = 0; n<turnRegister.getTheClients().size();n++)
        {
            theName = turnRegister.getTheClients().get(n).getClientName();
            clientNames.add(theName);
            System.out.println(theName);
        }



    }
}