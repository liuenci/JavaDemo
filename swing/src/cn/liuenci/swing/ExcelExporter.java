package cn.liuenci.swing;

import java.awt.*;
import java.awt.event.*;
import java.io.*;
import javax.swing.*;
import javax.swing.table.*;
public class ExcelExporter  {
    public ExcelExporter() { }
    public void exportTable(JTable table, File file) throws IOException {
        TableModel model = table.getModel();
        FileWriter out = new FileWriter(file);
        
        for(int i=0; i < model.getColumnCount(); i++) {
            out.write(model.getColumnName(i) + "/t");
        }
        out.write("/n");
        for(int i=0; i< model.getRowCount(); i++) {
            for(int j=0; j < model.getColumnCount(); j++) {
                out.write(model.getValueAt(i,j).toString()+"/t");
            }
            out.write("/n");
        }
        out.close();
        System.out.println("write out to: " + file);
    }
    
    
    public static void main(String[] args) {
        String[][] data = { 
            { "Housewares",  "$1275.00" }, 
            { "Pets",         "$125.00" },
            { "Electronics", "$2533.00" },
            { "Mensware",     "$497.00" }
        };
        String[] headers = { "Department", "Daily Revenue" };

        JFrame frame = new JFrame("JTable to Excel Hack");
        DefaultTableModel model = new DefaultTableModel(data,headers);
        final JTable table = new JTable(model);
        JScrollPane scroll = new JScrollPane(table);

        JButton export = new JButton("Export");
        export.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                try {
                    ExcelExporter exp = new ExcelExporter();
                    exp.exportTable(table, new File("results.xls"));
                } catch (IOException ex) {
                    System.out.println(ex.getMessage());
                    ex.printStackTrace();
                }
            }
        });

        frame.getContentPane().add("Center",scroll);
        frame.getContentPane().add("South",export);
        frame.pack();
        frame.setVisible(true);
    }
}
