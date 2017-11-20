package ru.timick.reminder.gui;

import ru.timick.reminder.core.Recording;

import javax.swing.*;
import java.awt.*;

public class Remind extends JPanel {
    private Recording rec;
    public Remind(Recording rec) {
        this.rec = rec;
    }
}
