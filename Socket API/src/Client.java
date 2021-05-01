/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import javax.swing.JOptionPane;

/**
 *
 * @author mr-attitude
 */
public class Client {

    public static void main(String[] args) {
        try {
            Socket s = new Socket("localhost", 8081);
            DataOutputStream DOS = new DataOutputStream(s.getOutputStream());

            DOS.writeUTF("HandeShake From Socket");

            DOS.flush();
            DOS.close();

            s.close();
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "JServerSocket", JOptionPane.ERROR_MESSAGE);
        }
    }

}
