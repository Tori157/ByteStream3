package bytesteams3;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class LAB3 {

    public static void main(String[] args) {
        try {
            FileOutputStream file = new FileOutputStream("data.dat");
            DataOutputStream output = new DataOutputStream(file);
            output.writeUTF("Jim Henry");
            output.writeInt(30);
            output.writeDouble(65.5);
            output.writeChar('A');
        } catch (FileNotFoundException ex) {
            java.util.logging.Logger.getLogger(LAB3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IOException ex) {
            java.util.logging.Logger.getLogger(LAB3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        try {
            FileInputStream file = new FileInputStream("data.dat");
            DataInputStream input = new DataInputStream(file);
            
            System.out.println(input.readUTF());
            System.out.println(input.readInt());
            System.out.println(input.readDouble());
            System.out.println(input.readChar());
        
        }catch (FileNotFoundException ex) {
            java.util.logging.Logger.getLogger(LAB3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }catch (IOException ex) {
            java.util.logging.Logger.getLogger(LAB3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
    }
}
