/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> al = new ArrayList<Integer>();
        Stack<TreeNode> s1 = new Stack<>();
        if(root==null)
            return al;
        TreeNode curr = root,lastVisited=null;
        while(curr!=null || !s1.isEmpty()){
            while(curr!=null){
                s1.push(curr);
                curr=curr.left;
            }
            TreeNode peek = s1.peek();
            if(peek.right!=null && peek.right!=lastVisited){
                curr=peek.right;
            }
            else{
                al.add(peek.val);
                lastVisited=s1.pop();
            }

        }
        return al;

    }
}
