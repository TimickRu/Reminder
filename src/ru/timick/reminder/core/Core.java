package ru.timick.reminder.core;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.util.ArrayList;

public class Core {
    private ArrayList<Recording> recs = new ArrayList<>();
    private Thread mainThread;

    public Core() {
        System.out.println("Reminder beta (build 111)");
        System.out.println("Reminder core started");

        try {
            DocumentBuilder documentBuilder = DocumentBuilderFactory.newInstance().newDocumentBuilder();
            Document document = documentBuilder.parse("recordings.xml");
            Node root = document.getDocumentElement();

            System.out.println("List of recordings: ");
            System.out.println();

            NodeList recordings = root.getChildNodes();

            for(int i = 0; i < recordings.getLength(); i++) {
                Node rec = recordings.item(i);
                if(rec.getNodeType() != Node.TEXT_NODE) {

                }
            }
        } catch(Exception e) {
            e.printStackTrace();
            System.out.println("Ошибка чтения базы данных");
        }


    }

    public void start() {
        mainThread = new Thread(new Runnable() {
            @Override
            public void run() {
                // Главный программный цикл
                while(true) {
                    // Program process
                }
            }
        });
    }

    public ArrayList<Recording> getRecordings() { return recs; }
}
