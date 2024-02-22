
public class Main {

	public static void main(String[] args) {
		/*
		 He bought from a nuts wholesaler;
		 12 kilos roasted chickpeas, 3.5 TL per kilo,
		 25 kilos of hazelnuts, 15.7 TL per kilo,
		 40 kilos of almonds, 22 TL per kilo.

		 One day he/ shesold all the products they bought. When selling these products;
		 Save the weight of; 
		 roasted chickpeas by 50% profit,
		 hazelnuts by 40% profit,
		 Almonds by 60% profit.

		 The nuts seller wants to pay the shop rent with the money he earned that day.
		 Rental amount: 500 TL
		 If the money he earns is more than 500, he can pay, if it is less, he cannot pay. 
		 */
		
		double roasted_chickpea = 3.5;
		double hazelnut = 15.7;
		double almond = 22;
		
		double loss = (12 * roasted_chickpea) + (25 * hazelnut) + (40 * almond);
		double gain = (12* (roasted_chickpea * 1.5)) + (25* (hazelnut * 1.4)) + (40* (almond * 1.6));
		double diff = gain-loss;
		
		System.out.println("total cost: " + loss);
		System.out.println("total earnings: " + gain);
		System.out.println("profit: " + diff);
		
		if (diff >= 500) {
			System.out.println("soup money came out :)");
		}	
		else {
			System.out.println("Maybe next time :/");
		}
		
		
		
		
		
		
	}

}
