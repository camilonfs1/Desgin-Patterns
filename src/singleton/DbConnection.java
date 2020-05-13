package singleton;

public class DbConnection {
    private static  DbConnection connection;

    private DbConnection(){}
    public static DbConnection getInstance(){
        if(connection == null){
            connection = new DbConnection();
        }
        return connection;
    }
}
