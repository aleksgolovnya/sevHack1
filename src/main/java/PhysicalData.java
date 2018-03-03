public class PhysicalData {
    String ipParent;
    String ipChild;
    int portParent;
    int portChild;

    public String getIpParent() {
        return ipParent;
    }

    public void setIpParent(String ipParent) {
        this.ipParent = ipParent;
    }

    public String getIpChild() {
        return ipChild;
    }

    public void setIpChild(String ipChild) {
        this.ipChild = ipChild;
    }

    public int getPortParent() {
        return portParent;
    }

    public void setPortParent(int portParent) {
        this.portParent = portParent;
    }

    public int getPortChild() {
        return portChild;
    }

    public void setPortChild(int portChild) {
        this.portChild = portChild;
    }

    public PhysicalData(String ipParent, String ipChild, int portParent, int portChild) {
        this.ipParent = ipParent;
        this.ipChild = ipChild;
        this.portParent = portParent;
        this.portChild = portChild;
    }
}

