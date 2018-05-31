/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package convbindec;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BoxLayout;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

/**
 *
 * @author Gamero
 */
public class ConvBinDec extends JFrame implements ActionListener{

    JLabel entrada, salida, paso, resultado;
    JTextField tEntrada;
    JRadioButton dec, bin;
    JButton convertir;
    JPanel izq = new JPanel();
    JPanel der = new JPanel();
    ButtonGroup botones = new ButtonGroup();
    
    public static void main(String[] args) {
        ConvBinDec ventana = new ConvBinDec("Conversor Entre Binario y Decimal");
        ventana.setBounds(200, 200, 500, 350);
        ventana.setVisible(true);
        ventana.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public ConvBinDec(String title) throws HeadlessException {
        super(title);
        Container cpane = getContentPane();
        //Panel izquierdo
        cpane.add(izq, BorderLayout.WEST);
        izq.setLayout(new BoxLayout(izq, BoxLayout.Y_AXIS));
        entrada = new JLabel("Entrada");
        tEntrada = new JTextField(8);
        tEntrada.setSize(new Dimension(150, 30));
        convertir = new JButton("Convertir");
        convertir.setName("frame");
        convertir.addActionListener(this);
        izq.add(entrada);
        izq.add(tEntrada);
        izq.add(convertir);
        
        der.setLayout(new BoxLayout(der, BoxLayout.Y_AXIS));
        
        
        cpane.add(der, BorderLayout.EAST);
        der.setLayout(new BoxLayout(der, BoxLayout.Y_AXIS));
    }
    
    

    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
