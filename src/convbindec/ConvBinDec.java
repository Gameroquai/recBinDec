/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package convbindec;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.LinkedList;
import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.colorchooser.AbstractColorChooserPanel;
import utils78.ES;

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
    JPanel izq1 = new JPanel();
    JPanel der1 = new JPanel();
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
        izq1.setSize(150, 27);
        izq1.setAlignmentX(LEFT_ALIGNMENT);
        izq1.setBorder(BorderFactory.createLineBorder(Color.yellow));
        entrada = new JLabel("Entrada");
        entrada.setAlignmentX(LEFT_ALIGNMENT);
        tEntrada = new JTextField(8);
        
        convertir = new JButton("Convertir");
        convertir.setName("frame");
        convertir.addActionListener(this);
        izq.add(entrada);
        izq.add(izq1);
        izq1.add(tEntrada);
        izq.add(convertir);
        
        //Panel derecho
        cpane.add(der, BorderLayout.EAST);
        der.setLayout(new BoxLayout(der, BoxLayout.Y_AXIS));
        salida = new JLabel("Salida");
        paso = new JLabel("Elige conversion");
        resultado = new JLabel(" ");
        dec = new JRadioButton("Decimal");
        bin = new JRadioButton("Binario");
        botones.add(dec);
        botones.add(bin);
        
        der.add(paso);
        der.add(der1);
        der1.add(dec);
        der1.add(bin);
        der.add(salida);
        der.add(resultado);
        
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        
    }
    
    public void binADec(){
        String entrada;
        int resultado = 0;
        int contador;
        char lista[];
        
        entrada = ES.leeDeTeclado("Introduzca el binario a convertir: ");
        
        lista = entrada.toCharArray();
        
        contador = lista.length-1;
        System.out.println(contador);
        for (int i = 0; i < lista.length; i++) {
            System.out.println(lista[i]);
            resultado += Integer.parseInt(String.valueOf(lista[i]))*Math.pow(2,contador);
            contador--;
            System.out.println(resultado);
        }
        System.out.println("El resultado es: "+resultado);
    }
    
    public void decABin(){
        int entrada,resto;
        int cociente=2;
        ArrayList resultado = new ArrayList();
        LinkedList lista = new LinkedList();
        
        entrada = ES.leeN("Introduzca un entero para pasar a binario: ");
        
        if(entrada < 0){
            entrada = Math.abs(entrada);
        }else if(entrada == 1){
            System.out.println("El resultado es: 1");
        }else if(entrada == 0){
            System.out.println("El resultado es: 0");
        }else{
            if(entrada < 0){
                entrada = Math.abs(entrada);
            }
            while(cociente > 1){
                cociente = entrada/2;
                resto = entrada%2;
                resultado.add(resto);
                entrada = cociente;
            }
            System.out.print("El resultado es: "+cociente);
            for (int i = (resultado.size()-1); i >= 0; i--) {
                System.out.print(resultado.get(i));
            }
        }
    }
    
}
