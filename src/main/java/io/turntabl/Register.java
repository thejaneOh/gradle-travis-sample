package io.turntabl;

import java.util.ArrayList;
import java.util.List;

public class Register
{
    private List<Client> theClients= new ArrayList<>();

    public Register(List<Client> clientName)
    {
        theClients = clientName;
    }

    public String getContactName(Client theClient)
    {
        if(theClient instanceof Corporate)
        {
            return ((Corporate) theClient).getClientName();

        }
        else
        {
            return theClient.getClientName();
        }

    }


    public List<Client> getTheClients() {
        return theClients;
    }
}
