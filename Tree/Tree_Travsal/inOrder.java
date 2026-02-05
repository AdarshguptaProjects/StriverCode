class Solution {
    public ArrayList<Integer> inOrder(Node root) {
        // code here
        ArrayList<Integer> al = new ArrayList<>();
        inOrderHelper(root, al);
        return al;
    }
    public void inOrderHelper(Node root, ArrayList<Integer> al){
        if(root==null)
            return ;
            inOrderHelper(root.left,al);
            al.add(root.data);
            inOrderHelper(root.right,al);
    }

}