import java.util.Arrays;

/**
 * ClassName:TextDemo3
 * Package:PACKAGE_NAME
 * Description:
 *
 * @Author:HP
 * @date:2021/5/10 22:34
 */
public class TextDemo3 {

    //下一个排列
//    public void nextPermutation(int[] nums) {
//        if(nums == null || nums.length == 1) return;
//        for(int i = nums.length - 1; i > 0; i--) {
//            if(nums[i] > nums[i - 1]) {
//                Arrays.sort(nums,i,nums.length);
//                for(int j = i; j < nums.length; j++) {
//                    if(nums[j] > nums[i - 1]) {
//                        int tmp = nums[j];
//                        nums[j] = nums[i - 1];
//                        nums[i - 1] = tmp;
//                        return;
//                    }
//                }
//            }
//
//        }
//        Arrays.sort(nums);
//        return;
//    }


    //39. 组合总和
//    public List<List<Integer>> combinationSum(int[] candidates, int target) {
//        List<List<Integer>> res = new ArrayList<>();
//        List<Integer> list = new ArrayList<>();
//        dfs(candidates,target,res,list,0);
//        return res;
//    }
//    public void dfs(int[] candidates,int target,List<List<Integer>> res,List<Integer> list,int idx) {
//        if(idx == candidates.length) return;
//        if(target == 0) {
//            res.add(new ArrayList<Integer>(list));
//            return;
//        }
//        for(int i = idx; i < candidates.length; i++) {
//            if(target - candidates[i] >= 0) {
//                list.add(candidates[i]);
//                dfs(candidates,target - candidates[i],res,list,i);
//                list.remove(list.size() - 1);
//            }
//        }
//    }

    //46.全排列
//    public List<List<Integer>> permute(int[] nums) {
//        List<List<Integer>> res = new ArrayList<>();
//        List<Integer> list = new ArrayList<>();
//        dfs(nums,res,list);
//        return res;
//    }
//    public void dfs(int[] nums,List<List<Integer>> res,List<Integer> list) {
//        if(list.size() == nums.length) {
//            res.add(new ArrayList<Integer>(list));
//            return;
//        }
//        for(int i = 0; i < nums.length; i++) {
//            if(list.contains(nums[i])) continue;
//            list.add(nums[i]);
//            dfs(nums,res,list);
//            list.remove(list.size() - 1);
//        }
//    }

    //11. 盛最多水的容器(超出时间限制)
//    public static int maxArea(int[] height) {
//        int n = height.length;
//        if(height == null || n == 0) return 0;
//        int[][] dp = new int[n + 1][n + 1];
//        int res = 0;
//        for(int i = 0; i < n; i++) {
//            for(int k = 0; k <= i; k++) {
//                dp[i][k] = 0;
//            }
//            for(int j = i + 1; j < n; j++) {
//                int tmp = Math.min(height[i],height[j);
//                dp[i][j] = Math.max(dp[i][j - 1],tmp * (j - i));
//                res = Math.max(res,dp[i][j]);
//            }
//        }
//        return res;
//    }

    //盛最多水的容器（双指针法）
//    public int maxArea(int[] height) {
//        int n = height.length;
//        if(height == null || n == 0) return 0;
//        int res = 0;
//        int i = 0, j = n - 1;
//        while(i < j) {
//            int area = Math.min(height[i],height[j]) * (j - i);
//            res = Math.max(area,res);
//            if(height[i] > height[j]) {
//                j--;
//            } else {
//                i++;
//            }
//        }
//        return res;
//    }


    //最小路劲和
//    public static int minPathSum(int[][] grid) {
//        int m = grid.length,n = grid[0].length;
//        int[][] dp = new int[m][n];
//        dp[0][0] = grid[0][0];
//        //初始化行
//        for(int i = 1; i < m; i++) {
//            dp[i][0] = grid[i][0] + dp[i - 1][0];
//        }
//        //初始化列
//        for(int j = 1; j < n; j++) {
//            dp[0][j] = grid[0][j] + dp[0][j - 1];
//        }
//
//        for(int i = 1; i < m; i++) {
//            for(int j = 1; j < n; j++) {
//                dp[i][j] = Math.min(dp[i - 1][j],dp[i][j - 1]) + grid[i][j];
//            }
//        }
//
//        return dp[m - 1][n - 1];
//    }
    public static void main(String[] args) {
//        int[][] arr = {{1,3,1},{1,5,1}};
//        System.out.println(minPathSum(arr));
//        int[] arr = {1,8,6,2,5,4,8,3,7};
//        System.out.println(maxArea(arr));
    }
}
