import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
public class Ex_33_JDBCTransactionHandling {
    public static void transferMoney(int fromAcc, int toAcc, double amount) {
        String url = "jdbc:mysql://localhost:3306/bankdb";
        String user = "root";
        String password = "root";
        try {
            Connection con = DriverManager.getConnection(url, user, password);
            con.setAutoCommit(false);
            PreparedStatement debit = con.prepareStatement("UPDATE accounts SET balance=balance-? WHERE account_no=?");
            debit.setDouble(1, amount);
            debit.setInt(2, fromAcc);
            PreparedStatement credit = con.prepareStatement("UPDATE accounts SET balance=balance+? WHERE account_no=?");
            credit.setDouble(1, amount);
            credit.setInt(2, toAcc);
            debit.executeUpdate();
            credit.executeUpdate();
            con.commit();
            System.out.println("Transaction Successful");
            con.close();
        } catch (Exception e) {
            System.out.println("Transaction Failed");
            e.printStackTrace();
        }
    }
    public static void main(String[] args) {
        transferMoney(1001, 1002, 500);
    }
}