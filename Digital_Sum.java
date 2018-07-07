import java.util.Scanner; // Scanner class imported
class Digital_Sum // Class is declared
{
    public static void main () // Void function starts
    {
        Scanner sc = new Scanner (System.in) ;
        System.out.print ( "Enter a number M between 100 - 10000:- " ) ;
        int m = sc.nextInt() ; // m is taken as input
        System.out.println() ;
        System.out.print ( "Enter a positive number N less than 100:- " ) ;
        int n = sc.nextInt() ; // n is taken as input
        System.out.println () ;
        int term = 0 , sum = 0 ; // Variables are intialised 
        for ( int i = m + 1 ; ; i++ )
        {
            term = i ; // term variable is assighned to i
            while ( term > 0 )
            {
                sum = sum + ( term % 10 ) ; // Sum of the digits are found out
                term = term / 10 ;
            }
            if ( sum == n ) // if the sum mathches n then the match is found
            {
                System.out.println ( "The smallest number > M whose digital sum is N is " + i ) ;
                break;
            }
            sum = 0 ; // Making sum = 0 for next iteration
        }
        if ( sum != n ) // If not then the number is not found
        {
            System.out.println ( "NO such number > M could be FOUND whose digital sum is N" ) ; 
        }
    } // Void function ends
} // class ends