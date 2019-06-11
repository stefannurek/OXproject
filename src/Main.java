public class Main {

    public static void main(String[] args) {


        Node node = new Node();

        node.printState();

        node.setStateValue(0,0, 1);
        node.setStateValue(2,2, 1);
        node.setStateValue(1,1, 2);
        node.setStateValue(1,0, 2);

        node.printState();
        
    }

}
