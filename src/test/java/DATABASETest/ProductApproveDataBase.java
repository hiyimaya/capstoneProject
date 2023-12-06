package DATABASETest;

import UITests.utilities.ConfigurationReader;
import org.testng.annotations.Test;

import java.sql.*;

public class ProductApproveDataBase {

    String dataURL = ConfigurationReader.getProperty("database_url");
    String username = ConfigurationReader.getProperty("database_password");
    String password = ConfigurationReader.getProperty("database_username");
    Connection conn ;
    Statement stmt;
    //  ResultSet rs;

    private Connection connect() {

        try {
            conn = DriverManager.getConnection(dataURL, username, password);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return conn;
    }
   @Test
    public void testProductApprove() {
        connect();
        executeUpdate("UPDATE `hub_product` SET `product_listing_state` = 'APPROVED' ORDER BY `hub_product`.`id` DESC LIMIT 1");
    }

    private void executeUpdate(String dataquery) {
    try {
        stmt = conn.createStatement();
        stmt.executeUpdate(dataquery);
    } catch (SQLException e) {
        System.out.println(e.getMessage());


    }

}





}
