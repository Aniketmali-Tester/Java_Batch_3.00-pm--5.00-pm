package MethodOveriding1;

public class jio extends Telecomservice {
	
	double []rechargecostforprepaid= {299,399};
    double  [] rechargecostforpostpaid= {499,599};
	
	@Override
	public void recharge(String type,double choiceplan)
	{
		
		if(type.equalsIgnoreCase("prepaid"))
		{
			
			
			if(choiceplan==1)
			{
			double cost = rechargecostforprepaid[0];
			double totalcost = cost+cost*0.7;
			System.out.println(totalcost);
				
				
			}
			else if(choiceplan==2)
			{
				double cost = rechargecostforprepaid[1];
				double totalcost = cost+cost*0.7;
				System.out.println(totalcost);
				
			}
		}
		
		else if(type.equalsIgnoreCase("postpaid"))
		{

			if(choiceplan==1)
			{
			double cost = rechargecostforpostpaid[0];
			double totalcost = cost+cost*0.7;
			System.out.println(totalcost);
				
				
			}
			else if(choiceplan==2)
			{
				double cost = rechargecostforpostpaid[1];
				double totalcost = cost+cost*0.7;
				System.out.println(totalcost);
				
			}
			

		
	}

	}
}
