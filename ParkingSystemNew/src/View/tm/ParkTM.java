package View.tm;

public class ParkTM {
    private String vehicleNo;
    private String vehicleType;
    private String parkingSlot;
    private String parkedTime;

    public ParkTM() {
    }

    public ParkTM(String vehicleNo, String vehicleType, String parkingSlot, String parkedTime) {
        this.vehicleNo = vehicleNo;
        this.vehicleType = vehicleType;
        this.parkingSlot = parkingSlot;
        this.parkedTime = parkedTime;
    }

    public String getVehicleNo() {
        return vehicleNo;
    }

    public void setVehicleNo(String vehicleNo) {
        this.vehicleNo = vehicleNo;
    }

    public String getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(String vehicleType) {
        this.vehicleType = vehicleType;
    }

    public String getParkingSlot() {
        return parkingSlot;
    }

    public void setParkingSlot(String parkingSlot) {
        this.parkingSlot = parkingSlot;
    }

    public String getParkedTime() {
        return parkedTime;
    }

    public void setParkedTime(String parkedTime) {
        this.parkedTime = parkedTime;
    }

    @Override
    public String toString() {
        return "ParkTM{" +
                "vehicleNo='" + vehicleNo + '\'' +
                ", vehicleType='" + vehicleType + '\'' +
                ", parkingSlot='" + parkingSlot + '\'' +
                ", parkedTime='" + parkedTime + '\'' +
                '}';
    }
}
