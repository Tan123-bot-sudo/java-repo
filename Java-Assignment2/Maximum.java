
class Maximum {
    int num1, num2, num3;

    Maximum(int x, int y, int z) {
        num1 = x;
        num2 = y;
        num3 = z;
    }

    void findMax() {
        int max;

        if (num1 >= num2 && num1 >= num3){
             max = num1;
        }
           
        else if (num2 >= num1 && num2 >= num3){
            max = num2;
        }
            
        else{
            max = num3;
        }
            
        System.out.println("Maximum = " + max);
    }

    public static void main(String args[]) {
        Maximum obj = new Maximum(10, 25, 15);
        obj.findMax();
    }
}