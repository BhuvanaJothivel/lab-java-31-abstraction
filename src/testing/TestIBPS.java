package testing;

import static org.junit.Assert.*;
import org.junit.Test;

import model.Abstract;
import model.IBPS;

public class TestIBPS {
	@Test
	public void testIbpsEligibility() {
		Abstract abs = new IBPS(19, "Unmarried", "India","yES");
		IBPS ibps = new IBPS(19, "Unmarried", "India", "YES");
		boolean temp1 = abs.baseEligibility();
		boolean temp2 = ibps.ibpsEligible();
		assertEquals(true, temp1);
		assertEquals(true, temp2);
		try {
			Abstract abs1 = new IBPS(0, "null", "null","null");
			IBPS ibps1 = new IBPS(0, "null", "null", "null");
			abs1.baseEligibility();
			ibps1.ibpsEligible();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}
