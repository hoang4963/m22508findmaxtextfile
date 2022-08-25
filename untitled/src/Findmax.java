import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Findmax {
    public static void main(String[] args) {
        System.out.println("Max cua file la: " + findMax(readfile("C:\\Users\\Acer\\Desktop\\codegym\\Module2APJ\\250822\\practice\\findmax\\findmax.txt")));

    }
    public static int findMax(List<Integer> list){
        int max = list.get(0);
        for (Integer integer : list) {
            if (integer > max) {
                max = integer;
            }
        }
        return max;
    }
    public static List<Integer> readfile(String filePath){
        List<Integer> listnumber = new ArrayList<>();
        try {
            File file = new File(filePath);
            if (!file.exists()){
                throw new FileNotFoundException();
            }
            BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                listnumber.add(Integer.parseInt(line));
            }
            bufferedReader.close();
        } catch (Exception e) {
            System.err.println("not real");
        }
        return listnumber;
    }
}
