package hospital.management.system;import net.proteanit.sql.DbUtils;import javax.swing.*;import java.awt.*;import java.awt.event.ActionEvent;import java.awt.event.ActionListener;import java.sql.ResultSet;public class Employee_info extends JFrame {    Employee_info() {        JPanel panel = new JPanel();        panel.setBounds(3, 3, 895, 595);        panel.setBackground(new Color(109, 164, 170));        panel.setLayout(null);        add(panel);        JLabel labelName = new JLabel("EMPLOYEE DETAILS");        labelName.setBounds(300, 10, 500, 100);        labelName.setForeground(Color.white);        labelName.setFont(new Font("Raleway", Font.BOLD, 25));        panel.add(labelName);        JTable table = new JTable();        table.setBounds(10, 130, 880, 380);        table.setBackground(new Color(109, 164, 170));        table.setForeground(Color.white);        table.setFont(new Font("Tahoma", Font.BOLD, 14));        panel.add(table);        try {            conn c = new conn();            String q = "select * from EMP_INFO";            ResultSet resultSet = c.statement.executeQuery(q);            table.setModel(DbUtils.resultSetToTableModel(resultSet));        } catch (Exception e) {            e.printStackTrace();        }        JLabel label1 = new JLabel("Name");        label1.setBounds(33, 100, 100, 20);        label1.setForeground(Color.white);        label1.setFont(new Font("Tahoma", Font.BOLD, 14));        panel.add(label1);        JLabel label2 = new JLabel("Age");        label2.setBounds(160, 100, 100, 20);        label2.setForeground(Color.white);        label2.setFont(new Font("Tahoma", Font.BOLD, 14));        panel.add(label2);        JLabel label3 = new JLabel("Phone Number");        label3.setBounds(320, 100, 150, 20);        label3.setForeground(Color.white);        label3.setFont(new Font("Tahoma", Font.BOLD, 14));        panel.add(label3);        JLabel label4 = new JLabel("Salary");        label4.setBounds(470, 100, 150, 14);        label4.setForeground(Color.white);        label4.setFont(new Font("Tahoma", Font.BOLD, 14));        panel.add(label4);        JLabel label5 = new JLabel("Gmail");        label5.setBounds(600, 100, 200, 14);        label5.setForeground(Color.white);        label5.setFont(new Font("Tahoma", Font.BOLD, 14));        panel.add(label5);        JLabel label6 = new JLabel("Aadhar Number");        label6.setBounds(750, 100, 200, 20);        label6.setForeground(Color.white);        label6.setFont(new Font("Tahoma", Font.BOLD, 14));        panel.add(label6);        JButton button = new JButton("BACK");        button.setBounds(350, 520, 120, 30); // Adjusted position of the BACK button        button.setBackground(Color.BLACK);        button.setForeground(Color.white);        panel.add(button);        button.addActionListener(new ActionListener() {            @Override            public void actionPerformed(ActionEvent e) {                setVisible(false);            }        });        setUndecorated(true);        setSize(900, 600);        setLayout(null);        setLocation(300, 200);        setVisible(true);    }    public static void main(String[] args) {        new Employee_info();    }}