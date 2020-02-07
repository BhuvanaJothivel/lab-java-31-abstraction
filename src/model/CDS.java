package model;

public class CDS extends Abstract {

	private int height;
	private int weight;
	private int tooth;
	private String vision;
	private String swim;

	public CDS(int age, String maritial, String country, int height, int weight, int tooth, String vision,
			String swim) {
		super(age, maritial, country);
		this.height = height;
		this.weight = weight;
		this.tooth = tooth;
		this.vision = vision;
		this.swim = swim;
	}

	public boolean cdsEligible() {
		if (height >= 152 && weight >= 54 && tooth >= 14 && tooth <= 17 && !vision.equalsIgnoreCase("other")
				&& swim.equalsIgnoreCase("yes")) {
			return true;
		} else
			return false;
	}

}
