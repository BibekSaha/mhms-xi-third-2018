import java.util.* ; // java.util package imported
class StringPro // class is declared
{
    public void upperCase (String str) // function upperCase is declared
    {
        String s = "" , partString = "" , addString = "" ; // variables are intialised
        int stringLength = 0 ;
        char ch = '\u0000' , firstChar = '\u0000' , changeCase = '\u0000' ;
        str = str + " " ;
        int length = str.length() ;
        System.out.print ( "The sentence in Uppercase:- " ) ;
        for ( int i = 0 ; i  < length ; i++ ) // Loop starts
        {
            ch = str.charAt(i) ; // Each character is pulled out
            if ( ch != ' ' )
            {
                s = s + ch ; // Each word is extracted
            }
            else
            {
                stringLength = s.length() ;
                firstChar = s.charAt(0) ; 
                changeCase = Character.toUpperCase(firstChar) ; // The first letter is convertes into upperCase
                partString = s.substring (1,stringLength) ;
                addString = changeCase + partString ;
                System.out.print ( addString + " " ) ; // The word is printed
                s = "" ;
            }
        }
    }
    public void vowels (String str)
    {
        String s = "" ; // Variables are declared
        char ch = '\u0000' , chWord = '\u0000' ;
        int vowelCount = 0 , conCount = 0 , stringLength = 0 ;
        str = str + " " ;
        str = str.replace ( "." , "" ) ; // The '.' is replaced if any
        str = str.replace ( "?" , "" ) ;
        int length = str.length() ;
        System.out.print ( "Word" + "\t" +  "Vowels " + "\t" + "consonants" + "\t" ) ; // The format is printed
        System.out.println() ;
        for ( int i = 0 ; i < length ; i++ )
        {
            ch = str.charAt(i);
            if ( ch != ' ' )
            {
                s = s + ch ; // Each character is extracted out
            }
            else
            {
                s = s.toUpperCase() ;
                stringLength = s.length() ;
                for ( int j = 0 ; j < stringLength ; j++ )
                {
                    chWord = s.charAt(j);
                    if ( ( chWord == 'A' ) || ( chWord == 'E' ) || ( chWord == 'I' ) || ( chWord == 'O' ) || ( chWord == 'U' ) ) // Checking for vowels
                    {
                        vowelCount++;
                    }
                    else 
                    {
                        conCount++;
                    }
                }
                System.out.print ( s + "\t" + vowelCount + "\t" + conCount + "\t" ) ; // The vowels and the consonants are printed
                System.out.println () ;
                s = "" ;
                vowelCount = 0 ;
                conCount = 0 ;
            }
        }
    }
    public void longest (String str)
    {
        String s = "" , longWord = "" ; // Variables are declared
        int stringLength = 0 , max = 0 ;
        char ch = '\u0000' ;
        str = str + " " ;
        int length = str.length() ;
        for ( int i = 0 ; i < length ; i++ )
        {
            ch = str.charAt(i) ; // Each character is extracted out
            if ( ch != ' ' )
            {
                s = s + ch ;
            }
            else
            {
                s = s.replace ( "." , "" ) ;
                s = s.replace ( "?" , "" ) ;
                stringLength = s.length() ;
                if ( stringLength > max )
                {
                    max = stringLength ;
                    longWord = s ; // Longest word is stored
                }
                s = "" ;
            }
        }
        System.out.println ( "Longest word in the sentence:- " + longWord ) ; // Longest word is printed
    }
    public void main () // void function starts
    {
        StringPro obj = new StringPro () ; // Object obj is created
        Scanner sc = new Scanner (System.in) ;
        System.out.println ("Enter the String:-") ;
        String str = sc.nextLine() ; // The string is intialised
        int length = str.length() ;
        char lastChar = str.charAt(length-1) ;
        if ( ( lastChar != '.' ) && ( lastChar != '?' ) ) // Checking for termination
        {
            System.out.println () ;
            System.out.println ( "ERROR, INPUTED STRING SHOULD BE TERMINATED BY '.' or '?'" ) ;
        }
        else
        { 
            System.out.println () ;
            obj.upperCase(str); // upperCase called
            System.out.println () ;
            System.out.println () ;
            obj.vowels(str); // vowels is called
            System.out.println () ;
            obj.longest(str); // longest is called
        }
    } // void function ends
} // class ends