/**
 * A window is the top-level user interface element which displays a single widget.
 */
public class Window {

    private Widget widget;
    
    public Window(Widget widget) {
        this.widget = widget;
    }
    
    public void draw() {
        StdDraw.setCanvasSize(widget.getWidth(), widget.getHeight());
        StdDraw.setXscale(0, widget.getWidth());
        StdDraw.setYscale(1, widget.getHeight());
        
        widget.draw(0, widget.getHeight());
    }
    
    @Override
    public String toString() {
        return "Window[\n" + widget.toString() + "\n]";
    }
}
