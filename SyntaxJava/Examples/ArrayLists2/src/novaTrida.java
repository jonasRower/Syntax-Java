import java.util.ArrayList;
import java.util.Iterator;

//https://cse.google.cz/cse?cx=008617562879727931912%3Aljbco61e1tk&ie=UTF-8&q=JAVA&sa=Vyhledat
//https://www.itnetwork.cz/java/kolekce-a-proudy/java-collections-framework


public class novaTrida {
	
	
    String ArrayListConvertToArray()
    {
        String Text;
        Text = "Konverze ArrayList na pole\n";
        Text = Text + "arr = al.toArray(arr);\n\n";

        ArrayList<Integer> al = new ArrayList<Integer>(); 
        al.add(10); 
        al.add(20); 
        al.add(30); 
        al.add(40); 

        Integer[] arr = new Integer[al.size()]; 
        arr = al.toArray(arr); 

        for (Integer x : arr) 
                Text = Text + x + "\n"; 


                return Text;

        }


        String ArrayListConvertToArray2()
        {
            String Text;
            Text = "Konverze ArrayList na pole\n";
            Text = Text + "arr[i] = al.get(i); \n\n";


            ArrayList<Integer> al = new ArrayList<Integer>(); 
            al.add(10); 
            al.add(20); 
            al.add(30); 
            al.add(40); 

            Integer[] arr = new Integer[al.size()]; 

            // ArrayList to Array Conversion 
            for (int i =0; i < al.size(); i++) 
                arr[i] = al.get(i); 

            for (Integer x : arr) 
                    Text = Text + x + "\n";   

                    return Text;
        }
}
