package Model;

public class Driver {
    private String name;
    private String NIC;
    private String DrivingLicenseNo;
    private String address;
    private String contactB;

    public Driver() {
    }

    public Driver(String name, String NIC, String drivingLicenseNo, String address, String contactB) {
        this.name = name;
        this.NIC = NIC;
        this.DrivingLicenseNo = drivingLicenseNo;
        this.address = address;
        this.contactB = contactB;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNIC() {
        return NIC;
    }

    public void setNIC(String NIC) {
        this.NIC = NIC;
    }

    public String getDrivingLicenseNo() {
        return DrivingLicenseNo;
    }

    public void setDrivingLicenseNo(String drivingLicenseNo) {
        this.DrivingLicenseNo = drivingLicenseNo;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getContactB() {
        return contactB;
    }

    public void setContactB(String contactB) {
        this.contactB = contactB;
    }

    @Override
    public String toString() {
        return "Driver{" +
                "name='" + name + '\'' +
                ", NIC='" + NIC + '\'' +
                ", DrivingLicenseNo='" + DrivingLicenseNo + '\'' +
                ", address='" + address + '\'' +
                ", contactB='" + contactB + '\'' +
                '}';
    }
}
