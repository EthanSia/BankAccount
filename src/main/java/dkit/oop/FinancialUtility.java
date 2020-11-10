package dkit.oop;

/**
 * This is a Utility class.
 * A Utility class provides methods that are generally useful for a particular App.
 * This particular Utility class contains methods that provide financial calculations
 * that are useful to the BankAccount App.
 *
 * The methods are declared 'static', so they can be called without an
 * object.  To call a static method, we simply use the name of the utility class
 * followed by the method name:
 *
 * e.g.    double d = FinancialUtility.percentOf( 12.0, 200.00 );
 *
 */

public class FinancialUtility
{
    /**
     Computes a percentage of an amount.
     @param percentage the percentage to apply (pass in 5.5 for 5.5%)
     @param amount the amount to which the percentage is applied
     @return the calculated percentage of the amount
     */
    public static double percentOf(double percentage, double amount)
    {
        return (percentage / 100) * amount;
    }

    //TODO
    // Write a utility method called average(double,double) that takes
    // two double amounts as arguments, and returns the straight average.
    // Remember that the method MUST be static.
    // Test it out by calling it from the main App.

    public static double average (double d1, double d2)
    {
        return(d1+d2)/2;

    }
}
