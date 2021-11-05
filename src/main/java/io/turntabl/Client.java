package io.turntabl;

public class Client
{
    private String ClientName;
    private long ClientId;
    private Service serviceLevel;

    public Client(String clientName,  long clientId, Service serviceLevel) {
        ClientName = clientName;
        ClientId = clientId;
        this.serviceLevel = serviceLevel;
    }

    public String getClientName() {
        return ClientName;
    }

    public void setClientName(String clientName) {
        ClientName = clientName;
    }

    public long getClientId() {
        return ClientId;
    }

    public void setClientId(int clientId) {
        ClientId = clientId;
    }

    public Service getServiceLevel() {
        return serviceLevel;
    }

    public void setServiceLevel(Service serviceLevel) {
        this.serviceLevel = serviceLevel;
    }
}
