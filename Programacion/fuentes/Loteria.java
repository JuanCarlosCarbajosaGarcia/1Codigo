import java.util.Arrays;
import java.util.Random;

public class Loteria {
    public static void main(String[] args) {
        Random rand = new Random();
        int[] nums1 = new int[6];
        boolean esta = false;
        int conta = 0;
        int num = rand.nextInt(6)+1;

        while(conta<nums1.length) {
            num = rand.nextInt(49)+1;
            esta=false;
            for(int i=0;i<nums1.length;i++){
                if (nums1[i]==num) {esta=true;}
            }
            if (!esta) {
                nums1[conta]=num;
                conta++;
            }
        }
        for (int i=0;i<nums1.length;i++){
            System.out.print(nums1[i]+" ");
        }
        System.out.println("");
        Arrays.sort(nums1);
        for (int i=0;i<nums1.length;i++){
            System.out.print(nums1[i]+" ");
        }
    }
}
