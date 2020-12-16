import java.util.HashMap;

public class Main {

    public static void main(String[] args) {
        HashMap<String,String> eng_to_tur = new HashMap<String, String>();
        eng_to_tur.put("book","kitap");
        eng_to_tur.put("table","masa");
        eng_to_tur.put("computer","bilgisayar");
        System.out.println(eng_to_tur.size());

        for (String item : eng_to_tur.keySet()){
            System.out.println("Key: "+item+", Value: "+eng_to_tur.get(item));
        }


        eng_to_tur.remove("table");
        eng_to_tur.clear();
        System.out.println(eng_to_tur.get("table"));


    }
}
