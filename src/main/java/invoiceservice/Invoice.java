package invoiceservice;

import java.util.Objects;

public class Invoice {

	private final int numOfRides;
	private final double totalFare;
	private final double averageFare;
	private final String invoiceId;
	
	public Invoice(String invoiceId, double totalFare) {
		this.numOfRides = 0;
		this.averageFare = 0;
		this.invoiceId = invoiceId;
		this.totalFare = totalFare;
	}
	
	@Override
	public boolean equals(Object o) {
		if (this == o)
			return true;
		if (o == null || getClass() != o.getClass())
			return false;
		Invoice that = (Invoice) o;
		return numOfRides == that.numOfRides && Double.compare(that.totalFare, totalFare) == 0
				&& Objects.equals(averageFare, that.averageFare);
	}
}
