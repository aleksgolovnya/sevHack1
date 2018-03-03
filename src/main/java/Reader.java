import java.io.*;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class Reader {
    public static ArrayList<String> run() throws FileNotFoundException {
        ArrayList<String> list = new ArrayList<String>();
        try {
            FileInputStream fstream = new FileInputStream("input.txt");
            BufferedReader br = new BufferedReader(new InputStreamReader(fstream));
            String strLine;
            while ((strLine = br.readLine()) != null) {
                list.add(strLine);
                System.out.println(strLine);
            }
        } catch (IOException e) {
            System.out.println("Ошибка");
        }
        return list;
    }

    public static ArrayList<InputData> Scan(ArrayList<String> input){
        int VlanNumber;
        String Ip;
        String portNumberTaggged;
        String portNumberUnTaggged;
        String str;
        String[] spl = new String[4];
        ArrayList<InputData> data = new ArrayList<InputData>();
        for (int i = 0; i < input.size(); i++) {
            str  =  input.get(i);
            spl = str.split(" ");
            Ip = spl[0];
            VlanNumber =  Integer.parseInt(spl[1]);
            portNumberTaggged = spl[2];
            portNumberUnTaggged = spl[3];
            data.add(new InputData(VlanNumber,Ip,portNumberTaggged,portNumberUnTaggged));
        }

        return  data;
    }

    public static ArrayList<String> physicalRun() throws FileNotFoundException {
        ArrayList<String> physicalList = new ArrayList<String>();
        try {
            FileInputStream fstream = new FileInputStream("switches.txt");
            BufferedReader br = new BufferedReader(new InputStreamReader(fstream));
            String strLine;
            while ((strLine = br.readLine()) != null) {
                physicalList.add(strLine);
                System.out.println(strLine);
            }
        } catch (IOException e) {
            System.out.println("Ошибка");
        }
        return physicalList;
    }

    public static ArrayList<PhysicalData> physicalScan(List<String> input){
        String ipParent;
        String ipChild;
        int portParent;
        int portChild;
        String str;
        String[] spl = new String[4];
        ArrayList<PhysicalData> physicalData = new ArrayList<PhysicalData>();
        for (int i = 0; i < input.size(); i++) {
            str  =  input.get(i);
            spl = str.split("\\S");
            ipParent = spl[0];
            ipChild = spl[1];
            portParent =  Integer.parseInt(spl[2]);
            portChild =  Integer.parseInt(spl[3]);
            physicalData.add(new PhysicalData(ipParent,ipChild,portParent,portChild));
        }

        return physicalData;
    }
}