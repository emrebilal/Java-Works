import java.sql.*;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) throws SQLException {
        Connection connection = null;
        DbHelper helper = new DbHelper();
        try{
            connection = helper.getConnection();
            System.out.println("Successfully connected.");
        } catch (SQLException exception){
            helper.showErrorMessage(exception);
        }
        finally {
            connection.close();
        }

        //deleteData();
        //updateData();
        //insertData();
        selectDB();

    }

    public static void selectDB() throws SQLException {
        Connection connection = null;
        DbHelper helper = new DbHelper();
        Statement statement = null;
        ResultSet resultSet;
        try {
            connection = helper.getConnection();
            statement = connection.createStatement();
            resultSet = statement.executeQuery("select id,name,surname,city from customer ");
            ArrayList<Customer> customer = new ArrayList<Customer>();
            while (resultSet.next()) {
                customer.add(new Customer(
                        resultSet.getInt("id"),
                        resultSet.getString("name"),
                        resultSet.getString("surname"),
                        resultSet.getString("city")));
            }
            //getting data
            for (int i=0; i<customer.size(); i++){
                customer.get(i).getCustomer();
            }

        } catch (SQLException exception) {
            helper.showErrorMessage(exception);
        } finally {
            connection.close();
        }
    }

    public static void insertData() throws SQLException {
        Connection connection = null;
        DbHelper helper = new DbHelper();
        PreparedStatement statement = null;
        //ResultSet resultSet;
        try {
            connection = helper.getConnection();
            String sql = "insert into customer (id,name,surname,city) values(?,?,?,?)";
            statement = connection.prepareStatement(sql);
            statement.setInt(1,4);
            statement.setString(2,"Emre 4");
            statement.setString(3,"Bll");
            statement.setString(4,"Mersin");
            int result = statement.executeUpdate();
            System.out.println("Added");

        } catch (SQLException exception) {
            helper.showErrorMessage(exception);
        } finally {
            statement.close();
            connection.close();
        }
    }

    public static void updateData() throws SQLException{
        Connection connection = null;
        DbHelper helper = new DbHelper();
        PreparedStatement statement = null;
        //ResultSet resultSet;
        try {
            connection = helper.getConnection();
            String sql = "update customer set city='Aydın' where id = ?";
            statement = connection.prepareStatement(sql);
            statement.setInt(1,4);
            int result = statement.executeUpdate();
            System.out.println("Updated");

        } catch (SQLException exception) {
            helper.showErrorMessage(exception);
        } finally {
            statement.close();
            connection.close();
        }
    }

    public static void deleteData() throws SQLException{
        Connection connection = null;
        DbHelper helper = new DbHelper();
        PreparedStatement statement = null;
        //ResultSet resultSet;
        try {
            connection = helper.getConnection();
            String sql = "delete from customer where id = ?";
            statement = connection.prepareStatement(sql);
            statement.setInt(1,4);
            int result = statement.executeUpdate();
            System.out.println("Deleted");

        } catch (SQLException exception) {
            helper.showErrorMessage(exception);
        } finally {
            statement.close();
            connection.close();
        }
    }
}
