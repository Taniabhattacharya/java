public class break_{
    public static void main(String [] args) {
        int summ=0;
        for(int i=1;i<100;i++){
            if (i%2==0){
                continue;
             } else {
                System.out.println(i);
                summ = summ + i;
             }
        }
        System.out.println(summ);

    }
}