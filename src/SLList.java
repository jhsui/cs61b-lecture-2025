public class SLList {
    private static class IntNode {

        public int item;
        public IntNode next;

        // Constructor
        public IntNode(int i, IntNode n) {
            this.item = i;
            this.next = n;
        }

    }


    private IntNode first;

    // Constructor
    public SLList(int x) {
        first = new IntNode(x, null);
    }

    public void addFirst(int x) {
        first = new IntNode(x, first);
    }

    public int getFirst() {
        return first.item;
    }

    public int size() {
        int i = 0;

        IntNode node = this.first;

        while (true) {
            if (node == null) {
                break;
            } else {
                node = node.next;
                i++;
            }
        }

        return i;
    }


    // add an IntNode at the end of the list.
    public void addLast(int x) {

        int size = this.size();

        // 既然我们只能在最前面添加node，那么干脆从最后一个开始加起，一直加到原first的第一个
        IntNode newFirst = new IntNode(x, null);


        //找到最后的node，并得到它的item
        while (size > 0) {
            IntNode node = this.first;
            int i = 0;
            while (true) {
                if (node.next == null) {
                    newFirst = new IntNode(node.item, newFirst);
                    break;
                } else {
                    node = node.next;
                    i++;
                }
            }
            size--;

        }
        this.first = newFirst;

    }

    public static void main(String[] args) {
        SLList L = new SLList(15);
        L.addFirst(10);
        L.addFirst(5);

        L.addLast(99);

//        SLList L = null;

        if (L == null) {
            System.out.println("L is null!");
        }

        System.out.println(L.size());
    }
}
