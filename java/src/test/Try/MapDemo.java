import java.util. * ;
public class MapDemo {
  public static void main(String[] args) {
    LinkedHashMap < Integer,
    Double > h = new LinkedHashMap();
    h.put(101, 7.2);
    h.put(105, 8.1);
    h.put(109, 8.3);
    h.put(111, 8.1); // duplicate values are allowed 
    h.put(112, 7.9); 
    h.put(101, 8.8); // ignore 
    
    System.out.println(h); 
    Collection c1=h.keySet(); 
    
    System.out.println(c1); 
    Collection c2=h.values(); 
    
    System.out.println(c2); // entrySet() method gives us Map.Entry 
    Set s=h.entrySet(); 
    Iterator itr=s.iterator(); 
    while(itr.hasNext()){ 
        Map.Entry m=(Map.Entry)itr.next(); 
        System.out.println(m.getKey()+" = " +m.getValue()); 
        
    } 
  } 
}
    