    public static void main(String[] args) {
        
        //Bandera americana con do while
        int j=0;
        do{
            System.out.println("* ".repeat(8) + "=".repeat(38));
            j++;
        }while(j<9);

        int k=0;
        do{
            System.out.println("=".repeat(54));
            k++;
        }while(k<6);
        
        System.out.println();
        System.out.println();
        //Bandera americana con for
        for(int i=0; i<9; i++){
            System.out.println("* ".repeat(8) + "=".repeat(38));
        }
        for(int i=0; i<6; i++){
            System.out.println("=".repeat(54));
        }
        
        System.out.println();
        System.out.println();
        //Bandera americana con while
        int m=0;
        while(m<9){
            System.out.println("* ".repeat(8) + "=".repeat(38));
            m++;
        }
        
        int n=0;
        while(n<6){
            System.out.println("=".repeat(54));
            n++;
        }
    }
