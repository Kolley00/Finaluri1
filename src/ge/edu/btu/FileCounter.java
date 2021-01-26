package ge.edu.btu;

import java.io.File;

public class FileCounter {

    public static void main(String[] args) {


        String path = "BTU_DOCUMENTS/";
        getFile(path);


    }

    private static void getFile(String dirPath) {

        int count = 0;
        File f = new File(dirPath);
        File[] files = f.listFiles();

        if (files != null)
            for (File value : files) {

                if (value.toString().startsWith(dirPath + "btu")) {

                    count++;


                    if (value.isDirectory()) {
                        getFile(value.getAbsolutePath());
                    }


                }

            }

        System.out.println(count);
    }
}




//    static void count_file() {
//
//        File dir = new File("BTU_DOCUMENTS");
//        File[] foundFiles = dir.listFiles(new FilenameFilter() {
//            public boolean accept(File dir, String name) {
//                return name.startsWith("btu");
//            }
//        });
//
//        assert foundFiles != null;
//        for (File file : foundFiles) {
//
//            System.out.println(file);
//        }
//
//    }

