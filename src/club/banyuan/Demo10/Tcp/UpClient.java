package club.banyuan.Demo10.Tcp;

import java.io.*;
import java.net.Socket;

public class UpClient {
    public static void main(String[] args) throws IOException {
        FileInputStream fileInputStream=new FileInputStream(new File("1.jpg"));
        Socket socket=new Socket("127.0.0.1",3333);
        OutputStream os = socket.getOutputStream();
        int len=0;
        while ((len=fileInputStream.read())!=-1){
            os.write(len);
        }
        socket.shutdownOutput();
        InputStream is = socket.getInputStream();
        byte [] by=new byte[1024];
        int length=0;
        while ((length=is.read(by))!=-1){
            System.out.println(new String(by,0,length));
        }

        socket.close();
        fileInputStream.close();

    }
}
