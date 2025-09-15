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


    // dummy node
    // To avoid the special case???
    private IntNode sentinel;
    private int size;

    // Constructor
    public SLList(int x) {
        sentinel = new IntNode(83102743, null);
        sentinel.next = new IntNode(x, null);
        size = 1;
    }

    public SLList() {
        sentinel = new IntNode(83102743, null);
        size = 0;
    }

    public void addFirst(int x) {

        sentinel.next = new IntNode(x, sentinel.next);
        size++;
    }

    public int getSentinel() {
        return sentinel.next.item;
    }

//    public int size() {
//        int i = 0;
//
//        IntNode node = this.first;
//
//        while (true) {
//            if (node == null) {
//                break;
//            } else {
//                node = node.next;
//                i++;
//            }
//        }
//
//        return i;
//    }

    public int size() {
        return size;
    }


//    private int size(IntNode p) {
//        if (p == null) {
//            return 0;
//        }
//
//        return 1 + size(p.next);
//    }


//     add an IntNode at the end of the list.
//    public void addLast(int x) {
//
//        int size = this.size();
//
//        // 既然我们只能在最前面添加node，那么干脆从最后一个开始加起，一直加到原first的第一个
//        IntNode newFirst = new IntNode(x, null);
//
//
//        //找到最后的node，并得到它的item
//        while (size > 0) {
//            IntNode node = this.first;
//            int i = 0;
//            while (true) {
//                if (node.next == null) {
//                    newFirst = new IntNode(node.item, newFirst);
//                    break;
//                } else {
//                    node = node.next;
//                    i++;
//                }
//            }
//            size--;
//
//        }
//        this.first = newFirst;
//
//    }

    public void addLast(int x) {

        IntNode p = sentinel;

        while (p.next != null) {
            p = p.next;
        }

        p.next = new IntNode(x, null);

        size++;
        // the reason why i didn't think of this way is that i thought if i did so, there would be a p from nowhere.
        // instead, the p is still the last of the first.
    }

    public static void main(String[] args) {
        SLList LL = new SLList(15);
        SLList L = new SLList();
        L.addFirst(10);
        L.addFirst(5);
        LL.addFirst(10);
        LL.addFirst(5);

        System.out.println(L.size());

        L.addLast(99);

//        SLList L = null;

        if (L == null) {
            System.out.println("L is null!");
        }

        System.out.println(L.size());

        System.out.println("This is just a test for github.");
    }
}
