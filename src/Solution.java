public class Solution {
    //压缩字符串
    public int compress(char[] chars) {
        int cur=0;//新数组下标
        for(int i=0,j=0;i<chars.length;i=j){
            while(j<chars.length&&chars[j]==chars[i]){
                j++;//至少走一次，因为开始的时候i=j；
            }
            chars[cur++]=chars[i];//元素填入
            if(j-i==1){
                continue;
            }
            for(char c:String.valueOf(j-i).toCharArray()){
                chars[cur++]=c;//数字填入
            }
        }
        return cur;
    }
}
