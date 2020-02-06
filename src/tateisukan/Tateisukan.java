/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tateisukan;

import java.awt.*;
import java.awt.event.*;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
/**
 *
 * @author Andrew Doctor
 * adocto01@nyit.edu
 */
public class Tateisukan extends JFrame implements KeyListener, ActionListener{

    JTextArea displayArea;
    JTextField typingArea;
    static final String newline = System.getProperty("line.separator");
        JLabel label;

    
    public static void main(String[] args) throws Exception{
            try {
            //UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
            //UIManager.setLookAndFeel("com.sun.java.swing.plaf.gtk.GTKLookAndFeel");
            UIManager.setLookAndFeel("javax.swing.plaf.metal.MetalLookAndFeel");
        } catch (UnsupportedLookAndFeelException ex) {
            ex.printStackTrace();
        } catch (IllegalAccessException ex) {
            ex.printStackTrace();
        } catch (InstantiationException ex) {
            ex.printStackTrace();
        } catch (ClassNotFoundException ex) {
            ex.printStackTrace();
        }
        /* Turn off metal's use of bold fonts */
        UIManager.put("swing.boldMetal", Boolean.FALSE);
        
        //Schedule a job for event dispatch thread:
        //creating and showing this application's GUI.
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
            }
        });
            
           
    }
    private static void createAndShowGUI() {
        //Create and set up the window.
        Tateisukan frame = new Tateisukan("Tateisukan");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        //Set up the content pane.
        frame.addComponentsToPane();
        
        
        //Display the window.
        frame.pack();
        frame.setVisible(true);
    }
        private void addComponentsToPane() {
        
        JButton button = new JButton("Clear");
        button.addActionListener(this);
        
        typingArea = new JTextField(20);
        typingArea.addKeyListener(this);
        
        
        
        displayArea = new JTextArea();
        displayArea.setEditable(false);
        JScrollPane scrollPane = new JScrollPane(displayArea);
        scrollPane.setPreferredSize(new Dimension(375, 125));
        
        getContentPane().add(typingArea, BorderLayout.PAGE_START);
        getContentPane().add(scrollPane, BorderLayout.CENTER);
        getContentPane().add(button, BorderLayout.PAGE_END);
    }
    
    public Tateisukan(String name) {
        super(name);
    }
    
    
    /** Handle the key typed event from the text field. */
    public void keyTyped(KeyEvent e) {
        displayInfo(e, "");
    }
    
    /** Handle the key pressed event from the text field. */
    public void keyPressed(KeyEvent e) {
    //    displayInfo(e, "KEY PRESSED: ");
    }
    
    /** Handle the key released event from the text field. */
    public void keyReleased(KeyEvent e) {
    //    displayInfo(e, "KEY RELEASED: ");
    }
    
    /** Handle the button click. */
    public void actionPerformed(ActionEvent e) {
        //Clear the text components.
        displayArea.setText("");
        typingArea.setText("");
        
        //Return the focus to the typing area.
        typingArea.requestFocusInWindow();
    }

