import java.io.File;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String fileName = scan.next();
        File results = new File(fileName);
        int total = 0;
        try( Scanner scan2 = new Scanner(results)){
            while(scan2.hasNext()){
                total+=scan2.nextInt();
            }
        } catch(Exception e){
            System.out.println(e);
        }
        System.out.println(total);

    }

}
