import java.util.Scanner; // Scanner class is imported
class Distance // Class is declared
{
    public static void main ()
    {
        Scanner sc = new Scanner (System.in) ;
        System.out.println ( "Enter the intial velocity(in m/s):-" ) ;
        double u = sc.nextDouble() ; // Intitial velocity is tajen as input
        if ( u < 0 )
        {
            System.out.println ( "Error! The velocity should be positive" ) ; // Printing is done
        }
        else
        {
            System.out.println ( "Enter the acceleration of the body(in m/s2):-" ) ;
            double f = sc.nextDouble() ; // Accleration input
            System.out.println ( "Enter the initial time:-" ) ;
            int t1 = sc.nextInt() ; // Initial time input
            System.out.println ( "Enter the final time:-" ) ;
            int t2 = sc.nextInt() ; // Final time input
            if (t2<t1)
            {
                System.out.println ( "Error! The final time should be greater than the intial time" ) ; // Error if Final time is greater
            }
            else
            {
                int t = t2 - t1 ;
                double s = 0 ;
                s = u*t + (1/2)*f*(Math.pow(t,2)) ; // The distance is found
                System.out.println ( "The distance travelled in " + t + " seconds is " + s + " m" ) ; // The distance is printed
            }
        }
   } // Void function is printed out
} // Class ends