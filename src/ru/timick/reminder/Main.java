package ru.timick.reminder;

import ru.timick.reminder.core.Core;
import ru.timick.reminder.gui.MainFrame;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;

public class Main {
    public static void main(String args[]) {
        Core core = new Core();
        core.start(); // Запускаем логическую часть приложения

        Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
        MainFrame mf = new MainFrame("Напоминания", core, screen); // Запускаем графическую часть

        //Создание иконки в трее
        PopupMenu popup = new PopupMenu();
        MenuItem exitItem = new MenuItem("Закрыть приложение");
        exitItem.addActionListener(new ActionListener() {
           public void actionPerformed(ActionEvent e) {
               System.exit(0);
           }
        });
        popup.add(exitItem);

        SystemTray systemTray = SystemTray.getSystemTray();
        URL imageURL = Main.class.getResource("icon.png");
        Image image = Toolkit.getDefaultToolkit().getImage(imageURL);
        TrayIcon trayIcon = new TrayIcon(image, "Reminder", popup);
        trayIcon.setImageAutoSize(true);
        trayIcon.addActionListener(new ActionListener() {
           @Override
           public void actionPerformed(ActionEvent e) {
               mf.setVisible(true);
           }
        });
        try {
            systemTray.add(trayIcon);
        } catch (AWTException e) {
            e.printStackTrace();
        }
    }
}
