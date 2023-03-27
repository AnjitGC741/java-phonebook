import javax.swing.*;
import javax.swing.JFrame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.table.*;

public class Phonebook implements ActionListener {
    JFrame frame = new JFrame("phonebook");
    JButton insertBtn = new JButton("Insert");
    JButton resetBtn = new JButton("Reset");
    JTextField nameInput = new JTextField();
    JTextField cityInput = new JTextField();
    JTextField phoneInput = new JTextField();
    JTable jt;
    void display(){
//        for name
        JLabel nameText = new JLabel("Name:");
        nameText.setBounds(50,50,200,20);
        frame.add(nameText);
        nameInput.setBounds(100,50,200,20);
        frame.add(nameInput);
//        for city
        JLabel cityText = new JLabel("City:");
        cityText.setBounds(50,80,200,20);
        frame.add(cityText);
        cityInput.setBounds(100,80,200,20);
        frame.add(cityInput);
//        for phone
        JLabel phoneText = new JLabel("Phone:");
        phoneText.setBounds(50,110,200,20);
        frame.add(phoneText);
        phoneInput.setBounds(100,110,200,20);
        frame.add(phoneInput);
        frame.setSize(400,500);
//        insert btn
        insertBtn.setBounds(100,140,90,20);
        insertBtn.addActionListener(this);
        frame.add(insertBtn);
//   reset btn
        resetBtn.setBounds(200,140,90,20);
        resetBtn.addActionListener(this);
        frame.add(resetBtn);
//        for table
        String column[]={"Name","City","Phone"};
        jt = new JTable(new DefaultTableModel(column, 0));
        JScrollPane sp=new JScrollPane(jt);
        sp.setBounds(50,170,300,150);
        frame.add(sp);
        frame.setLayout(null);
        frame.setTitle("phonebook");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.setVisible(true);
    }
    public void actionPerformed(ActionEvent e){
        if(e.getSource() ==  insertBtn)
        {
            String name = nameInput.getText();
            String city = cityInput.getText();
            String phone = phoneInput.getText();
            DefaultTableModel model = (DefaultTableModel) jt.getModel();
            model.addRow(new Object[]{name, city, phone});
            nameInput.setText("");
            cityInput.setText("");
            phoneInput.setText("");
        }
        if(e.getSource() == resetBtn)
        {
            nameInput.setText("");
            cityInput.setText("");
            phoneInput.setText("");
        }
    }
}

