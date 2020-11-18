import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;
import java.util.*;
public class main {
    public static void main(String[] args) throws FileNotFoundException {
        Location mylocation = new Location("My Loc",0,0);
        LinkedList<Deals> ll = new LinkedList<Deals>();
        File file = new File("Book1.csv");
        Scanner scanner = new Scanner(file);
        while(scanner.hasNext()){
            String line = scanner.next();
            String[] colums = line.split(",");
            Deals d = new Deals(colums[0],colums[1],colums[2]);
            d.setDistance(mylocation);
            ll.add(d);
        }
        System.out.println(ll.get(0).Distance);
    }
}
