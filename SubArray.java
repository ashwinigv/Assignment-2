import java.util.HashSet;

public class SubArray {
    public static void main(String[] args) {
        int []a={10,20,30,40,50,60,70,80};
        int []b={30,40,10};
        System.out.println(isSubArray(a,b)? " Present ": " Not Present ");

    }
    static boolean isSubArray(int []a, int b[]){
        HashSet<Integer>hashSet=new HashSet<>();
        for (int i=0;i<a.length;i++){
            if(!hashSet.contains(a[i]))
                hashSet.add(a[i]);
        }
        for (int i=0;i<b.length;i++){
            if (!hashSet.add(b[i]))
                return true;
        }
        return false;

    }


}