import java.io.File;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Программа поиска файлов по имени");
        System.out.println("Введите путь для поиска файла:");
        String directory = sc.nextLine();
        System.out.println("Введите имя файла с расширением:");
        String fileName = sc.nextLine();
        File fileFind = FileUtil.findFile(directory,fileName);
        if (fileFind != null)
            System.out.println("Файл найден. Путь: " + fileFind.getPath());
        else System.out.println("Файл не найден!!!");
    }
}
