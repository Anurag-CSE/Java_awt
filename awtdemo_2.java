import java.awt.*;


public class awtdemo_2 {

    public awtdemo_2() {
        Frame f = new Frame("learing awt");
        MenuBar mb = new MenuBar();
        Menu m = new Menu("file");
        MenuItem m1  = new MenuItem("open");
        MenuItem m2  = new MenuItem("Save");

        f.setMenuBar(mb);
        mb.add(m);
        m.add(m1);
        m.add(m2);

        f.setVisible(true);
        f.setLayout(new FlowLayout());
        f.setSize(500,500);        
    }

    public static void main(String[] args) {
        awtdemo_2 A =  new awtdemo_2();
    }
            
}