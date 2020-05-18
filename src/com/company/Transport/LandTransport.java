package JAVA2.src.com.company.Transport;
/**
 * @description:
 * @author: wj
 * @date:Created in 2020-04-8 19:07
 * @version:0.0.1
 * @modified By:
 */


public class LandTransport {
        private String transportId;
        private String Type;
        private String Owner;
        private String Price;
        private String purchaseDate;
        private String GPS;
        private String Note;


        public void behaviorDrive() {
            System.out.println(" LandTransport behaviorDrive");
        }

        public void behaviorBrake() {
            System.out.println(" LandTransport behaviorBrake");
        }

        public void behaviorDirection() {
            System.out.println(" LandTransport behaviorDirection");
        }

        public void behaviorAccelerator() {
            System.out.println(" LandTransport behaviorAccelerator");
        }

        public LandTransport() {
        }

        public LandTransport(String transportId, String Type, String Owner, String Price, String purchaseDate, String GPS, String Note) {
            this.transportId = transportId;
            this.Type = Type;
            this.Owner = Owner;
            this.Price = Price;
            this.purchaseDate = purchaseDate;
            this.GPS = GPS;
            this.Note = Note;
        }

        public String getTransportId() {
            return transportId;
        }

        public void setTransportId(String transportId) {
            this.transportId = transportId;
        }

        public String getType() {
            return Type;
        }

        public void setType(String Type) {
            this.Type = Type;
        }

        public String getOwner() {
            return Owner;
        }

        public void setOwner(String Owner) {
            this.Owner = Owner;
        }

        public String getPrice() {
            return Price;
        }

        public void setPrice(String Price) {
            this.Price = Price;
        }

        public String getPurchaseDate() {
            return purchaseDate;
        }

        public void setPurchaseDate(String purchaseDate) {
            this.purchaseDate = purchaseDate;
        }

        public String getGPS() {
            return GPS;
        }

        public void setGPS(String GPS) {
            this.GPS = GPS;
        }

        public String getNote() {
            return Note;
        }

        public void setNote(String Note) {
            this.Note = Note;
        }

}
