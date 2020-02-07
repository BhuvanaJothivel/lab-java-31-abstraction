package testing;

import static org.junit.Assert.*;
import org.junit.Test;

import model.Abstract;
import model.CDS;

public class TestCDS {
	@Test
	public void testCdsEligibility() {
		Abstract abs = new CDS(19, "Unmarried", "India", 165, 55, 15, "Normal", "yes");
		CDS cds = new CDS(19, "Unmarried", "India", 165, 55, 15, "Normal", "yes");
		boolean temp1 = abs.baseEligibility();
		boolean temp2 = cds.cdsEligible();
		assertEquals(true, temp1);
		assertEquals(true, temp2);
		try {
			Abstract abs1 = new CDS(0,"null","null",0,0,0,"null","null");
			CDS cds1 = new CDS(0, "null", "null", 0, 0, 0, "null", "null");
			abs1.baseEligibility();
			cds1.cdsEligible();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}
