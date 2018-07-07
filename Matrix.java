import java.util.Scanner; // Scanner class is imported
class Matrix // Class is declared
{
    public static void main () // Void function is declared
    {
        Scanner sc = new Scanner (System.in) ;
        System.out.println ( "Enter the no. of rows of the matrix:-" ) ;
        int row = sc.nextInt() ; // row is taken as input
        System.out.println ( "Enter the no. of column of the matrix:-" ) ;
        int col = sc.nextInt() ; // col is taken as input
        int[][] arr = new int [row][col] ; // New matrix of row and col is declared
        int[] sort = new int [row*col] ; // A array of [row*col] is declared
        int max = 0 , maxRow = 0 , maxCol = 0 , minCol = 0 , minRow = 0 , bucket = 0 , pos = 0 , post = 0  ; // Variables are intialised
        System.out.println () ;
        System.out.println ( "Enter the matrix:-" ) ;
        for ( int i = 0 ; i < row ; i++ )
        {
            for ( int j = 0 ; j < col ; j++ )
            {
                arr[i][j] = sc.nextInt() ; // Matrix array input
            }
        }
        int min = arr[0][0] ;
        for ( int i = 0 ; i < row ; i++ )
        {
            for ( int j = 0 ; j < col ; j++ )
            {
                sort[pos] = arr[i][j] ; // The elements of 2D array is taken into 1D array
                pos++ ;
            }
        }
        System.out.println () ;
        for ( int i = 0 ; i < row ; i++ )
        {
            for ( int j = 0 ; j < col ; j++ )
            {
                System.out.print ( arr[i][j] + " " ) ; // Printing of the 2D array is done
            }
            System.out.println () ;
        }
        for ( int i = 0 ; i < row ; i++ )
        {
            for ( int j = 0 ; j < col ; j++ )
            {
                if ( arr[i][j] > max ) // Max is found out from the 2D array
                {
                    max = arr[i][j] ;
                    maxRow = i ;
                    maxCol = j ;
                }
                else if ( arr[i][j] < min ) // Min is found out from the 2D array
                {
                    min = arr[i][j] ;
                    minRow = i ;
                    minCol = j ;
                }
            }
        }
        System.out.println () ;
        System.out.println ( "The largest element " + max + " is in row " +  ( maxRow + 1 ) + " and column " +  ( maxCol + 1 ) ) ; // Printing is done
        System.out.println ( "The smallest element " + min + " is in row " +  ( minRow + 1 ) + " and column " +  ( minCol + 1 ) ) ; // Printing is done
        for ( int i = 0 ; i < ( ( row * col ) - 1 ) ; i++ )
        {
            for ( int j = 0 ; j < ( ( row * col ) - 1 ) - i ; j++ )
            {
                if ( sort[j] < sort [j+1] ) // Sorting of the 1D array is done by Bubble sort method
                {
                    bucket = sort[j] ;
                    sort[j] = sort[j+1] ;
                    sort[j+1] = bucket ;
                }
            }
        }
        for ( int i = 0 ; i < row ; i++ )
        {
            for ( int j = 0 ; j < col ; j++ ) // The sorted array is converted into 2D array
            {
                arr[i][j] = sort[post] ;
                post++;
            }
        }
        System.out.println () ;
        for ( int i = 0 ; i < row ; i++ )
        {
            for ( int j = 0 ; j < col ; j++ ) // The sorted array is printed out
            {
                System.out.print ( arr[i][j] + " " ) ;
            }
            System.out.println () ;
        }
    } // Void function ebds
} // Class ends