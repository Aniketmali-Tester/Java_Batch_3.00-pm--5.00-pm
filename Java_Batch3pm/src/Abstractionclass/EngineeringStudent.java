package Abstractionclass;

public class EngineeringStudent extends Student {

	@Override
	void calculateScholarship() {
		
		if(percentage>85)
		{
			System.out.println("You have 20,000 scholarship");
		}
		else
		{
			
			System.out.println("No Scholarship");
		}
		
	}

}
