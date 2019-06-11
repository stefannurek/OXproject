import java.util.ArrayList;
import java.util.List;

public class Node {

    private int[][] state;
    private Node parent;
    private List<Node> children;

    public Node() {
        state = new int[3][3];
        children = new ArrayList<>();
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    public int[][] getState() {
        return state;
    }
    public void setState(int[][] state) {
        this.state = state;
    }

    public Node getParent() {
        return parent;
    }

    public void setParent(Node parent) {
        this.parent = parent;
    }

    public List<Node> getChildren() {
        return children;
    }

    public void setChildren(List<Node> children) {
        this.children = children;
    }

    public void setStateValue(int x, int y, int value) {
        state[x][y] = value;
    }

    public void printState() {
        System.out.println(getSign(state[0][0]) + " | " + getSign(state[0][1]) + " | " + getSign(state[0][2]));
        System.out.println("----------");
        System.out.println(getSign(state[1][0]) + " | " + getSign(state[1][1]) + " | " + getSign(state[1][2]));
        System.out.println("----------");
        System.out.println(getSign(state[2][0]) + " | " + getSign(state[2][1]) + " | " + getSign(state[2][2]) + "\n");
    }

    private char getSign(int value) {
        if(value == 1) {
            return 'O';
        } else if (value == 2) {
            return 'X';
        } else {
            return ' ';
        }
    }

}
