package MethodOveriding1;



//sub class 01 or child class 01
public class Airtel extends  Telecomservice {
	
	 double []rechargecostforprepaid= {199,299};
     double  [] rechargecostforpostpaid= {399,499};
	
	
    @Override
   public void recharge(String type,double choiceplan)

	{
	   //super.recharge(type, choiceplan);
		if(type.equalsIgnoreCase("prepaid"))
		{
			
			
			if(choiceplan==1)
			{
			double cost = rechargecostforprepaid[0];
			double totalcost = cost+cost*0.5;
			System.out.println(totalcost);
				
				
			}
			else if(choiceplan==2)
			{
				double cost = rechargecostforprepaid[1];
				double totalcost = cost+cost*0.5;
				System.out.println(totalcost);
				
			}
		}
		
		else if(type.equalsIgnoreCase("postpaid"))
		{

			if(choiceplan==1)
			{
			double cost = rechargecostforpostpaid[0];
			double totalcost = cost+cost*0.5;
			System.out.println(totalcost);
				
				
			}
			else if(choiceplan==2)
			{
				double cost = rechargecostforpostpaid[1];
				double totalcost = cost+cost*0.5;
				System.out.println(totalcost);
				
			}
			
			
		}
	       
		
	}

}
