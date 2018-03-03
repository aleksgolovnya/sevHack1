import java.util.ArrayList;

public class ErrorsHandling {

    public static boolean ErrorMod(InputData data) {
        int tag = Integer.parseInt(data.getPortNumberTaggged(),2);
        int untag = Integer.parseInt(data.getPortNumberUnTaggged(),2);
        int res = (~tag & untag) | (tag & ~untag);
        if ((tag+untag-res) != 0)
            return true;
        else return false;
    }

    public static boolean ErrorUnteggeerLink (ArrayList<InputData> data){
        boolean fl=false;
        ArrayList<PhysicalData> physicalData = new ArrayList<PhysicalData>();
        for (int i=0; i < physicalData.size();i++){
            for (int j=0; j<data.size();j++) {
                if(physicalData.get(i).getIpParent().equals(data.get(j).Ip)) {
                    if(data.get(j).portNumberUnTaggged.charAt(physicalData.get(i).getPortParent())=='1')
                    System.out.println("Ошибка");
                }
                if (physicalData.get(i).getIpChild().equals(data.get(j).Ip)){
                    if(data.get(j).portNumberUnTaggged.charAt(physicalData.get(i).getPortChild())=='1')
                    System.out.println("Ошибка");
                }

            }

        }
        if(fl) {
            return true;
        }
        else return false;
    }


    //Проверяет на одном комутаторе, чтобы было два или больше портов; если 1 или ноль связей идет от комутатора
    public static boolean checkUsers (ArrayList<InputData> data) {
        boolean fl=false;
        int o;
        long t, u;
        for(int q = 0; q < data.size(); q++){
            t = Long.parseLong(data.get(q).portNumberTaggged,2);
            u = Long.parseLong(data.get(q).portNumberUnTaggged,2);
            o = 0;
            for (int z = 0; z < 32; z++){ // перебор биты маски
                o += t % 2;
                o += u % 2;
                if(o > 1) {
                    break;
                }
                t = t >>> 1 ;
                u = u >>> 1 ;
            }
            if(o <= 1){
                fl = true;
                System.out.println(data.get(q).VlanNumber + " " + data.get(q).Ip);
                // добавить запись в список ошибок
            }
        }
        if(fl) {
            return true;
        }
        else return false;
    }

    public static  boolean checkTag(ArrayList<InputData> data, ArrayList<PhysicalData> pdata){
        StringBuilder xchg;
        String str;
        boolean fl=false;
        for(int i=0;i<data.size();i++){
            str=data.get(i).portNumberTaggged;
            for(int j=0; j<pdata.size();j++){
                if(data.get(i).Ip.equals(pdata.get(j).ipParent)){
                    xchg=new StringBuilder(str);
                    xchg.setCharAt(pdata.get(j).portParent,'0');
                    str=xchg.toString();
                }
                if(data.get(i).Ip.equals(pdata.get(j).ipChild)){
                    xchg=new StringBuilder(str);
                    xchg.setCharAt(pdata.get(j).portChild,'0');
                    str=xchg.toString();
                }
            }
            if(!str.equals("00000000000000000000000000000000")){
                System.out.println("Ошибка"+data.get(i).Ip);
                // Добавить в таблицу ошибок
                fl=true;
            }
            return fl;
        }
        return false;
    }

    //Доработать
    public static boolean InterraptionNetError(ArrayList<InputData> data, ArrayList<PhysicalData> physicalData){
        boolean fl = false;
        long tagPort;
        int physicalParentPort, physicalChildPort;

        for(int q = 0; q < data.size(); q++) {

        }
        for (int j = 0; j < physicalData.size(); j++) {

        }
    if(fl) {
            return true;
        }else return false;
    }

}
