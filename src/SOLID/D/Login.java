package SOLID.D;

public class Login {
    DbConnection dbConnection;

    public Login(DbConnection dbConnection) {
        this.dbConnection = dbConnection;
    }

    void doLogin(){
        dbConnection.getConn();
    }
}
