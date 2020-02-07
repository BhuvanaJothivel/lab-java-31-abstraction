package testing;

import static org.junit.Assert.*;
import org.junit.Test;

import model.Abstract;
import model.IAS;

public class TestIAS {
	@Test
	public void testIasEligibility() {
		Abstract abs = new IAS(19, "Unmarried", "India",6);
		IAS ias = new IAS(19, "Unmarried", "India", 6);
		boolean temp1 = abs.baseEligibility();
		boolean temp2 = ias.iasEligible();
		assertEquals(true, temp1);
		assertEquals(true, temp2);
		try {
			Abstract abs1 = new IAS(0, "null", "null",0);
			IAS ias1 = new IAS(0, "null", "null", 0);
			abs1.baseEligibility();
			ias1.iasEligible();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}
