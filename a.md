1. Welche Unterklassen von `Widget` gibt es? Geben Sie auch die Klassen an, die nicht *direkt* von `Widget` erben.

    Direkte Unterklassen von "Widget": "Label", "Button", "Layout"
    Indirekte Unterklassen von "Widget": "HorizontalLayout", "VerticalLayout"


2. Wenn Sie das Programm ausführen, wird mehrere Male `new widget constructed` ausgegeben (durch das `println` im `Widget`-Konstruktor). Wir rufen aber nie `new Widget()` auf. Warum gibt es die Ausgabe trotzdem?

    Der Konstruktor von "Widget" wird immer dann ausgeführt, wenn eine Klasse, die von "Widget" erbt, instanziiert wird. 
    Das liegt daran, dass der Konstruktor der Oberklasse automatisch vor dem Konstruktor der Unterklasse aufgerufen wird.


3. Warum ist das Statement `Layout verticalLayout = new VerticalLayout();` in der `Application`-Klasse gültig?
Müsste es nicht `VerticalLayout verticalLayout = new VerticalLayout();` heißen?

    Dies ist gültig, da "VerticalLayout" eine Spezialisierung von "Layout" ist. Variablen vom Typ der Oberklasse können auch Objekte 
    einer Unterklasse speichern.


4. Warum funktioniert `verticalLayout.add(new Label("Hello World!"));` in der `Application`-Klasse?
Es gibt doch weder in `Layout`, noch in `VerticalLayout` eine `add`-Methode, die ein `Label` als Parameter nimmt. (Oder doch?)

    Die Methode "add" in der Klasse "Layout" akzeptiert Objekte vom Typ "Widget". Da "Label" eine Unterklasse von "Widget" ist, kann ein 
    "Label"-Objekt problemlos übergeben werden.


5. In der Klasse `Layout` ist die Instanzvariable `widgets` als `final` deklariert. Warum funktioniert `widgets.add(widget)` in der Methode `add`?
Schützt `final` die Variable `widgets` nicht vor einer Veränderung?

    "final" stellt sicher, dass die Referenz der Liste "widgets" unverändert bleibt, erlaubt aber Änderungen am Inhalt der Liste selbst, 
    wie das Hinzufügen oder Entfernen von Elementen.



6. Schauen Sie sich die Klasse `AppTest` an. Warum funktioniert `widget.numberOfWidgets()` nicht?
In `widget` ist doch weiterhin ein `VerticalLayout`-Objekt gespeichert.

    Die Methode "numberOfWidgets()" ist in der Klasse "Layout" definiert und daher nur zugänglich, wenn die Referenz auch den Typ "Layout"
    oder eine Unterklasse davon hat. Da "widget" als "Widget"-Referenz deklariert ist, kennt diese Referenz die Methode nicht.



7. Warum ruft die `draw`-Methode der Klasse `Button` `isEnabled()` auf? Könnte man nicht auch `if(enabled)` schreiben?

    Das Attribut "enabled" ist privat, daher kann es nur innerhalb der Klasse "Widget" direkt verwendet werden. "isEnabled()" ist eine 
    öffentliche Methode, die auch in Unterklassen den Zugriff auf dieses Attribut ermöglicht.


8. Warum muss die Klasse `Widget` als `abstract` deklariert werden? Oder anders gefragt: Warum darf man nicht `public class Widget` schreiben?

    "Widget" enthält abstrakte Methoden wie "getWidth()", "getHeight()" und "draw()", die keine Implementierung haben. Klassen mit 
    abstrakten Methoden müssen selbst als "abstract" markiert werden.


9. In der Klasse `Widget` ist die Methode `toString` mit `@Override` annotiert, obwohl `Widget` gar kein `extends` verwendet.
Die `toString`-Methode welcher Klasse überschreibt `Widget`?

    "toString" überschreibt die Methode aus der Klasse "Object", die jede Java-Klasse automatisch erbt.



10. Warum kann die Methode `toString` in `Widget` die Methode `getWidth()` aufrufen?
Die Methode `getWidth()` hat doch gar keine Implementierung? (Oder doch?)

    "getWidth()" ist eine abstrakte Methode, die von allen konkreten Unterklassen von "Widget" implementiert wird. Bei einem Aufruf von 
    "toString" wird die konkrete Implementierung in der entsprechenden Unterklasse verwendet.


11. Warum muss die Klasse `Layout` als `abstract` deklariert? Sie enthält doch gar keine abstrakte Methode? (Oder doch?)

    "Layout" erbt die abstrakten Methoden von "Widget", wie "getWidth()", "getHeight()" und "draw()". Da diese Methoden in "Layout" nicht 
    implementiert werden, bleibt die Klasse selbst abstrakt.


12. Die Klasse `Label` verwendet in Ihrer `draw`-Methode den ternären Operator. (Der ternäre Operator wurde ggf. nicht in der Vorlesung vorgestellt. Recherchieren Sie selbst, was das ist.)
Wie könnte `StdDraw.setPenColor(isEnabled() ? StdDraw.BLACK : StdDraw.GRAY);` alternativ mit einer if-Verzweigung ausgedrückt werden?

     if (isEnabled()) {
        StdDraw.setPenColor(StdDraw.BLACK);
    } else {
        StdDraw.setPenColor(StdDraw.GRAY);
    }


