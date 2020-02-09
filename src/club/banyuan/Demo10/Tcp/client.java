package club.banyuan.Demo10.Tcp;

import java.io.*;
import java.net.Socket;

public class client {
    public static void main(String[] args) throws IOException {
        Socket socket=new Socket("127.0.0.1",8888);
        File file=new File("e.txt");
        FileOutputStream fileOutputStream=new FileOutputStream(file);
        OutputStream os= socket.getOutputStream();
        os.write("你好服务器".getBytes());
        //获取服务器内容
        InputStream is =socket.getInputStream();
        int len=0;
        byte []by=new byte[1024];
        int read = is.read(by);
        System.out.println(new String(by,0,read));
        socket.close();
    }
}
