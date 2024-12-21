// zu Aufgabenteil a)
public class AppTest {

    public static void main(String[] args) {
        
        VerticalLayout layout = new VerticalLayout();
        layout.add(new Label("Test"));
        
        System.out.println(layout.numberOfWidgets()); // Warum geht das ...
        
        Widget widget = layout;
        // System.out.println(widget.numberOfWidgets()); // ... aber das hier nicht?
        // WICHTIG: Damit die automatischen Tests funktionieren, muss in Ihrer Abgabe die vorherige Zeile auskommentiert sein.
    
    }

}
