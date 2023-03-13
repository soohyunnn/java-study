package com.java.study.ch15;

import java.io.File;
import java.io.FilenameFilter;

public class FileEx7 {

    public static void main(String[] args) throws Exception {

        args = new String[4];
        args[0] = "File";


//        if (args.length != 1) {
//            System.out.println("UASGE : java FileEx7 pattern");
//            System.exit(0);
//        }

        String currDir = System.getProperty("user.dir");

        File dir = new File(currDir);
        System.out.println("dir :: " + dir);

        final String pattern = args[0];
        System.out.println("pattern :: " + pattern);

        String[] files = dir.list(new FilenameFilter() {
            @Override
            public boolean accept(File dir, String name) {
                return name.indexOf(pattern) != -1;
            }
        });

        System.out.println("files :: " + files.length);

        for (int i = 0; i < files.length; i++) {
            System.out.println(files[i]);
        }

    }

}
