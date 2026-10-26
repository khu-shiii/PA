
class Solution {
    public List<Integer> preorderTraversal(TreeNode root) {
         List<Integer> arr=new ArrayList<>();
         helper(root,arr);
         return arr;
    }
    public void helper(TreeNode root,List<Integer> arr ){
        if(root==null) return;
        arr.add(root.val);
        helper(root.left,arr);
        helper(root.right,arr);
    }
}