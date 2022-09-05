package Projekt;

/*
Używana jest tu klasa SalesData do wyświetlania sumy,
średniej, najwyższej i najniższej wartości sprzedaży.
*/
import javax.swing.*;

public class Sales
{
    public static void main(String[] args)
    {
       final int ONE_WEEK = 7;
       double[] sales = new double[ONE_WEEK];

       getValues(sales);

       SalesData week = new SalesData(sales);

        JOptionPane.showMessageDialog(null,
                String.format("Sprzedaż w sumie wyniosła %,.2f złotych.\n" +
                        "Srednia sprzedaż wyniosła %,.2f złotych.\n" +
                        "Najwyższa wartość sprzedaży wyniosła %,.2f złotych.\n" +
                        "Najniższa wartość sprzedaży wyniosła %,.2f złotych.",
                        week.getTotal(),
                        week.getAverage(),
                        week.getHighest(),
                        week.getLowest()));
        System.exit(0);
    }

    private static void getValues(double[] array)
    {
        String input;

        for (int i = 0; i < array.length; i++)
        {
            input = JOptionPane.showInputDialog("Podaj " +
                    "wartość sprzedaży z dnia numer " + (i + 1) + ":");
            array[i] = Double.parseDouble(input);
        }
    }
}
