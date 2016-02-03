public class Infection
{
	public static void main(String[] args)
	{
	// runs constructor creates new person
		Person p = new Person();
		System.out.println(p);
	
		p.setInfected(true);
		System.out.println(p);
		
		Population population = new Population(100, 0.75, 0.9, 0.1);
		Population population2 = new Population(100, 0.75, 0.9, 1.0, 0.1);
		System.out.println(population.getDeathRate());
		population2.setDeathRate(0.8);
		System.out.println(population2.getDeathRate());

		System.out.println(population);
		System.out.println(population.isInfected(0));
		System.out.println(population.howManyInfected());
		System.out.println("Population Infected: " + population.proportionInfected());
		for(int i = 0; i < 25; i++)
		{
		population.update();
		System.out.println(population.howManyInfected());
		}
	}
}
