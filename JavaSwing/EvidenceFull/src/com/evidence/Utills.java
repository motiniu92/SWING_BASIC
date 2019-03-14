
package com.evidence;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;


public class Utills {
    public static void writeToFile(String filename, List<Student> student){
    
    File destFile = new File(filename + ".txt");
        try {
            if( destFile.exists()== false){
        System.out.println("Wehad to make a new file");
        destFile.createNewFile();
    
    }
    
        PrintWriter out= new PrintWriter(new FileWriter(destFile, true));
        for(Student s: student){
        out.append(s.getId()+", "+s.getName()+ ", "+s.getAge()+", "+s.getEmail()+", "+s.getGender()+", "+s.getCourse()+", "+s.getRound()+", "+s.getComment()+"\n");
        
        }
        out.close();
        } catch (Exception e) {
            System.out.println("Could not log!");
        }
    
        
        } 
}
