package club.banyuan.Demo10.Tcp;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class UpServer {
    public static void main(String[] args) throws IOException {
        FileOutputStream fileOutputStream=new FileOutputStream(new File("src/club/banyuan/Demo10/Tcp/server.jpg"));

        ServerSocket serverSocket=new ServerSocket(3333);
        Socket socket = serverSocket.accept();
        InputStream is = socket.getInputStream();
        int len=0;
        while ((len=is.read())!=-1){
            fileOutputStream.write(len);
        }
        OutputStream os = socket.getOutputStream();
        os.write("上传成功！！！".getBytes());
    }
}
