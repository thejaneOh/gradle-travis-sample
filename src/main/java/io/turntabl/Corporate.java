package io.turntabl;

public class Corporate extends Client
{
    private String managerName;

    public Corporate(String clientName, long clientId, Service serviceLevel, String theName)
    {
        super(clientName, clientId, serviceLevel);
        this.managerName = theName;
    }

//    public String getManagerName() {
//        return managerName;
//    }

    @Override
    public String getClientName() {
        return managerName;
    }
}
