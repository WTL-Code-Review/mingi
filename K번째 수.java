import java.util.Arrays;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        
        int[] answer = new int[commands.length];
        
        for (int i = 0; i < commands.length; i++) {
            
            int j = commands[i][0];
            int k = commands[i][1];
            int l = commands[i][2];
            
            // 배열 추출
            int[] temp = Arrays.copyOfRange(array, j-1 , k);
            
            // 정렬
            Arrays.sort(temp);
            
            // l번째 수 저장
            answer[i] = temp[l - 1];
        }
        
        return answer;
    }
}
