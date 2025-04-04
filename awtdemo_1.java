import java.awt.*;

public class awtdemo_1 extends Frame{
    awtdemo_1(){
        Label l1 = new Label("name");
        TextField t1 = new TextField();
        Button b1 = new Button("click me ");
        setSize(300 , 300);
        setVisible (true);
        setLayout (new FlowLayout());
        add (l1);
        add (t1);
        add (b1);

    }


    public static void main (String args[]){
        awtdemo_1 f = new awtdemo_1();
    }
}