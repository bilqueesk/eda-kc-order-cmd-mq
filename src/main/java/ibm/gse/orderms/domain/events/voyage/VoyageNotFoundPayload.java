package ibm.gse.orderms.domain.events.voyage;

import io.quarkus.runtime.annotations.RegisterForReflection;

@RegisterForReflection
public class VoyageNotFoundPayload {

    private String orderID;
    private String reason;

    public VoyageNotFoundPayload(String orderID, String reason) {
        this.orderID = orderID;
        this.reason = reason;
    }

    public VoyageNotFoundPayload() {}

    public String getOrderID() {
        return orderID;
    }

    public void setOrderID(String orderID) {
        this.orderID = orderID;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

}
