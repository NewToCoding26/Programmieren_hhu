1. Welche Unterklassen von `Widget` gibt es? Geben Sie auch die Klassen an, die nicht *direkt* von `Widget` erben.



2. Wenn Sie das Programm ausführen, wird mehrere Male `new widget constructed` ausgegeben (durch das `println` im `Widget`-Konstruktor). Wir rufen aber nie `new Widget()` auf. Warum gibt es die Ausgabe trotzdem?



3. Warum ist das Statement `Layout verticalLayout = new VerticalLayout();` in der `Application`-Klasse gültig?
Müsste es nicht `VerticalLayout verticalLayout = new VerticalLayout();` heißen?



4. Warum funktioniert `verticalLayout.add(new Label("Hello World!"));` in der `Application`-Klasse?
Es gibt doch weder in `Layout`, noch in `VerticalLayout` eine `add`-Methode, die ein `Label` als Parameter nimmt. (Oder doch?)



5. In der Klasse `Layout` ist die Instanzvariable `widgets` als `final` deklariert. Warum funktioniert `widgets.add(widget)` in der Methode `add`?
Schützt `final` die Variable `widgets` nicht vor einer Veränderung?



6. Schauen Sie sich die Klasse `AppTest` an. Warum funktioniert `widget.numberOfWidgets()` nicht?
In `widget` ist doch weiterhin ein `VerticalLayout`-Objekt gespeichert.



7. Warum ruft die `draw`-Methode der Klasse `Button` `isEnabled()` auf? Könnte man nicht auch `if(enabled)` schreiben?



8. Warum muss die Klasse `Widget` als `abstract` deklariert werden? Oder anders gefragt: Warum darf man nicht `public class Widget` schreiben?



9. In der Klasse `Widget` ist die Methode `toString` mit `@Override` annotiert, obwohl `Widget` gar kein `extends` verwendet.
Die `toString`-Methode welcher Klasse überschreibt `Widget`?



10. Warum kann die Methode `toString` in `Widget` die Methode `getWidth()` aufrufen?
Die Methode `getWidth()` hat doch gar keine Implementierung? (Oder doch?)



11. Warum muss die Klasse `Layout` als `abstract` deklariert? Sie enthält doch gar keine abstrakte Methode? (Oder doch?)



12. Die Klasse `Label` verwendet in Ihrer `draw`-Methode den ternären Operator. (Der ternäre Operator wurde ggf. nicht in der Vorlesung vorgestellt. Recherchieren Sie selbst, was das ist.)
Wie könnte `StdDraw.setPenColor(isEnabled() ? StdDraw.BLACK : StdDraw.GRAY);` alternativ mit einer if-Verzweigung ausgedrückt werden?


