/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package socket.api;

import java.io.DataInputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import javax.swing.JOptionPane;

/**
 *
 * @author mr-attitude
 */
public class Server {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            ServerSocket ss = new ServerSocket(8081);

            Socket s = ss.accept();

            DataInputStream DIS = new DataInputStream(s.getInputStream());
            String Data = (String) DIS.readUTF();
            System.out.println(Data);

            if (Data.equals("#end#")) {
                s.close();
            }

        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "jServerSocket", JOptionPane.ERROR_MESSAGE);
        }

    }

}
