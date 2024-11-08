
    // Calculate and return global GDP
    public double globalGdp()
    {
        double total = 0;  // Initialize total GDP
        for (EconomicData economicData : economicInfo)
        {
            total += economicData.getGdp();
        }  
        return total;
    }

    // Retrieve population by country name
    public String getCountryPopulation(String country)
    {
        for (EconomicData economicData : economicInfo)
        {
            if (economicData.getCountry().equals(country))
            {
                return "The population of " + country + " is " + economicData.getPopulation();
            }
        }
        return "Country not found.";
    }

    // String representation of all economic data
    public String toString()
    {
        String result = "";  // Initialize result string
        for (EconomicData economicData : economicInfo)
        {
            result += economicData;    // Append EconomicData info
            result += "----------\n";  // Separator between entries
        }
        return result;
    }
}
