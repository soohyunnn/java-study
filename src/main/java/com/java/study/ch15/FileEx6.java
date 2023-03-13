package com.java.study.ch15;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FileEx6 {
    static int found = 0;
    public static void main(String[] args) {
        //TODO. 테스트를 위해 주석처리
//        if (args.length != 2) {
//            System.out.println("UASGE : java FileEx6 DIRECTORY KEYWORD");
//            System.exit(0);
//        }

//        File dir = new File(args[0]);

        args = new String[4];
        args[0] = "/Users/pia/study/java-study/src/main/java/com/java/study/ch15";
        args[1] = "exit";

//        File dir = new File("/Users/pia/study/java-study/src/main/java/com/java/study/ch15");
        File dir = new File(args[0]);
        System.out.println("dir :: " + dir);
        String keyword = args[1];

        if (!dir.exists() || !dir.isDirectory()) {
            System.out.println("유효하지 않은 디렉토리입니다.");
            System.exit(0);
        }

        try {
            findInFiles(dir, keyword);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public static void findInFiles(File dir, String keyword) throws IOException {
        File[] files = dir.listFiles();

        for (int i = 0; i < files.length; i++) {
            if (files[i].isDirectory()) {
                findInFiles(files[i], keyword);
            } else {
                String filename = files[i].getName();
                String extension = filename.substring(filename.lastIndexOf(".") + 1);
                extension = "," + extension + ",";

                if(",java,txt,bak".indexOf(extension) == -1) continue;

                filename = dir.getAbsolutePath() + File.separator + filename;

                FileReader fr = new FileReader(files[i]);
                BufferedReader br = new BufferedReader(fr);

                String data = "";
                int lineNum = 0;

                while ((data = br.readLine()) != null) {
                    lineNum++;
                    if (data.indexOf(keyword) != -1) {
                        found++;
                        System.out.println("[" + filename + "(" + lineNum + ")" + "]" + data);
                    }
                }
                br.close();

            }
        };
    }


}
