package club.banyuan.Demo10.DownLoad;

import club.banyuan.Demo10.Tcp.Server;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Random;

public class UpServer {

    public static void main(String[] args) throws IOException {
        //获取socket对象
        ServerSocket serverSocket=new ServerSocket(1234);
        while (true) {
            Socket socket = serverSocket.accept();
            new Thread(new Runnable() {
                @Override
                public void run() {
                    try {
                        InputStream is = socket.getInputStream();
                        File file=new File("/Users/edz/IdeaProjects/show");
                        if(!file.exists()){
                            file.mkdirs();
                        }
                        String filename="banyuan"+System.currentTimeMillis()+new Random().nextInt(8888888);
                        FileOutputStream fos=new FileOutputStream(file+"/"+filename+".jpg");
                        int len=0;
                        byte [] by=new byte[1024];
                        while ((len=is.read(by))!=-1){
                            fos.write(by);
                        }
                        OutputStream outputStream = socket.getOutputStream();
                        outputStream.write("上传完成！！！".getBytes());
                    }catch (IOException e){
                        e.printStackTrace();
                    }

                }
            }).start();



        }

    }
}
