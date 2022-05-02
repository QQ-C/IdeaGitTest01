package test09.demo;

import java.util.*;


class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) {
        val = x;
    }
}



public class test {
    public static void main(String[] args) {
        Solution solution = new Solution();
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            String line = sc.next();      //输入
            TreeNode root = solution.build(line);    //build方法 换成 C++ 根据输入创建二叉树
            solution.findSubtrees(root);   //找到相同子树并输出结果
        }
    }
}

class Solution {
    // 记录所有的子树和出现的次数
    HashMap<String, Integer> memo = new HashMap<>();
    // 记录重复子树的根节点
    LinkedList<TreeNode> res = new LinkedList<>();

    public List<TreeNode> findSubtrees(TreeNode root) {
        traverse(root);
        return res;
    }
    private String traverse(TreeNode root) {     //主要函数
        // 递归到叶子节点了
        if (root == null) return "#";
        String left = traverse(root.left);
        String right = traverse(root.right);

        // 后序遍历代码
        StringBuilder sb = new StringBuilder();
        // 拼接子树和根节点
        sb.append(left).append(",").append(right).append(",").append(root.val);
        // 可以获取字符串在map中的值，不存在就新增这个字符串到map中并附值为0
        int num = memo.getOrDefault(sb.toString(), 0);
        // 无论相同子树重复几次都只会被加入到结果集一次
        if (num == 1) {
            if(root.left!=null&&root.right!=null){     //保证层数大于1
                res.add(root);
            }
        }
        // 子树结果加一
        memo.put(sb.toString(), num + 1);
        return sb.toString();
    }


    private static int index = 0;

    TreeNode build(String line) {
        char c = line.charAt(index);
        if(c == '#'){
            return null;
        }
        TreeNode root = new TreeNode(c);
        index++;
        root.left = build(line);
        index++;
        root.right = build(line);
        return root;
    }
}