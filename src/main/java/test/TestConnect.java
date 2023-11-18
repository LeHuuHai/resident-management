
package test;

import database.JDBCUtil;
import java.sql.Connection;

public class TestConnect {
    public static void main(String[] args){
        Connection c = JDBCUtil.getConnection();
        System.out.println(c);
    }
}
