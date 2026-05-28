class Solution {
    public int[] solution(String s) {

        int[] answer = new int[s.length()];

        for (int i = 0; i < s.length(); i++) {

            answer[i] = -1;

            // 왼쪽으로 하나씩 확인
            for (int j = i - 1; j >= 0; j--) {

                // 같은 문자 찾으면
                if (s.charAt(i) == s.charAt(j)) {
                    answer[i] = i - j;
                    break;
                }
            }
        }
        return answer;
    }
}
