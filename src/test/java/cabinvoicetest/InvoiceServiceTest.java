package cabinvoicetest;

import org.junit.Assert;
import org.junit.Test;

import cabinvoicegenerator.CabInvoiceGenerator;

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
}
