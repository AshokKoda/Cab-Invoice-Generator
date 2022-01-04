package cabinvoicetest;

import org.junit.Assert;
import org.junit.Test;

import cabinvoicegenerator.CabInvoiceGenerator;
import entity.InvoiceSummary;
import entity.Rides;

public class InvoiceServiceTest {

	@Test
    public void givenDistanceAndTime_whenCalculateFare_ShouldReturnTotalFare() {
		CabInvoiceGenerator invoiceService = new CabInvoiceGenerator();
        double totalFare = invoiceService.calculateFare(2.0, 5);
        Assert.assertEquals(25.0, totalFare, 0.0);
    }
	
	@Test
    public void givenDistanceAndTime1_whenCalculateFare_ShouldReturnTotalFare() {
		CabInvoiceGenerator invoiceService = new CabInvoiceGenerator();
        double totalFare = invoiceService.calculateFare(0, 5);
        Assert.assertEquals(25.0, totalFare, 0.0);
    }
	
	@Test
    public void givenDistanceAndTime_whenCalculateFareIsLessThan5_ShouldReturnTotalFareAs5() {
		CabInvoiceGenerator invoiceService = new CabInvoiceGenerator();
        double totalFare = invoiceService.calculateFare(0.1, 1);
        Assert.assertEquals(5, totalFare, 0.0);
    }
	
	 @Test
	    public void givenMultipleRides_whenCalculateFare_ShouldReturnAggregateTotalFare() {
		 CabInvoiceGenerator invoiceService = new CabInvoiceGenerator();
	        Rides[] rides = {new Rides(2.0, 5),
	                new Rides(1.0, 5),
	                new Rides(0.1, 1)};
	        InvoiceSummary expectedSummary = new InvoiceSummary(3, 45);
	        InvoiceSummary summary = invoiceService.calculateFare(rides);
	        Assert.assertEquals(expectedSummary, summary);
	    }
}
