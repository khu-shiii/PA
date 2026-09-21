class Solution {
    public String simplifyPath(String path) {
        Stack<String> st=new Stack<>();
        String[] pt=path.split("/");
        for(String p:pt){
            if(p.equals("")||p.equals(".")) continue;
            if (p.equals("..")) { if (!st.isEmpty()) { st.pop(); } }
            else st.push(p);
        }
        StringBuilder res=new StringBuilder();
        for(String f:st){
            res.append("/");
            res.append(f);
        }
        if(res.length()==0) return "/";
        return res.toString();
    }
}