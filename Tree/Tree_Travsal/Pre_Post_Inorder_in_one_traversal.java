/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int data;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int val) { data = val; left = null, right = null }
 * }
 **/

class Pair {
    TreeNode node;
    int state;

    Pair(TreeNode node, int state) {
        this.node = node;
        this.state = state;
    }
}

class Solution {
    List<List<Integer>> treeTraversal(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
		List<Integer> inOrderList = new ArrayList<>();
		List<Integer> preOrderList = new ArrayList<>();
		List<Integer> postOrderList = new ArrayList<>();

		Stack<Pair> st = new Stack<>();
		st.push(new Pair(root,1));
		while(!st.isEmpty()){
			Pair pair = st.pop();
			if(pair.state==1){
				preOrderList.add(pair.node.data);
				pair.state=2;
				st.push(pair);
				if (pair.node.left != null) {
                    st.push(new Pair(pair.node.left,1));
                }
			} else if(pair.state==2){
				inOrderList.add(pair.node.data);
				pair.state=3;
				st.push(pair);
				if (pair.node.right != null) {
                    st.push(new Pair(pair.node.right,1));
                }
			}else{
				postOrderList.add(pair.node.data);
			}

		}
		res.add(inOrderList);
		res.add(preOrderList);
		res.add(postOrderList);

		return res;
    }
}
