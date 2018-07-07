import java.util.Scanner; // Scanner class is imported
class Bank // Class is declared
{
    Scanner sc = new Scanner (System.in) ;
    String depositerName , accountType , accountNumber ; // Variables are declared
    double balance = 0 ; // Variables are declared
    public void initial () // Variables intialisation
    {
        System.out.println ( "Enter the name of the depositer:-" ) ;
        depositerName = sc.nextLine() ;
        System.out.println () ;
        System.out.println ( "Enter the type of account:-" ) ;
        accountType = sc.nextLine() ;
        System.out.println () ;
        System.out.println ( "Enter the account number:-" ) ;
        accountNumber = sc.nextLine() ;
        System.out.println () ;
    }
    public double deposit () // Deposit amount input
    {
        System.out.print ( "Enter the amount to be deposited:- Rs. " ) ;
        double deposit = sc.nextDouble() ;
        balance = balance + deposit ; // Balance is found
        return balance ;
    }
    public double withdraw ()
    {
        System.out.println () ;
        System.out.print ( "Enter the amount to withdrawn:- Rs. " ) ;
        double withdraw = sc.nextDouble () ; // The amount is entered which is to be withdrawn
        if ( withdraw > balance )
        {
            System.out.println ( "Withdraw UNSUCESSFULL" ) ; // Printing is done
        }
        else
        {
            System.out.println ( "Withdraw SUCCESSFULL" ) ; // Printing is done
            balance = balance - withdraw ;
        }
        return balance ;
    }
    public void display () // The balance printing out method
    {
        System.out.println () ;
        System.out.println ( "The name of the depositer:- " + depositerName ) ;
        System.out.println ( "Balance:- Rs. " + balance ) ;
    }
    public void main () // Void main function starts
    {
        Bank obj = new Bank () ; // Object creation
        obj.initial() ; // Method called
        obj.deposit() ; // Method called
        obj.withdraw() ; // Method called
        obj.display() ; // Method called
    }
} // Class ends