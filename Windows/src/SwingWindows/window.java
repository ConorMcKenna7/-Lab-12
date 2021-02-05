package SwingWindows;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JFrame;
import javax.swing.JCheckBox;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JPanel;

public class window extends JFrame{

		private JButton okButton;
		private JButton cancelButton;
		private JButton helpButton;
		private JTextField xJTextField;
		private JTextField yJTextField;
		private JLabel xLabel;
		private JLabel yLabel;
		private JCheckBox snapJcheckBox;
		private JCheckBox showJcheckBox;
		private JPanel checkJPanel;
		private JPanel buttonJPanel;
		private JPanel fieldJPanel1;
		private JPanel fieldJPanel2;
		private JPanel finalJPanel;
		
			public window(){
				super("Align");
				
				snapJcheckBox = new JCheckBox("Snap to Grid");
				showJcheckBox = new JCheckBox("Show Grid");
				checkJPanel = new JPanel();
				checkJPanel.setLayout(new GridLayout(2,1));
				checkJPanel.add(showJcheckBox);
				
				// XPanelField
				xLabel = new JLabel("X: ");
				xJTextField = new JTextField("8",3);
				fieldJPanel1 = new JPanel();
				fieldJPanel1.setLayout(new FlowLayout());
				fieldJPanel1.add(xLabel);
				fieldJPanel1.add(xJTextField);
				
				//YPanelField

				yLabel = new JLabel("Y: ");
				yJTextField = new JTextField("8",3);
				fieldJPanel2 = new JPanel();
				fieldJPanel2.setLayout(new FlowLayout());
				fieldJPanel2.add(yLabel);
				fieldJPanel2.add(yJTextField);
				
				//FieldPanel
				finalJPanel=new JPanel();
				finalJPanel.setLayout(new BorderLayout());
				finalJPanel.add(fieldJPanel1,BorderLayout.NORTH);
				finalJPanel.add(fieldJPanel2,BorderLayout.SOUTH);

				//Button
				okButton = new JButton("Ok");
				cancelButton = new JButton("Cancel");
				helpButton = new JButton ("Help");
				buttonJPanel = new JPanel();
				buttonJPanel.setLayout(new GridLayout(3,1,10,5));
				buttonJPanel.add(okButton);
				buttonJPanel.add(cancelButton);
				buttonJPanel.add(helpButton);
				
				setLayout(new FlowLayout(FlowLayout.CENTER, 10,5));
				add(checkJPanel);
				add(finalJPanel);
				add(buttonJPanel);
				}
		}//end class

