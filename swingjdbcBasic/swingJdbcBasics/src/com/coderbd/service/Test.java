
package com.coderbd.service;

import com.coderbd.pojo.Students;


public class Test {
    public static void main(String[] args) {
        Students s1 = new Students();
        s1.setName("Motin");
        
        CommonDAO commonDAO = new StudentsService();
        commonDAO.save(s1);
    }
}
