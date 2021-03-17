package miu.cs472;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import miu.cs472.DictionaryDB;

public class DbConnection {
	private Connection jdbcConnection;
	private String jdbcURL;
	private String jdbcUsername;
	private String jdbcPassword;

	public DbConnection(String jdbcURL, String jdbcUsername, String jdbcPassword) {
		this.jdbcURL = jdbcURL;
		this.jdbcUsername = jdbcUsername;
		this.jdbcPassword = jdbcPassword;
	}

	public Connection getConnetion() throws SQLException {
		//if (jdbcConnection == null || jdbcConnection.isClosed()) {
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				jdbcConnection = DriverManager.getConnection(jdbcURL, jdbcUsername, jdbcPassword);
			} catch (ClassNotFoundException e) {
				throw new SQLException(e);
			}
			
		//}
		return jdbcConnection;
	}

	public List<DictionaryDB> DictionaryList(String searchWord) throws SQLException {
		List<DictionaryDB> list = new ArrayList<>();
		
		Connection conn = this.getConnetion();
		String query = "Select * from entries where word = '" + searchWord +"'"		;
		//PreparedStatement pst = conn.prepareStatement(query);
	//	pst.setString(1, searchWord);
	
		
		Statement statement = conn.createStatement();
		ResultSet resultSet = statement.executeQuery(query);
		while (resultSet.next()) {
			String word = resultSet.getString("word");
			String wordtype = resultSet.getString("wordtype");
			String definition = resultSet.getString("definition");
			
			DictionaryDB DB_Data = new DictionaryDB(word,wordtype,definition) ;
			
			/*DB_Data.setWord(word);
			DB_Data.setWordtype(wordtype);
			DB_Data.setDefinition(definition);
			System.out.println(DB_Data.getWord() + "" + DB_Data.getWordtype()+"" +DB_Data.getDefinition());*/
			list.add(DB_Data);
		}
		resultSet.close();
		statement.close();
		if (null != conn) {
			conn.close();
		}
		return list;
	}
}
