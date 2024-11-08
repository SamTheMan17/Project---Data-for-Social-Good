/**
 * EconomicData class represents economic information of a country,
 * including country name, country code, GDP, and population.
 * Contains constructors to initialize values, getter methods to
 * retrieve individual attributes, and a toString method to 
 * provide a formatted string output of the data.
 */

public class EconomicData
{
    private String country;      // Country name
    private String code;         // Country code
    private double gdp;          // GDP in billions
    private int population;      // Population count

    // Default constructor with placeholder values
    public EconomicData()
    {
        country = "ERROR";       // Default country name
        code = "ERROR";          // Default country code
        gdp = 0.0;               // Default GDP value
        population = 0;          // Default population value
    }

    // Constructor with parameters for all fields
    public EconomicData(String country, String code, double gdp, int population)
    {
        this.country = country;          // Initialize country name
        this.code = code;                // Initialize country code
        this.gdp = gdp;                  // Initialize GDP
        this.population = population;    // Initialize population
    }

    // Getter for country name
    public String getCountry()
    {
        return country;
    }

    // Getter for country code
    public String getCode()
    {
        return code;
    }

    // Getter for GDP value
    public double getGdp()
    {
        return gdp;
    }

    // Getter for population count
    public int getPopulation()
    {
        return population;
    }

    // String representation of economic data
    public String toString()
    {
        return "Economic data for " + country + " (" + code + "): GDP of " + gdp +  " billion USD, Population of " + population + ".\n";
    }
}
