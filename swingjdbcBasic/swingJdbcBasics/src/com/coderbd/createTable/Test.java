
package com.coderbd.createTable;

import com.coderbd.connection.DblConnection;

public class Test {
    public static void main(String[] args) {
        DblConnection.getDbCon();
        CreateStudentsTable.createStudentsTable();
    }
}
