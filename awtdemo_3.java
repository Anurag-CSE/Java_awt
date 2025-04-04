import java.awt.*;

public class awtdemo_3 extends Frame{
    Label l1,l2;

    awtdemo_3(){
        l1 = new Label("welcome ");
        l1.setBounds(50,50,100,30);
        l2 = new  Label("name");

        TextField t1 = new TextField();
        Button b1 = new Button("submit");
        setSize(300 , 300);
        setVisible (true);
        setLayout (new FlowLayout());
        add (l1);
        add (l2);
        add(t1);
        add (b1);

        Choice c = new Choice();
        c.add("male");
        c.add("female");
        add(c);
    }


    public static void main (String args[]){
        awtdemo_3 f = new awtdemo_3();
    }
}