private void displayInfo(KeyEvent e, String keyStatus){
        
        //You should only rely on the key char if the event
        //is a key typed event.
        int id = e.getID();
        String keyString;
        String d;
        if (id == KeyEvent.KEY_TYPED) {
            char c = e.getKeyChar();
            switch(c){
                case '1':
                    c = 'め';
                    break;
                case 'q': 
                    c = 'た';
                    break;
                case 'a': 
                    c = 'ち';
                    break;
                case 'z':
                    c = 'つ';
                    break;
                case '2':
                    c = 'ふ';
                    break;     
                case 'w':
                    c = 'て';
                    break;   
                case 's':
                    c = 'と';
                    break;     
                case 'x':
                    c = 'さ';
                    break;    
                case '3':
                    c = 'あ';
                    break;      
                case 'e':
                    c = 'い';
                    break;     
                case 'd':
                    c = 'し';
                    break;
                case 'c':
                    c = 'そ';
                    break;    
                case '4':
                    c = 'う';
                    break;    
                case 'r':
                    c = 'す';
                    break; 
                case 'f':
                    c = 'は';
                    break;     
                case 'v':
                    c = 'ひ';
                    break;     
                case '5':
                    c = 'え';
                    break;    
                case 't':
                    c = 'か';
                    break;    
                case 'g':
                    c = 'き';
                    break;    
                case 'b':
                    c = 'こ';
                    break;
                case '6':
                    c = 'お';
                    break;            
                case 'y':
                    c = 'ん';
                    break;            
                case 'h':
                    c = 'く';
                    break;            
                case 'n':
                    c = 'み';
                    break;            
                case '7':
                    c = 'や';
                    break;            
                case 'u':
                    c = 'な';
                    break;     
                case 'j':
                    c = 'ま';
                    break;     
                case 'm':
                    c = 'も';
                    break;     
                case '8':
                    c = 'ゆ';
                    break;     
                case 'i':
                    c = 'に';
                    break;     
                case 'k':
                    c = 'の';
                    break;     
                case ',':
                    c = 'ね';
                    break;     
                case '9':
                    c = 'よ';
                    break;    
                case 'o':
                    c = 'ら';
                    break;    
                case 'l':
                    c = 'り';
                    break;    
                case '.':
                    c = 'る';
                    break;    
                case '0':
                    c = 'わ';
                    break;    
                case 'p':
                    c = 'せ';
                    break;    
                case ';':
                    c = 'れ';
                    break;    
                case '/':
                    c = 'め';
                    break;    
                case '-':
                    c = 'ほ';
                    break; 
                case '[':
                    c = 'ﾞ';
                    break; 
                case '\'':
                    c = 'け';
                    break;    
                case '=':
                    c = 'へ';
                    break;     
                case ']':
                    c = 'ﾟ';
                    break;     
                case '\\':
                    c = 'む';
                    break;    
                case '?':
                    c = 'ろ';
                    break;    
                case '_':
                    c = '¥';
                    break;   
                case '{':
                    c = '「';
                    break;    
                case '\"':
                    c = '」';
                    break;            
                default:
                    break;
            }
            keyString = c + "";
        } else {
            int keyCode = e.getKeyCode();
            keyString = "key code = " + keyCode
                    + " ("
                    + KeyEvent.getKeyText(keyCode)
                    + ")";
        }
       
        
        int modifiersEx = e.getModifiersEx();
        String modString = "extended modifiers = " + modifiersEx;
        String tmpString = KeyEvent.getModifiersExText(modifiersEx);
        if (tmpString.length() > 0) {
            modString += " (" + tmpString + ")";
        } else {
            modString += " (no extended modifiers)";
        }
        
        String actionString = "action key? ";
        if (e.isActionKey()) {
            actionString += "YES";
        } else {
            actionString += "NO";
        }
        
        String locationString = "key location: ";
        int location = e.getKeyLocation();
        if (location == KeyEvent.KEY_LOCATION_STANDARD) {
            locationString += "standard";
        } else if (location == KeyEvent.KEY_LOCATION_LEFT) {
            locationString += "left";
        } else if (location == KeyEvent.KEY_LOCATION_RIGHT) {
            locationString += "right";
        } else if (location == KeyEvent.KEY_LOCATION_NUMPAD) {
            locationString += "numpad";
        } else { // (location == KeyEvent.KEY_LOCATION_UNKNOWN)
            locationString += "unknown";
        }
        
        displayArea.append(keyString);
        displayArea.setCaretPosition(displayArea.getDocument().getLength());
    }
}


/* Citation:
 * (1.) Copyright (c) 1995, 2008, Oracle and/or its affiliates. All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions
 * are met:
 *
 *   - Redistributions of source code must retain the above copyright
 *     notice, this list of conditions and the following disclaimer.
 *
 *   - Redistributions in binary form must reproduce the above copyright
 *     notice, this list of conditions and the following disclaimer in the
 *     documentation and/or other materials provided with the distribution.
 *
 *   - Neither the name of Oracle or the names of its
 *     contributors may be used to endorse or promote products derived
 *     from this software without specific prior written permission.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS
 * IS" AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO,
 * THE IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR
 * PURPOSE ARE DISCLAIMED.  IN NO EVENT SHALL THE COPYRIGHT OWNER OR
 * CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL,
 * EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO,
 * PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR
 * PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF
 * LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING
 * NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS
 * SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 */