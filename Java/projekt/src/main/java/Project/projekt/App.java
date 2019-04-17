package Project.projekt;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
dbConn.accessDB();
//dbUser.addAcc("maciej", "pass", "email");
//dbUser.updPass("maciej", "123");
//dbUser.rUsr("maciej", "123");
dbConn.closeDb();
        
    }
}
