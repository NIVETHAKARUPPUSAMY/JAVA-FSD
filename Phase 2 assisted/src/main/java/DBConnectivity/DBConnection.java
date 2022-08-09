package DBConnectivity;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


@WebServlet("/dBConnection")
public class DBConnection extends HttpServlet {
	private Connection connection;
    
    public DBConnection(String dbURL, String user, String pwd) throws ClassNotFoundException, SQLException{
            
            Class.forName("com.mysql.jdbc.Driver");
            this.connection = DriverManager.getConnection(dbURL, user, pwd);
    }
    
    public Connection getConnection(){
            return this.connection;
    }
    
    public void closeConnection() throws SQLException {
            if (this.connection != null)
                    this.connection.close();
    }
}