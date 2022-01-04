package invoiceservice;

public class Ride {

	protected double distance;
	protected int time;
	protected String invoiceId;

	public Ride(double distance, int time, String invoiceId) {
		this.distance = distance;
		this.time = time;
		this.invoiceId = invoiceId;
	}

	public double getDistance() {
		return distance;
	}

	public void setDistance(double distance) {
		this.distance = distance;
	}

	public int getTime() {
		return time;
	}

	public void setTime(int time) {
		this.time = time;
	}

	public String getInvoiceId() {
		return invoiceId;
	}

	public void setInvoiceId(String invoiceId) {
		this.invoiceId = invoiceId;
	}
	
	
}
