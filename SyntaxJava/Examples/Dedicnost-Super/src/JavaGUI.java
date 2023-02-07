import java.awt.Label;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class JavaGUI {
	
    public static void main(String[] args) {

        final JFrame frame = new JFrame("Java GUI");
        JButton but1 = new JButton("Program A");
        but1.setBounds(0, 0, 200, 30);
        JButton but2 = new JButton("Program B");
        but2.setBounds(300, 0, 200, 30);

        //obsluha tlacitek


        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(630, 250);
        frame.add(but1);
        frame.add(but2);
        frame.setLayout(null);
		
		
        Label l1 = new Label ("Pole A");
        Label l2 = new Label ("Pole B");
        
        final TextArea t1 = new TextArea ();
        final TextArea t2 = new TextArea (); 
        
        l1.setBounds(0, 30, 100, 30);
        l2.setBounds(300, 30, 100, 30);
        
        t1.setBounds(0, 60, 300, 150);
        t2.setBounds(300, 60, 300, 150);       
        
        t1.setText("");
       
        frame.add(l1);
		frame.add(l2);
		
        frame.add(t1);
        frame.add(t2);


        but1.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){

                String text;

                KrabiceHmotnostSuper mojekrabice1 = new KrabiceHmotnostSuper(100);
                KrabiceHmotnostSuper mojekrabice2 = new KrabiceHmotnostSuper();
                KrabiceHmotnostSuper mojeKrychle = new KrabiceHmotnostSuper(3, 2);
                KrabiceHmotnostSuper mujKlon = new KrabiceHmotnostSuper(mojekrabice1);

                double obj;
                double hmot;

                text = "Trida s vyuzitim slova 'super'\n\n";

                //---------------------------------------------------------------------------------------------
                //obj =  100 ,klicove slovo 'super' vola konstruktor v 'KrabiceHmotnostSuper' kde je obsazen
                //hmot = 100, protoze trida 'KrabiceHmotnostSuper' je inicializovana konstruktorem s 1 parametrem
                obj = mojekrabice1.VratObjemKrabice();
                hmot = mojekrabice1.hmotnost;
                text = text + "mojekrabice1: - obj = " + obj + "  hmot = " +  hmot + "\n";

                //---------------------------------------------------------------------------------------------
                //obj = -1 ,  klicove slovo 'super' vola konstruktor v 'KrabiceHmotnostSuper' kde je obsazen
                //hmot = -1,  protoze trida 'KrabiceHmotnostSuper' je inicializovana pomoci konstruktoru bez parametru (=defaultni)
                obj = mojekrabice2.VratObjemKrabice();
                hmot = mojekrabice2.hmotnost;
                text = text + "mojekrabice2: - obj = " + obj + "  hmot = " +  hmot + "\n";

                //---------------------------------------------------------------------------------------------
                //obj =  3,   klicove slovo 'super' vola konstruktor v 'KrabiceHmotnostSuper' kde je obsazen - zde vrací 1. parametr
                //hmot = 2,   protoze trida 'KrabiceHmotnostSuper' je pouzit 2. parametr konstruktoru
                obj = mojeKrychle.VratObjemKrabice();
                hmot = mojeKrychle.hmotnost;
                text = text + "mojeKrychle   : - obj = " + obj + "  hmot = " +  hmot + "\n";

                //---------------------------------------------------------------------------------------------
                //obj = -1 ,  protoze trida 'KrabiceObjem'    je inicializovana pomoci defaultniho konstruktoru
                //hmot = 100, protoze trida 'KrabiceHmotnost' je klonovana k mojekrabice1 a vraci stejne vysledky
                obj = mujKlon.VratObjemKrabice();
                hmot = mujKlon.hmotnost;
                text = text + "mujKlon         : - obj = " + obj + "  hmot = " +  hmot + "\n";

                t1.setText(text);
            }
        });

        but2.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){

                String text;

                KrabiceHmotnost mojekrabice1 = new KrabiceHmotnost(100);
                KrabiceHmotnost mojekrabice2 = new KrabiceHmotnost();
                KrabiceHmotnost mojeKrychle = new KrabiceHmotnost(3, 2);
                KrabiceHmotnost mujKlon = new KrabiceHmotnost(mojekrabice1);

                double obj;
                double hmot;

                text = "Trida bez vyuziti slova 'super'\n\n";

                //---------------------------------------------------------------------------------------------
                //obj = -1 ,  protoze trida 'KrabiceObjem'    je inicializovana pomoci defaultniho konstruktoru'
                //hmot = 100, protoze trida 'KrabiceHmotnost' je inicializovana konstruktorem s 1 parametrem
                obj = mojekrabice1.VratObjemKrabice();
                hmot = mojekrabice1.hmotnost;
                text = text + "mojekrabice1: - obj = " + obj + "  hmot = " +  hmot + "\n";

                //---------------------------------------------------------------------------------------------
                //obj = -1 ,  protoze trida 'KrabiceObjem'    je inicializovana pomoci konstruktoru bez parametru (=defaultni)
                //hmot = -1,  protoze trida 'KrabiceHmotnost' je inicializovana pomoci konstruktoru bez parametru (=defaultni)
                obj = mojekrabice2.VratObjemKrabice();
                hmot = mojekrabice2.hmotnost;
                text = text + "mojekrabice2: - obj = " + obj + "  hmot = " +  hmot + "\n";

                //---------------------------------------------------------------------------------------------
                //obj = -1 ,  protoze trida 'KrabiceObjem'    je inicializovana pomoci defaultniho konstruktoru
                //hmot = 2,   protoze trida 'KrabiceHmotnost' je pouzit 2. parametr konstruktoru
                obj = mojeKrychle.VratObjemKrabice();
                hmot = mojeKrychle.hmotnost;
                text = text + "mojeKrychle   : - obj = " + obj + "  hmot = " +  hmot + "\n";

                //---------------------------------------------------------------------------------------------
                //obj = -1 ,  protoze trida 'KrabiceObjem'    je inicializovana pomoci defaultniho konstruktoru
                //hmot = 100, protoze trida 'KrabiceHmotnost' je klonovana k mojekrabice1 a vraci stejne vysledky
                obj = mujKlon.VratObjemKrabice();
                hmot = mujKlon.hmotnost;
                text = text + "mujKlon         : - obj = " + obj + "  hmot = " +  hmot + "\n";

                t2.setText(text);
            }
        });
		
        frame.add(t1);
		frame.add(t2);
			
	}

}