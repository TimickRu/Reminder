package ru.timick.reminder.gui;

import ru.timick.reminder.core.Core;
import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class MainFrame extends JFrame {
    private Container cont;
    private Core core;
    private TitleLabel title;
    private Button addRemindBtn, exitAppBtn, settingsBtn;
    private ArrayList<Remind> remindBox;
    private Dimension screen;
    private final int WIDTH = 350;
    private final int MARGIN = 10;
    private final int MARGIN_BOTTOM = 40;

    public MainFrame(String s, Core core, Dimension screen) {
        super(s);
        this.setResizable(false);
        this.setBounds(screen.width-(WIDTH), MARGIN, WIDTH, screen.height-(MARGIN+MARGIN_BOTTOM));
        this.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        cont = this.getContentPane();
        cont.setLayout(new FlowLayout());
        fillFrame();
        this.setVisible(true);
    }

    private void fillFrame() {
        title = new TitleLabel("Напоминания"); //Добавляем заголовок
        cont.add(title);
        addRemindBtn = new Button("Добавить напоминание");
        cont.add(addRemindBtn);
        settingsBtn = new Button("Настройки");
        cont.add(settingsBtn);
    }
}
