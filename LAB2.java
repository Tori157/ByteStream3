package bytesteams3;

import java.io.*;

public class LAB2 {

    public static void main(String[] args) {
        try {
            FileOutputStream output = new FileOutputStream("data.dat");
            String s = "Hello World!";
            byte[] b = s.getBytes();
            output.write(b);
        } catch (FileNotFoundException ex) {
            java.util.logging.Logger.getLogger(LAB3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IOException ex) { 
            java.util.logging.Logger.getLogger(LAB3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);

        }

        try {
            FileInputStream input = new FileInputStream("data.dat");
            int value;
            while ((value = input.read()) != -1) {
                System.out.print((char) value);
            }
            input.close();
        } catch (FileNotFoundException ex) {
            java.util.logging.Logger.getLogger(LAB3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IOException ex) { 
            java.util.logging.Logger.getLogger(LAB3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

    }

}
