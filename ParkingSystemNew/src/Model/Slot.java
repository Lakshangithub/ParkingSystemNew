package Model;

public class Slot {
    private String vehicleType;
    private String slotNo;
    private String status;

    public Slot() {

    }

    public Slot(String vehicleType, String slotNo, String status) {
        this.vehicleType = vehicleType;
        this.slotNo = slotNo;
        this.status = status;
    }

    public String getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(String vehicleType) {
        this.vehicleType = vehicleType;
    }

    public String getSlotNo() {
        return slotNo;
    }

    public void setSlotNo(String slotNo) {
        this.slotNo = slotNo;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Slot{" +
                "vehicleType='" + vehicleType + '\'' +
                ", slotNo='" + slotNo + '\'' +
                ", status='" + status + '\'' +
                '}';
    }
}
