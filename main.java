class a extends Thread {
    public void run() {
        for (int i = 0; i <= 10; i++) {
            System.out.println(i + " ");
        }
    }
}

class main {
    public static void main(String[] args) {
        a obj = new a();
        Thread t = new Thread(obj);
        t.start();

        //a t = new a();
        //t.start();
    }
}