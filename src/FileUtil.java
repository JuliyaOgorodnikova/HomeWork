import java.io.File;

public class FileUtil {
    public static File findFile(String dir, String fileName) {
        File fileFind = null;

        try {
            File folder = new File(dir);
            File[] listOfFiles = folder.listFiles();

            if (listOfFiles.length != 0 || listOfFiles != null) {
                for (int i = 0; i < listOfFiles.length; i++) {
                    if (listOfFiles[i].isFile()) {
                        if (listOfFiles[i].getName().matches(fileName)) {
                            return listOfFiles[i];
                        }
                    } else {
                        fileFind = findFile(listOfFiles[i].toPath().toString(), fileName);
                        if (fileFind != null) break;
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return fileFind;
    }
}


