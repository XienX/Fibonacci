import java.util.ArrayList;

public class Fibonacci {

    private static ArrayList<Integer> list = new ArrayList<Integer>() {
        /**
        *fibonacci数列,方法of()
        *复杂度O(n)
        */
        private static final long serialVersionUID = 1L;

        {
        add(0);
        add(1);
    }};

    private static int of (int index) {
        if(index < 1){
            return -1;
        }

        int len = list.size();

        if(index == len) { //前面项的值已计算，只有当前项未计算
            int value = list.get(len - 2) + list.get(len - 1);
            list.add(value);
            return value;
        }

        else if(index < len) //当前项已被计算
            return list.get(index);

        else { //前面两项的值不是都存在
            int value = of(index - 2) + of(index - 1);
            list.add(value);
            return value;
        }
    }

    public static void main(String[] args) {
        int value, i = 1;

        while(true) {
            value = Fibonacci.of(i);
            if(value < 200){
                System.out.println("Fibonacci(" + i + ") = " + value);
                i++;
            }
            
            else break;
        }
    }
}