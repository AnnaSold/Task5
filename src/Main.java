import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Collections;
import java.util.Comparator;
import java.util.stream.Stream;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        List<Time> timeList = new ArrayList<>();
        String filename = "INPUT.TXT";
        Scanner scan = new Scanner(new File(filename));
        int n = scan.nextInt();
        for (int i = 0; i < n; i++) {
            int h = scan.nextInt();
            int m = scan.nextInt();
            int s = scan.nextInt();
            timeList.add(new Time( h,m,s));
        }
        scan.close();

        timeList.stream()
                .sorted() // сортировка по возрастанию
                .forEach(s->System.out.println(s));



        
    }
}