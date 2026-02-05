class Solution {
    public ArrayList<Integer> postOrder(Node root) {
        
        ArrayList<Integer> al = new ArrayList<>();
        postOrderHelper(root, al);
        return al;
    }
    public void postOrderHelper(Node root, ArrayList<Integer> al){
        if(root==null)
            return ;
            postOrderHelper(root.left,al);
            postOrderHelper(root.right,al);
            al.add(root.data);
    }

}