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