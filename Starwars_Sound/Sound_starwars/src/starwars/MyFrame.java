package starwars;

import java.awt.*;


import java.awt.event.*; 
import java.io.File;

import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.*;

public class MyFrame extends JFrame implements ActionListener{

	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	JButton ButtonFly;				//gör så att man kan hämta Jbuttons globalt
	JButton ButtonFire;
	
	
	MyFrame(){
		
		
		JButton ButtonFly = new JButton("Fly");		//här skapas dom 2 kanpparna 
		JButton ButtonFire = new JButton("Fire");

		ButtonFly.setBounds(100, 100, 250, 100);	//sätter storlek på kanpparna 
		ButtonFly.addActionListener(this);		//lägger till en actionListener som lyssnar av när knappen trycks ner
		ButtonFly.setActionCommand("ButtonFly"); //länkar knappen till actionEvent
		ButtonFly.setText("Fly!"); // skriver ut texten Fly! på knappen 
		
		ButtonFly.setFocusable(false); // gör så om man håller övanför knappen försvinner en ruta 
		
		ButtonFly.setHorizontalTextPosition(JButton.CENTER);
		ButtonFly.setVerticalTextPosition(JButton.BOTTOM);			//Lägger till var texten ska skrivas 
		ButtonFly.setFont(new Font("Comic Sans",Font.BOLD,25));		//lägger till font och storlek
		ButtonFly.setIconTextGap(-15); // hur nära kanpparna är varandra 
		ButtonFly.setForeground(Color.green); // texten i kanppens färg
		ButtonFly.setBackground(new Color(86,137,188)); // knappens färg
		ButtonFly.setBorder(BorderFactory.createEtchedBorder()); // Lägger en border
		
		ButtonFire.setBounds(100, 200, 250, 100);  // samma som andra knappen
		ButtonFire.addActionListener(this);
		ButtonFire.setActionCommand("ButtonFire");
		ButtonFire.setText("Fire!");
		
		ButtonFire.setFocusable(false);
		
		ButtonFire.setHorizontalTextPosition(JButton.CENTER);
		ButtonFire.setVerticalTextPosition(JButton.BOTTOM);
		ButtonFire.setFont(new Font("Comic Sans",Font.BOLD,25));
		ButtonFire.setIconTextGap(-15);
		ButtonFire.setForeground(Color.red);
		ButtonFire.setBackground(new Color(86,137,188));
		ButtonFire.setBorder(BorderFactory.createEtchedBorder());
		
		
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	// programmet stoppas när man klickar på exit 
		this.setLayout(null);
		this.setSize(500,500); //lägger till hur stor panelen ska vara 
		this.setVisible(true); //gör så att man kan se panelen  
		this.add(ButtonFly); //lägger till knapparna på panelen
		this.add(ButtonFire);
		this.getContentPane().setBackground(Color.black); //lägger till bakgrunds färgen
	}

	
	public void actionPerformed(ActionEvent e) {			//Här är ett actionEvent som känner av när knappen "buttonfly" trycks ner och spelar upp det första ljudet
		if(e.getActionCommand()== "ButtonFly" ) try {
			Clip clip = AudioSystem.getClip();
			clip.open(AudioSystem.getAudioInputStream(new File("Tie_fighter_fly.wav")));
			clip.start();

			} catch (Exception exc) {
			System.out.println("The specified audio file is not supported.");
			ButtonFly.setEnabled(false);
			}
			else if (e.getActionCommand() == "ButtonFire") try {		//här är när den andra knappen trycks ner 
				Clip clip = AudioSystem.getClip();
				clip.open(AudioSystem.getAudioInputStream(new File("Tie_fighter_fire.wav")));
				clip.start();
				
			} catch (Exception exc) {
				System.out.println("The specified audio file is not supported.");
				ButtonFly.setEnabled(false);
				}
			}
			
		}	
	 
	
	
	

