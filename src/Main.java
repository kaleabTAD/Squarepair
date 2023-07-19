public class Main {
    public static void main(String[] args) {
        System.out.println("Number of square-pairs in {9, 0, 2, -5, 7} is: " + countSquarePairs(new int[]{9, 0, 2, 2, 7}));
        System.out.println("Number of square-pairs in {9} is: " + countSquarePairs(new int[]{9}));
       // System.out.println("Number of square-pairs in {9} is: " + countSquarePairs(new int[]{3, 0, 6, 10, 15, -17, 1, 9}));
    }

static 	int countSquarePairs(int[ ] a){
        boolean duplicate=false;
        int count=0;
        int length=a.length;
        if (length<2)return 0;
        for (int i=0;i<length;i++){
            for (int j=0;j<length;j++){
                if (a[i]==a[j] && i!=j){
                    duplicate=true;
                    break;

                } else if (a[i]==a[j] && i==j) {
                    continue;

                }
                else{
                    if (a[i]<a[j]&& a[i]>0 && a[j]>0 ){
                        if (isperfcet((a[i]+a[j]))==1)
                        {
                            count ++;
                        }
                    }
                }
            }
            if (duplicate==true)break;
        }
return count;

}
static int isperfcet(int a){
        int perfcet=0;
        int base=0;
        double differecnce=0;
        double sqrt=0;
        if (a>0){
            sqrt=Math.sqrt(a);
            base=(int)sqrt;
            differecnce= (base-sqrt);
            if (differecnce==0)perfcet=1;
            else perfcet=0;
        }

return perfcet;
}
}



