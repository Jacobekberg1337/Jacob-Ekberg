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
	JButton ButtonFly;				//g�r s� att man kan h�mta Jbuttons globalt
	JButton ButtonFire;
	
	
	MyFrame(){
		
		
		JButton ButtonFly = new JButton("Fly");		//h�r skapas dom 2 kanpparna 
		JButton ButtonFire = new JButton("Fire");

		ButtonFly.setBounds(100, 100, 250, 100);	//s�tter storlek p� kanpparna 
		ButtonFly.addActionListener(this);		//l�gger till en actionListener som lyssnar av n�r knappen trycks ner
		ButtonFly.setActionCommand("ButtonFly"); //l�nkar knappen till actionEvent
		ButtonFly.setText("Fly!"); // skriver ut texten Fly! p� knappen 
		
		ButtonFly.setFocusable(false); // g�r s� om man h�ller �vanf�r knappen f�rsvinner en ruta 
		
		ButtonFly.setHorizontalTextPosition(JButton.CENTER);
		ButtonFly.setVerticalTextPosition(JButton.BOTTOM);			//L�gger till var texten ska skrivas 
		ButtonFly.setFont(new Font("Comic Sans",Font.BOLD,25));		//l�gger till font och storlek
		ButtonFly.setIconTextGap(-15); // hur n�ra kanpparna �r varandra 
		ButtonFly.setForeground(Color.green); // texten i kanppens f�rg
		ButtonFly.setBackground(new Color(86,137,188)); // knappens f�rg
		ButtonFly.setBorder(BorderFactory.createEtchedBorder()); // L�gger en border
		
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
		
		
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	// programmet stoppas n�r man klickar p� exit 
		this.setLayout(null);
		this.setSize(500,500); //l�gger till hur stor panelen ska vara 
		this.setVisible(true); //g�r s� att man kan se panelen  
		this.add(ButtonFly); //l�gger till knapparna p� panelen
		this.add(ButtonFire);
		this.getContentPane().setBackground(Color.black); //l�gger till bakgrunds f�rgen
	}

	
	public void actionPerformed(ActionEvent e) {			//H�r �r ett actionEvent som k�nner av n�r knappen "buttonfly" trycks ner och spelar upp det f�rsta ljudet
		if(e.getActionCommand()== "ButtonFly" ) try {
			Clip clip = AudioSystem.getClip();
			clip.open(AudioSystem.getAudioInputStream(new File("Tie_fighter_fly.wav")));
			clip.start();

			} catch (Exception exc) {
			System.out.println("The specified audio file is not supported.");
			ButtonFly.setEnabled(false);
			}
			else if (e.getActionCommand() == "ButtonFire") try {		//h�r �r n�r den andra knappen trycks ner 
				Clip clip = AudioSystem.getClip();
				clip.open(AudioSystem.getAudioInputStream(new File("Tie_fighter_fire.wav")));
				clip.start();
				
			} catch (Exception exc) {
				System.out.println("The specified audio file is not supported.");
				ButtonFly.setEnabled(false);
				}
			}
			
		}	
	 
	
	
	

