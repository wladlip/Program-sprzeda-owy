package Projekt;

/*
    Klasa przechowująca w tablicy wartości sprzedaży
    z określonej liczby dni i udostępnia metody do pobierania
    sumy i średniej wartości sprzedaży, a także najwyższej
    i najniższej wartości sprzedaży
*/

public class SalesData
{
    private double[] sales;

    public SalesData(double[] s)
    {
        sales = new double[s.length];

        for (int index = 0; index < s.length; index++)
            sales[index] = s[index];
    }

    public double getTotal()
    {
        double total = 0.0;

        for (int index = 0; index < sales.length; index++)
            total += sales[index];

        return total;
    }

    public double getAverage()
    {
        return getTotal() / sales.length;
    }

    public double getHighest()
    {
        double highest = sales[0];

        for (int index = 1; index < sales.length; index++)
        {
            if (sales[index] > highest)
                highest = sales[index];
        }

        return highest;
    }

    public double getLowest()
    {
       double lowest = sales[0];

       for (int index = 1; index < sales.length; index++)
       {
           if (sales[index] < lowest)
               lowest = sales[index];
       }

       return lowest;
    }
}
