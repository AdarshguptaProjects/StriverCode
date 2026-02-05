class Solution {
    
    public ArrayList<Integer> preOrder(Node root) {
        //  code here
        ArrayList<Integer> al = new ArrayList<>();
        preOrderHelper(root, al);
        return al;
        
    }
    
    public void preOrderHelper(Node root, ArrayList<Integer> al){
        if(root==null)
            return ;
            al.add(root.data);
            preOrderHelper(root.left,al);
            preOrderHelper(root.right,al);
    }
}