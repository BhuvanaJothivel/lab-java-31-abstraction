package model;

public class IBPS extends Abstract {

	private String computer;

	public IBPS(int age, String maritial, String country, String computer) {
		super(age, maritial, country);
		this.computer = computer;
	}

	public boolean ibpsEligible() {
		if (computer.equalsIgnoreCase("yes")) {
			return true;
		} else
			return false;

	}

}
