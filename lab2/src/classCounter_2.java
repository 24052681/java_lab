class ObjectCount {
    static int count = 0;

    ObjectCount() {
        count++;
    }

    static void display() {
        System.out.println("Number of objects = " + count);
    }
}

public class classCounter_2 {
    public static void main(String[] args) {
        ObjectCount o1 = new ObjectCount();
        ObjectCount o2 = new ObjectCount();
        ObjectCount o3 = new ObjectCount();
        ObjectCount o4 = new ObjectCount();

        ObjectCount.display();
    }
}

