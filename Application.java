public class Application {

    public static void main(String[] args) {
        Layout verticalLayout = new VerticalLayout();
        
        verticalLayout.add(new Label("Hello World!"));
        
        Layout labelLine = new HorizontalLayout();
        labelLine.add(new Label("This is some text."));
        Label disabledLabel = new Label("This is a disabled text.");
        disabledLabel.setEnabled(false);
        labelLine.add(disabledLabel);
        verticalLayout.add(labelLine);
        
        Layout disabledLabelLine = new HorizontalLayout();
        disabledLabelLine.add(new Label("This line …"));
        disabledLabelLine.add(new Label("… is disabled."));
        disabledLabelLine.setEnabled(false);
        verticalLayout.add(disabledLabelLine);
        
        Layout buttonLine = new HorizontalLayout();
        buttonLine.add(new Button("This is a button"));
        Button disabledButton = new Button("This is a disabled button");
        disabledButton.setEnabled(false);
        buttonLine.add(disabledButton);
        verticalLayout.add(buttonLine);
        
      //   zu Aufgabenteil (b)
        Layout textFieldLine = new HorizontalLayout();
        textFieldLine.add(new TextField());
        TextField disabledTextField = new TextField();
        disabledTextField.setEnabled(false);
        textFieldLine.add(disabledTextField);
        verticalLayout.add(textFieldLine);
        
        Window window = new Window(verticalLayout);
        window.draw();
        
        System.out.println(window.toString());
    }

}
