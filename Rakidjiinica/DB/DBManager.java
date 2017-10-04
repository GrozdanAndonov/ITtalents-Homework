package DB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;



import RakidjiinicaF.RakidjiinicaF.Threads.Bidon;
import RakidjiinicaF.RakidjiinicaF.Threads.KooperativenMagazin;
import RakidjiinicaF.RakidjiinicaF.Threads.StuklarskiCeh;
import RakidjiinicaF.RakidjiinicaF.Threads.ZavodZahar;

public class DBManager extends Thread {
	private static final String DB_IP = "127.0.0.1";// localhost
	private static final String DB_PORT = "3306";
	private static final String DB_DBNAME = "rakidjiinica";
	private static final String DB_USER = "root";
	private static final String DB_PASS = "";

	private Bidon bidon;
	private KooperativenMagazin magazin;
	private StuklarskiCeh ceh;
	private ZavodZahar zavod;

	public DBManager(Bidon b, KooperativenMagazin m, StuklarskiCeh c, ZavodZahar z) {
		this.bidon = b;
		this.magazin = m;
		this.ceh = c;
		this.zavod = z;
	}

	@Override
	public void run() {
		try  {
			Class.forName("com.mysql.jdbc.Driver");
			Connection connection = DriverManager.getConnection("jdbc:mysql://" + DB_IP + ":" + DB_PORT + "/" + DB_DBNAME, DB_USER, DB_PASS);
			PreparedStatement pstmt = null;
			while(true){
				sleep(5000);
				pstmt = connection.prepareStatement("INSERT INTO spravka(InputBidon,outputBidon,inputZaharnaFabrika,outputZaharnaFabrika) VALUES(?,?,?,?)");
				pstmt.setInt(1, this.bidon.getIncome()); 
				pstmt.setInt(2, this.bidon.getOutcome());
				pstmt.setInt(3, this.zavod.getIncomeTrustika());
				pstmt.setInt(4,this.zavod.getOutcomeSugar());
				if(pstmt.execute()){
					System.out.println("Inserted into spravka!");
					}else{
						System.err.println("2:Not INSERTED!");
					}
				pstmt = connection.prepareStatement("INSERT INTO spravkaceh(inputBotilki,outputBotilki,intputBurkani,outputBurkani) VALUES(?,?,?,?)");
				pstmt.setInt(1, this.ceh.getIncomeBottles());
				pstmt.setInt(2, this.ceh.getOutcomeBottles());
				pstmt.setInt(3, this.ceh.getIncomeJars());
				pstmt.setInt(4, this.ceh.getOutcomeJars());
				if(pstmt.execute()){
					System.out.println("Inserted into spravkaceh!");
				}else{
					System.err.println("2:Not INSERTED!");
				}
				
				pstmt = connection.prepareStatement("INSERT INTO spravkamagazin(inputRakia,solledRakia,inputKompot,solledKompot) VALUES(?,?,?,?)");
				pstmt.setInt(1, this.magazin.getIncomeRakia());
				pstmt.setInt(2, this.magazin.getOutcomeRakia());
				pstmt.setInt(3, this.magazin.getIncomeKompot());
				pstmt.setInt(4, this.magazin.getOutcomeKompot());
				if(pstmt.execute()){
						System.out.println("Inserted into spravkamagazin!");
					}else{
						System.err.println("2:Not INSERTED!");
					}
				this.magazin.setNewDay();
				this.ceh.setNewDay();
				this.bidon.setNewDay();
				this.zavod.setNewDay();
			}
			
			
		} catch (SQLException | InterruptedException | ClassNotFoundException e) {
			System.err.println("Error with the DB:" + e.getMessage());
		}

	}
}

// while(result.next()){
// String name = result.getString("name");
// String egn = result.getString("egn");
// System.out.println(name+":"+egn);
// }
// int result2=stmt.executeUpdate("UPDATE sports SET name='Rugbi' WHERE id=3;");
// System.out.println(result2+" rows updated");
//
//
