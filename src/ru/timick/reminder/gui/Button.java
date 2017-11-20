package ru.timick.reminder.gui;

import javax.swing.*;
import java.awt.*;

public class Button extends JButton {
    public Font font;
    public Button(String s) {
        font = new Font("Calibri", 0, 16);
        this.setBorder(null);
        this.setMargin(new Insets(50,50,50,50));
        this.setFont(font);
        this.setBackground(new Color(190,190,190));
        this.setForeground(new Color(50,50,50));
        this.setText("<html><table cellpadding=10><tr><td>"+s+"</td></tr></table></html>");
    }
}
