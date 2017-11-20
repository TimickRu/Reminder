package ru.timick.reminder.gui;

import javax.swing.*;
import java.awt.*;

public class TitleLabel extends JLabel {
    public Font font;
    public TitleLabel(String s) {
        super(s);
        font = new Font("Calibri", 0, 32);
        this.setFont(font);
        this.setForeground(Color.DARK_GRAY);
    }
}
