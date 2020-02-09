package club.banyuan.Demo10.DownLoad;

import java.io.*;
import java.net.Socket;

public class UpClient {
    public static void main(String[] args) throws IOException {
        FileInputStream fis=new FileInputStream(new File("1.jpg"));
        //写入图片
        Socket socket=new Socket("127.0.0.1",1234);
        OutputStream os = socket.getOutputStream();
        int len=0;
        byte [] by=new byte[1024];
        while ((len=fis.read(by))!=-1){
            os.write(by);
        }
        socket.shutdownOutput();
        //获取服务器内容
        InputStream is = socket.getInputStream();
        while ((len=is.read(by))!=-1){
            System.out.println(new String(by,0,len));
        }


    }



}
