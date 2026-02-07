class Solution {
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> l = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();
        if(root==null)
            return l;
        stack.push(root);
        while(!stack.isEmpty()){
            TreeNode tempNode = stack.pop();
            l.add(tempNode.val);
            if(tempNode.right!=null)
                stack.push(tempNode.right);
            if(tempNode.left!=null)
                stack.push(tempNode.left);
        }
        return l;
    }
}
