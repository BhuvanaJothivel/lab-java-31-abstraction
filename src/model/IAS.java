package model;

public class IAS extends Abstract {

	private int attempts;

	public IAS(int age, String maritial, String country, int attempts) {
		super(age, maritial, country);
		this.attempts = attempts;
	}

	public boolean iasEligible() {
		if (attempts <= 6) {
			return true;
		} else
			return false;
	}

}
