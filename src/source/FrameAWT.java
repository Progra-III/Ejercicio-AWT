package source;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class FrameAWT extends Frame {

    public FrameAWT(String title) throws HeadlessException{
        super(title);
    }

    public void addComponents(){
        Panel panel= new Panel();
        panel.setLayout(new FlowLayout());
        panel.add(new Button("Button 1"));
        panel.add(new Button("Button 2"));
        panel.add(new Button("Button 3"));
        panel.add(new Button("Button 4"));
        panel.add(new Button("Button 5"));
        this.add(panel);

    }

    public static void createShowGUI(){
        FrameAWT frameAWT= new FrameAWT("Nombre de la ventana");
        frameAWT.setSize(500,500);
        frameAWT.setVisible(true);
        frameAWT.addComponents();
        frameAWT.pack();                                                    //importante tener orden
        frameAWT.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                super.windowClosing(e);
                System.exit(0);
            }
        });

    }
}
