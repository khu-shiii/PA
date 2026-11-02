class Solution {
    ArrayList<Integer> preOrder(Node root) {
        // code here
        ArrayList<Integer> ans=new ArrayList<>();
                if(root==null) return ans;
                Stack<Node> st=new Stack<>();
                st.push(root);
                while(!st.isEmpty()){
                    Node curr=st.pop();
                    ans.add(curr.data);
                    if(curr.right!=null) st.push(curr.right);
                    if(curr.left!=null) st.push(curr.left);
                }
                return ans;
    }
}