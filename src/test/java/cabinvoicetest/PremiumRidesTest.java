package cabinvoicetest;

import org.junit.Assert;
import org.junit.Test;

import cabinvoicegenerator.CabInvoiceGenerator;
import premiumrides.PremiumRides;

/*
 * PremiumRidesTest
 */
public class PremiumRidesTest {

	@Test
	public void givenDistanceAndTime_whenPremiumCalculateFare_ShouldReturnTotalFare() {
		PremiumRides invoiceService = new PremiumRides();
		double totalFare = invoiceService.premiumCalculateFare(10.0, 20);
		Assert.assertEquals(240.0, totalFare, 0.0);
	}
	
	@Test
	public void givenDistanceAndTime_whenPremiumCalculateFareIsLessThan20_ShouldReturnTotalFareAs5() {
		CabInvoiceGenerator invoiceService = new CabInvoiceGenerator();
		double totalFare = invoiceService.calculateFare(5.0, 5);
		Assert.assertEquals(55, totalFare, 0.0);
	}
}
