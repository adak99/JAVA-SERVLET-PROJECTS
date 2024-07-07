package registraion_form_project;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class connection_dataBase {
	public static Connection initializeDatabase()
			throws SQLException, ClassNotFoundException {
		System.out.println("trying to connect");

		String dbDriver = "com.mysql.cj.jdbc.Driver";
		String dbURL = "jdbc:mysql:// localhost:3306/";
		String dbName = "registraion";
		String dbUsername = "root";
		String dbPassword = "tiger";

		Class.forName(dbDriver);
		Connection con = DriverManager.getConnection(dbURL + dbName,
				dbUsername,
				dbPassword);
		System.out.println(con);

		return con;
	}
}