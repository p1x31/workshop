import com.sun.org.apache.bcel.internal.generic.POP;

import java.util.Random;
import java.util.ArrayList;
/**
Represents a population of people and an infection that passes between them.
*/

public class Population
{
	//attribute
	private ArrayList<Person> pop;
	private double infectionRate;
	private double recoveryRate;
	private double deathRate;
	private Random generator;

	
	/**
	Create a population.
	@param size The population size.
	@param initial The initial probability of infection.
	@param infectionRate The infection rate.
	@param recoveryRate The recovery rate.
	*/
	public Population(int size, double initial, double infectionRate, double recoveryRate)
	{
		this.infectionRate = infectionRate;
		this.recoveryRate = recoveryRate;
		this.deathRate = 0.0;

		pop = new ArrayList<Person>();
		this.generator = new Random();

		for (int i=0; i< pop.size();i++)
		{
			pop.add(new Person());
			if(generator.nextDouble() < initial)
			{
				pop.get(i).setInfected(true);
			}
		}
	}
	/**
	 Create a population.
	 @param size The population size.
	 @param initial The initial probability of infection.
	 @param infectionRate The infection rate.
	 @param recoveryRate The recovery rate.
	 @param deathRate The death rate.
	 */
	public Population(int size, double initial, double infectionRate, double deathRate, double recoveryRate)
	{
		this.infectionRate = infectionRate;
		this.recoveryRate = recoveryRate;
		this.deathRate = deathRate;
		pop = new ArrayList<Person>();
		this.generator = new Random();

		for (int i=0; i< pop.size();i++)
		{
			pop.add(new Person());
			if(generator.nextDouble() < initial)
			{
				pop.get(i).setInfected(true);
			}
		}
	}
	//toString
	public String toString()
	{
		return "Population of " + pop.size() + " people"; 
	}
	
	/**
	Tells us what is infection rate
	@return The infection rate.
	*/
	public double getInfectionRate()
	{
		return infectionRate;
	}
	/**
	Changes the infection rate.
	@param infectionRate The new infection rate.
	*/
	public void setInfectionRate(double infectionRate)
	{
		this.infectionRate= infectionRate;
	}
	/**
	Tells us what is recovery rate
	@return The recovery rate.
	*/
	public double getRecoveryRate()
	{
		return recoveryRate;
	}
	/**
	Changes the recovery rate.
	@param recoveryRate The new recovery rate.
	*/
	public void setRecoveryRate(double recoveryRate)
	{
		this.recoveryRate= recoveryRate;
	}

	/**
	 Tells us what is death rate
	 @return The death rate.
	 */
	public double getDeathRate()
	{
		return deathRate;
	}
	/**
	 Changes the deathRate rate.
	 @param deathRate The new deathRate rate.
	 */
	public void setDeathRate(double deathRate)
	{
		this.deathRate = deathRate;
	}

	/**
	If the person at a specific index infected?
	@param index The index of the person.
	@return whether or not they are infected
	*/
	public boolean isInfected(int index)
	{
		return pop.get(index).isInfected();
	}
	/**
	How many people are infected?
	@return The number of infected people.
	*/
	public int howManyInfected()
	{
		int total = 0;
		for (int i=0; i< pop.size();i++)
		{
			if (isInfected(i))
			total++;
		}
		return total;
	}
	/**
	Find proportion infected
	@return Proportion infected
	*/
	public double proportionInfected()
	{
		return  (double)howManyInfected()/pop.size();
	}
	/** 
	Simulate one day.
	*/
	public void update()
	{
		ArrayList<Person> dead = new ArrayList<Person>();

		for (int i =0; i < pop.size(); i++)
		{
			if (isInfected(i))
			{
				if(generator.nextDouble()< recoveryRate)
				{
				pop.get(i).setInfected(false);
				}
			}
			else
			{
			 	int j = generator.nextInt(pop.size());
			 	if (isInfected(j))
			  	{
					if (generator.nextDouble() < infectionRate)
					{
					pop.get(i).setInfected(true);
					}
				}
			}
		}
	}
}
