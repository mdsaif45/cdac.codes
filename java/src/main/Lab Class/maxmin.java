public class maxmin {
    public static void main(String[] args) {
        
        int ar[] = new int[10];
        int max = 0, min = 100;

        for(int i = 0; i < ar.length; i++){
            ar[i] = (int)(Math.random()*100);
            
            if(ar[i] > max) max = ar[i];
            if(ar[i] < min) min = ar[i];
        }

        for(int i=0; i<ar.length; i++)
            System.out.print(ar[i] + " ");
        
        System.out.println("\n\nMax = "+max+"\nMin = "+min);
                
    }
}
