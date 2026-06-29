package Abstractionclass;

public class MBAStudent extends Student{

	@Override
	void calculateScholarship() {
		if(percentage>80)
		{
			System.out.println("You have 15,000 Scholarship");
		}
		else
		{
			System.out.println("no Scholarship");
		}
		
	}

}
