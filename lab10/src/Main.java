import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        JFrame f = new JFrame("Registration Form");
        f.setSize(500,400);
        f.setLayout(null);

        JLabel l1 = new JLabel("Name:");
        l1.setBounds(60,50,100,30);
        f.add(l1);

        JTextField t1 = new JTextField();
        t1.setBounds(150,50,200,30);
        f.add(t1);

        JLabel l2 = new JLabel("Address:");
        l2.setBounds(60,100,100,30);
        f.add(l2);

        JTextArea ta = new JTextArea();
        ta.setBounds(150,100,200,60);
        f.add(ta);

        JLabel l3 = new JLabel("Gender:");
        l3.setBounds(60,180,100,30);
        f.add(l3);

        JRadioButton r1 = new JRadioButton("Male");
        r1.setBounds(150,180,80,30);
        JRadioButton r2 = new JRadioButton("Female");
        r2.setBounds(240,180,100,30);

        ButtonGroup bg = new ButtonGroup();
        bg.add(r1);
        bg.add(r2);

        f.add(r1);
        f.add(r2);

        JLabel l4 = new JLabel("Hobbies:");
        l4.setBounds(60,230,100,30);
        f.add(l4);

        JCheckBox c1 = new JCheckBox("Reading");
        c1.setBounds(150,230,100,30);
        JCheckBox c2 = new JCheckBox("Sports");
        c2.setBounds(260,230,100,30);

        f.add(c1);
        f.add(c2);

        JButton b = new JButton("Submit");
        b.setBounds(150,280,100,30);
        f.add(b);

        ImageIcon img = new ImageIcon("images.png");
        JLabel imgLabel = new JLabel(img);
        imgLabel.setBounds(0,0,500,400);
        f.add(imgLabel);

        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }
}