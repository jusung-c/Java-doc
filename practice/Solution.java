package practice;

class Solution {
    public int solution(int n, int k, int[] enemy) {
        // 최대로 버틴 라운드 수
        int answer = 0;

        // 매 라운드마다 enemy[i]마리 적 등장
        for (int i = 0; i < enemy.length; i++) {
            // 병사의 수 >= 적의 수
            if (n >= enemy[i]) {
                // 병사 소모하여 라운드 방어
                n -= enemy[i];
                answer++;
            } else { // 병사의 수 < 적의 수
                break;
            }
        }

        return answer;
    }
}
