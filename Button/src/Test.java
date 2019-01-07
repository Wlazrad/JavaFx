
import java.awt.Rectangle;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JToggleButton;

//klasa testowa dziedziczy po klasie JFrame z biblioteki swing, dzięki czemu obiekt klasy Test jest rodzajem okna
class Test extends JFrame {

    // w metodzie main jest tylko utworzenie naszego okna Test
    public static void main(String[] a) {
        // wywołanie konstruktora klasy Test
        new Test();
    }

    private JToggleButton przycisk = new JToggleButton("wciśnij mnie");

    // konstruktoor bezargumentowy
    public Test() {
        // rezygnujemy z layoutu, żeby ustawiać pozycję przycisku ręcznie
        setLayout(null);
        setSize(600, 600);

        // ustawiamy pozycję i rozmiar przycisku
        przycisk.setBounds(new Rectangle(100, 100, 150, 50));
        getContentPane().add(przycisk);

        // dodajemy słuchacza, który zmieni tekst na przycisku kiedy go
        // wciśniemy
        przycisk.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                // sprawdzanie stanu
                if (e.getStateChange() == ItemEvent.SELECTED) {
                    przycisk.setText("teraz przesuwaj");
                } else if (e.getStateChange() == ItemEvent.DESELECTED) {
                    przycisk.setText("wciśnij mnie");
                }
            }
        });

        // dodajemy słuchacza klawiatury do przesuwania
        przycisk.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {
            }

            @Override
            public void keyReleased(KeyEvent e) {
                // sprawdzamy czy przycisk jest wcisniety
                if (przycisk.isSelected()) {
                    // pobieramy kod klawisza
                    int keyCode = e.getKeyCode();
                    // pobieramy położenie i wielkość przycisku
                    Rectangle b = przycisk.getBounds();
                    // reagujemy na kod klawisza
                    switch (keyCode) {
                        case KeyEvent.VK_UP:
                            b.y -= 10;
                            break;
                        case KeyEvent.VK_DOWN:
                            b.y += 10;
                            break;
                        case KeyEvent.VK_LEFT:
                            b.x -= 10;
                            break;
                        case KeyEvent.VK_RIGHT:
                            b.x += 10;
                            break;
                    }
                    // ustawiamy nowe położenie i wielkosc przycisku
                    przycisk.setBounds(b);
                }

            }

            @Override
            public void keyPressed(KeyEvent e) {
            }

        });

        // pokazanie i ustawienie reakcji na zamknięcie okna
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}