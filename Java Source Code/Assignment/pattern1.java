class pattern1{
    public static void main(String[] args) {
        int p=0;
        for(int i=0;i<3;i++)
        {
            for (int j=0;j<=i ;j++ ) {
                System.out.print("" +(char)(65+p));
                System.out.print(""+ (char)(97+p));
                p++;
            }
            System.out.println();
        }        
}
}