import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.*;
import javax.swing.*;
import javax.swing.border.Border;



public class IP_finder extends JFrame implements ActionListener{
	
	JFrame frame;
	JButton btn;
	JTextField txt,txt1;
	JLabel label,label1,label2;
    Font font=new Font("san-serif",Font.BOLD,20);
	Font font1=new Font("Times-Roman ",Font.BOLD,30);
	
	
	
IP_finder(){
	ImageIcon img=new ImageIcon("8069532.png");
	Border border = BorderFactory.createLineBorder(Color.BLACK,2);
    Color bgcolor=new Color(242, 227, 219);
    label=new JLabel("Enter The Website URL..Here");
    label1=new JLabel("IP_:");
    label2=new JLabel();
    txt=new JTextField();
    txt1=new JTextField();

	frame=new JFrame("IP_FINDER");
	btn=new JButton("IP_FIND");
    
    
	txt1.setBounds(40,300,300,40);
	txt1.setEditable(false);
	txt1.setFont(font1);
	txt1.setBorder(border);;
	
	txt.setBounds(40,150,300,40);
    txt.setForeground(Color.black);
	txt.setFont(font);
	txt.setBorder(border);

	label1.setBounds(40,260,300,40);	
	label1.setFont(font);	
	label1.setForeground(Color.BLACK);
	
	label.setBounds(50,100,300,50);
	label.setFont(font);
	label.setForeground(Color.BLACK);
	
	btn.setBackground(Color.GREEN);
	btn.setSize(50, 50);
	btn.setFocusable(false);
	btn.setBounds(110,200, 150, 40);
	btn.addActionListener(this);
	btn.setFont(font);
	btn.setBorder(border);
	
    frame.setIconImage(img.getImage());
	frame.setSize(400,500);
	frame.setResizable(false);
	frame.getContentPane().setBackground(bgcolor);
	
	frame.add(label1);
	frame.add(btn);
	frame.add(label);
	frame.add(txt);
	frame.add(txt1);	
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	frame.setLayout(null);
	frame.setVisible(true);
    	
}





public static void main (String args[]) {
	
	new IP_finder();
	
	
}



@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	String url=txt.getText();
	try {
		
		InetAddress ia=InetAddress.getByName(url);  
		String ip=ia.getHostAddress();
		txt1.setText(ip);  
	}
	catch(UnknownHostException e1){
	    JOptionPane.showMessageDialog(this,e1.toString());  
	}
}



}

