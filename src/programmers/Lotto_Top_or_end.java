package programmers;

// lottos : 구매한 로또 번호
// win_nums : 당첨 번호 배열

import java.util.Arrays;

/*
- 최종 : 당첨 가능한 최고순위와 최저 순위를 차례로 배열에 담아라

조건
- 알아볼 수 없는 것들은 0으로 처리가 되었다. ( lottos 배열에 0이 껴있다는 뜻 )
- 0이 된수를 예측해서 바꿔야함

방법
1. 결과반환 배열이 필요해보임
2. 최고 최저에 대한 변수 필요
2. lottos 배열과 win_nums 배열 두개를 비교하며 돌려 0으로 된 부분은 그 숫자로 대치
두 가지가 필요해보인다.
1. 0을 숫자로 바꾼 후 돌렸을때 최고로 당첨될수있는 등수
2. 바꾸지 않았을때 최저로 당첨될 수 있는 등수

--> 최고 등수 구하는 클래스 , 최저 등수 구하는 클래스 분리해보자

수정
1. 이진탐색을 이용해서 해결 (binarySearch 활용)

최저순위 계산 : 0을 제외한 현재상태에서 lottos 요소와 win_numbers의 요소가 매칭하는 개수 확인
최고순위 계산 : 0인 값들을 'lottos 배열에 존재하지 않는 당첨번호'의 값으로 매칭하여 최고 계산 순위 확인


 */
public class Lotto_Top_or_end {
    public int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = new int[2];
        int matchCnt = 0;
        int zeroCnt = 0;

        Arrays.sort(lottos);
        Arrays.sort(win_nums);

        for (int i : lottos) {
            if(Arrays.binarySearch(win_nums, i) >= 0)
                matchCnt++;
            if(i == 0)
                zeroCnt++;
        }
        answer[1] = Math.min(7 - matchCnt, 6);
        answer[0] = Math.min(7 - (matchCnt + zeroCnt), 6);

        return answer;
    }
}
