class Pair {
    TreeNode node;
    int level;

    Pair(TreeNode node, int level) {
        this.node = node;
        this.level = level;
    }
}

class Solution {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<>();
        if (root == null) return ans;
        Queue<Pair> q = new LinkedList<>();
        q.add(new Pair(root, 0));
        int curr = 0;
        List<Integer> arr = new ArrayList<>();
        while (q.size() > 0) {
            Pair front = q.remove();
            if (front.level != curr) {
                if (curr % 2 == 1) {
                    Collections.reverse(arr);
                }
                ans.add(new ArrayList<>(arr));
                arr = new ArrayList<>();
                curr++;
            }
            arr.add(front.node.val);
            if (front.node.left != null)
                q.add(new Pair(front.node.left, front.level + 1));
            if (front.node.right != null)
                q.add(new Pair(front.node.right, front.level + 1));
        }


        if (curr % 2 == 1) {
            Collections.reverse(arr);
        }

        ans.add(new ArrayList<>(arr));

        return ans;
    }
}


/* Structure of Binary Tree Node
class Node {
    int data;
    Node left, right;
    Node(int d)
    {
        data = d;
        left = right = null;
    }
}*/

class Solution {
    ArrayList<Integer> zigZagTraversal(Node root) {
        // code here
        ArrayList<Integer> list=new ArrayList<>();
        if(root==null)return list;
        Queue<Node> q=new LinkedList<>();
        q.add(root);
        boolean leftToRight=true;
        while(!q.isEmpty()){
            
            int size=q.size();
            ArrayList<Integer> l=new ArrayList<>();
            
            for(int i=0;i<size;i++){
                Node curr=q.poll();
                l.add(curr.data);
                
                if(curr.left!=null){
                    q.add(curr.left);
                }
                if(curr.right!=null){
                    q.add(curr.right);
                }
            }
            
            if(!leftToRight){
                Collections.reverse(l);
            }
            list.addAll(l);
            leftToRight=!leftToRight;
        }
        return list;
        
    }
}