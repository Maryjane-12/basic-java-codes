import java.awt.*;
class HelloGUI extends Frame {
    public HelloGUI (){
        super("Log in Security Ver 1.0");
        Label l1,l2;
        TextField t1,t2;
        Button b1,b2;
        l1=new Label("USERNAME");
        l2= new Label("PASSWORD");
        t1 = new TextField(10);
        t2 = new TextField(10);

        t2.setEchoChar('*');
       
        b1= new Button("okay");
        b2= new Button("canceled");
        setLayout(new GridLayout(3,2));
        add(l1);
        add(l2);
        add(t1);
        add(t2);
        add(b1);
        add(b2);
        pack();
        show();

    }
    public static void main(String Mich[]){
            new HelloGUI();

    }
}
