class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];

        for (int i = 0; i < n; i++) {
            // 두 지도를 OR 연산으로 합치기
            int num = arr1[i] | arr2[i];

            // n자리 이진수 문자열 만들기
            String binary = String.format("%" + n + "s",
                    Integer.toBinaryString(num))
                    .replace(' ', '0');
            binary = binary.replace('1', '#')
                           .replace('0', ' ');

            answer[i] = binary;
        }

        return answer;
    }
}
