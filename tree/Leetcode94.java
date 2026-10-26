
class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> arr=new ArrayList<>();
         helper(root,arr);
         return arr;
    }
    public void helper(TreeNode root,List<Integer> arr ){
        if(root==null) return;
        
        helper(root.left,arr);
        arr.add(root.val);
        helper(root.right,arr);
    }
}