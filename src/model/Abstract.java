package model;

public abstract class Abstract {

	private int age;
	private String maritial;
	private String country;

	public Abstract(int age, String maritial, String country) {
		this.age = age;
		this.maritial = maritial;
		this.country = country;
	}

	public boolean baseEligibility() {
		if (age >= 18 && age <= 32 && maritial.equalsIgnoreCase("Unmarried")
				&& (country.equalsIgnoreCase("India") || country.equalsIgnoreCase("india"))) {
			return true;
		} else
			return false;

	}

}
