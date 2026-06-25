/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/

class Solution {
    public List<List<Integer>> levelOrder(Node root) {
       List< List<Integer>>arr = new ArrayList<>();
        if(root==null) return arr;

        Queue<Node>q = new LinkedList<>();
        q.add(root);

        while(!q.isEmpty()){
            int size = q.size();
            List<Integer>list= new LinkedList<>();
            for(int i = 0;i<size;i++){
                Node cur = q.poll();
                list.add(cur.val);

                for(Node child:cur.children){
                    q.add(child);
                }
            }
            arr.add(list);
        }
    return arr;
    }
}