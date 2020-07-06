
package jframe1;
import javax.swing.*;
import java.awt.*;
/**
 *
 * @author Vitor Fonseca
 */
public class primeiraJanela extends JFrame {
   JLabel rotulo1,rotulo2,rotulo3,rotulo4;
   public primeiraJanela(){
       super("Label");
       Container tela = getContentPane();
       tela.setBackground(Color.black);
       setLayout(null);
       //label
       rotulo1 = new JLabel("Nome");
       rotulo2 = new JLabel("Idade");
       rotulo3 = new JLabel("Telefone");
       rotulo4=new JLabel("Celular");
       //posição da label
       rotulo1.setBounds(50, 20, 80, 20);
       rotulo2.setBounds(50, 60, 80, 20);
       rotulo3.setBounds(50, 100, 100, 20);
       rotulo4.setBounds(50, 140, 80, 20);
       //cor da label
       rotulo1.setForeground(Color.red);
       rotulo2.setForeground(Color.blue);
       rotulo3.setForeground(new Color(190,152,142));
       rotulo4.setForeground(new Color(201,200,100));
       //fonte da label
       rotulo1.setFont(new Font("Arial",Font.BOLD,16));
       rotulo2.setFont(new Font("Comic Sans MS",Font.BOLD,16));
       rotulo3.setFont(new Font("Courier New",Font.BOLD,18));
       rotulo4.setFont(new Font("Times new Roman",Font.BOLD,20));
       tela.add(rotulo1);
       tela.add(rotulo2);
       tela.add(rotulo3);
       tela.add(rotulo4);
       setSize(400,250);
       setVisible(true);
       setLocationRelativeTo(null);
       DefinirIcone();
   }
  public void DefinirIcone(){
      ImageIcon icone = new ImageIcon("pokeball.png");
      setIconImage(icone.getImage());
      
  }
}
