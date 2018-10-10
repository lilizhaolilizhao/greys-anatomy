package com.github.ompc.greys.core.js;

import com.github.ompc.greys.core.GreysConsole;
import jline.console.ConsoleReader;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import static jline.console.KeyMap.CTRL_D;

public class ConsoleReaderTest {
    public static void main(String[] args) throws IOException {
        System.setProperty("jline.WindowsTerminal.directConsole", "false");
        ConsoleReader console = new ConsoleReader(System.in, System.out);
//        ConsoleReader reader = new ConsoleReader();
//        reader.readLine(">");
//        final String line = reader.readLine(">");
//        System.out.println(line);

        while (true) {
            final String line = console.readLine(">");
            System.out.println("test:" + line);
        }
    }
}
