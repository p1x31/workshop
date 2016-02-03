
public class Infection
{

	public static void main(String[] args)
	{
		Person p = new Person();
		System.out.println(p); // well person
		
		p.setInfected(true);
		System.out.println(p);  // sick person
		
		Population pop = new Population(100, 0.1, 0.25, 0.2);
		System.out.println(pop);  // population of 100 people
		System.out.println(pop.howManyInfected()); // about 10
		
		//run simulation for several time steps
		for(int i = 0; i < 20; i++)
		{
			pop.update();
			System.out.println(pop.proportionInfected());
		}
		
		
		// now test with death rate > 0
		Population pop2 = new Population(100, 0.1, 0.1, 0.2, 0.1);
		System.out.println(pop2);  // population of 100 people
		System.out.println(pop2.howManyInfected()); // about 10
		
		//run simulation for several time steps
		for(int i = 0; i < 20; i++)
		{
			pop2.update();
			System.out.println(pop2.howManyInfected());
		}
		
		System.out.println(pop2); // should have reduced due to deaths
		
	}
}
