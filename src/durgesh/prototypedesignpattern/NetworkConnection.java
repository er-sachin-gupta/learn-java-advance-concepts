package durgesh.prototypedesignpattern;

import java.util.ArrayList;
import java.util.List;

public class NetworkConnection implements Cloneable {

    private String ip;
    private String importantData;
    private List<String> domains = new ArrayList();

    @Override
    public String toString() {
        return "NetworkConnection{" +
                "ip='" + ip + '\'' +
                ", importantData='" + importantData + '\'' +
                ", domains = '" + domains + '\''+
                '}';
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public String getImportantData() {
        return importantData;
    }

    public void setImportantData(String importantData) {
        this.importantData = importantData;
    }

    public List<String> getDomains() {
        return domains;
    }

    public void setDomains(List<String> domains) {
        this.domains = domains;
    }

    public void loadVeryImportantData() throws InterruptedException {
        this.importantData = "Very Very important data";
        domains.add("www.radhe.com");
        domains.add("www.krishna.com");
        domains.add("www.harerama.com");
        domains.add("www.merekrishna.com");
        Thread.sleep(5000);
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        NetworkConnection networkConnection = new NetworkConnection();
        networkConnection.setIp(this.getIp());
        networkConnection.setImportantData(this.getImportantData());
        for (String d : this.getDomains()) {
            networkConnection.getDomains().add(d);
        }
        return networkConnection;
//        return super.clone();
    }
}
