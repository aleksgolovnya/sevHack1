public class InputData {
    public int VlanNumber;
    public String Ip;
    public String portNumberTaggged;
    public String portNumberUnTaggged;

    public int getVlanNumber() {
        return VlanNumber;
    }

    public String getIp() {
        return Ip;
    }

    public String getPortNumberTaggged() {
        return portNumberTaggged;
    }

    public String getPortNumberUnTaggged() {
        return portNumberUnTaggged;
    }

    public void setVlanNumber(int vlanNumber) {
        VlanNumber = vlanNumber;
    }

    public void setIp(String ip) {
        Ip = ip;
    }

    public void setPortNumberTaggged(String portNumberTaggged) {
        this.portNumberTaggged = portNumberTaggged;
    }

    public void setPortNumberUnTaggged(String portNumberUnTaggged) {
        this.portNumberUnTaggged = portNumberUnTaggged;
    }

    public InputData(int vlanNumber, String ip, String portNumberTaggged, String portNumberUnTaggged) {
        VlanNumber = vlanNumber;
        Ip = ip;
        this.portNumberTaggged = portNumberTaggged;
        this.portNumberUnTaggged = portNumberUnTaggged;
    }
}