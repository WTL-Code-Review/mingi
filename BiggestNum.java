import java.util.Arrays;

class Solution {
    public String solution(int[] numbers) {
        
        // 숫자를 문자열 배열로 변환
        String[] arr = new String[numbers.length];
        
        for (int i = 0; i < numbers.length; i++) {
            arr[i] = String.valueOf(numbers[i]);
        }
        
        // (b+a)와 (a+b)를 비교하여 내림차순 정렬
        Arrays.sort(arr, (n1, n2) -> (n2 + n1).compareTo(n1 + n2));
        
        // 모두 0인 경우
        if (arr[0] == "0")  //if (arr[0].equals("0"))
        {
            return "0";
        }
        
        // 문자열 이어붙이기
        
        return String.join("", arr);
        
        /*StringBuilder sb = new StringBuilder();
        
        for (String s : arr) {
            sb.append(s);
        }
        
        return sb.toString();*/
    }
}
