package club.banyuan.Demo10.Tcp;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

    public static void main(String[] args) throws IOException {

        ServerSocket server=new ServerSocket(8888);
        Socket socket= server.accept();
        InputStream is= socket.getInputStream();
        OutputStream os=socket.getOutputStream();
        byte [] by=new byte[1024];
        int len=is.read(by);
        System.out.println(new String(by,0,len));
        os.write("你好客户段".getBytes());
        socket.close();
        server.close();


    }
}
