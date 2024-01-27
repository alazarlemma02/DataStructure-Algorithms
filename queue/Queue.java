class Queue {
    public static void main(String[] args){
        StaticQueue queue = new StaticQueue(5);
        queue.enQueue(1);
        queue.enQueue(2);
        queue.enQueue(3);
        queue.show();

    }
}
