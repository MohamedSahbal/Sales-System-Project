/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programing.pkg62;

import java.awt.Color;
import java.awt.Font;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.UIManager;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;



/**
 *
 * @author pc
 */
public class fun {
    
    public static void saving(JTable x) {
    try{
    File file=new File(".\\src\\data.txt");
if(!file.exists()){
file.createNewFile() ;
}
    
    FileWriter fw =new FileWriter(file.getAbsoluteFile()) ;
    BufferedWriter bw = new BufferedWriter(fw);
    
    for(int i = 0 ;i < x.getRowCount();i++){
    for(int j = 0 ;j < x.getColumnCount();j++){
        bw.write((String)x.getModel().getValueAt(i , j)+"!@#");
    }
    bw.write("\n");
    }
    bw.close();
    fw.close();
    
    
    }catch(Exception ex){
        ex.printStackTrace();
    }
}
    
public static void loading(JTable x){

    String line;
BufferedReader reader;
    try{       
        reader = new BufferedReader(new FileReader(".\\src\\data.txt"));
        DefaultTableModel model=(DefaultTableModel) x.getModel();
        while((line = reader.readLine()) != null) 
        {
           model.addRow(line.split("!@#")); 
        }
        reader.close();
     }
    catch(IOException e){
        JOptionPane.showMessageDialog(null, "Error");
e.printStackTrace();

    }
}
    
public static void tdesign(JTable td,JScrollPane sc){

 DefaultTableCellRenderer hr = new DefaultTableCellRenderer();
        hr.setHorizontalAlignment(JLabel.CENTER);
        hr.setForeground(Color.red);
        hr.setFont(new Font("Algerian",Font.PLAIN,30));
        
        
        DefaultTableCellRenderer cr = new DefaultTableCellRenderer();
        cr.setHorizontalAlignment(JLabel.CENTER);
        cr.setForeground(Color.white);
        
        for(int i=0;i<td.getColumnCount();i=i+1){
        td.getColumnModel().getColumn(i).setHeaderRenderer(hr);
        td.getColumnModel().getColumn(i).setCellRenderer(cr);
        }
        
        sc.setOpaque(false);
        sc.getViewport().setOpaque(false);
        td.setOpaque(false);
        cr.setOpaque(false);

}
}
