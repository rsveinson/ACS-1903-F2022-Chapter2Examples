public class FuelConsumption
{
    public static void main(String[] args)
    {
        // Calculate fuel consumption as
        // litres per 100 kilometres travelled.
        // All calculations involve doubles.
        double litres;
        double km;
        double km100;
        double consumption;
        
        litres = 60.6;
        km = 500.25;
        km100 = km/100.0;
        
        // calculate litres per 100km
        consumption = litres/km100; 
        System.out.println(consumption);

    }
}
