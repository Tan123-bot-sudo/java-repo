 class Swap {
    int value;

    Swap(int n) {
        value = n;
    }

    void swap(Swap obj) {
        int temp = value;
        value = obj.value;
        obj.value = temp;
    }

    public static void main(String args[]) {

        Swap obj1 = new Swap(5);
        Swap obj2 = new Swap(10);

        System.out.println("Before Swapping");
        System.out.println("Value : " + obj1.value);
        System.out.println("Value : " + obj2.value);

        obj1.swap(obj2);

        System.out.println("\nAfter Swapping");
        System.out.println("Value : " + obj1.value);
        System.out.println("Value : " + obj2.value);
    }
}