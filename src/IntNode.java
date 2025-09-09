

//    public int size() {
//        if (rest == null) {
//            return 1;
//
//        }
//        return 1 + rest.size();
//    }
//
//    public int get(int i){
//        int count = 0;
//        IntNode p = this;
//        while(count != i){
//            count ++;
//            p = p.rest;
//        }
//
//        return p.first;
//    }
//
/// /    public int get(int i) {
/// /        if (i == 0) {
/// /            return this.first;
/// /        }
/// /
/// /        return this.rest.get(i - 1);
/// /    }
//
//    public static int iterativeSize(IntNode p) {
//        int totalSize = 0;
//        //IntList p = this;
//        while (p != null) {
//            totalSize += 1;
//            p = p.rest;
//
//
//        }
//        return totalSize;
//    }
//
//    public static void main(String[] args) {
//
/// /        IntList L = new IntList(5, null);
/// /
/// /        L.rest = new IntList(10, null);
/// /
/// /        L.rest.rest = new IntList(15, L);
//
//        IntNode L = new IntNode(15, null);
//        L = new IntNode(10, L);
//        L = new IntNode(5, L);
//
//        //System.out.println(L.size());
//
//        //System.out.println(iterativeSize(L));
//        System.out.println(L.get(1));
//
//    }



