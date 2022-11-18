class tryme{

    public static void main(String[] args) throws Exception {
        
        try {
            System.out.println("0/0"+(0/0));
        } catch (Exception e) {
            System.out.println("Error : "+e);
        }
        System.out.println("0/0");
        System.out.println("0/0"+(0/0));
        System.out.println("0/0 2nds");
    }
}