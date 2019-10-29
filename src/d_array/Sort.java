package d_array;

import java.util.Arrays;

public class Sort {

	public static void main(String[] args) {
		/*
		 * << 정렬 >>
		 * - 선택정렬: 첫 번째 숫자부터 그 뒤의 모든 숫자들과 비교해서 작은 수와 자리 바꾸기를 반복해 앞에서부터 작은 수를 채워나가는 방식 
		 * - 버블정렬: 첫 번째 숫자부터 바로 뒤 숫자와 비교해서 작은 수와 자리 바꾸기를 반복해 뒤에서부터 큰 수를 채워나가는 방식
		 * - 삽입정렬: 두 번째 숫자부터 그 앞의 모든 숫자들과 비교해서 큰 수들을 뒤로 밀고 중간에 삽입하는 방식
		 * - 석차구하기: 모든 점수가 1등으로 시작해서 다른 점수들과 비교해 자신의 점수가 작으면 1씩 증가시키는 방식
		 */

		int[] numbers = new int[10];
		
		for(int i = 0; i < numbers.length; i++){
			numbers[i] = i + 1;
		}
		
		shuffle(numbers); //마우스 우 클릭(Ctrl + 1), 엔터, 메서드 작성
		System.out.println(Arrays.toString(numbers));

		
		prinkRank(numbers); //석차구하기
		selectSort(numbers); //선택정렬
		bubbleSort(numbers); //버블정렬
		insertSort(numbers); //삽입정렬
//		System.out.println(Arrays.toString(numbers));
		
		
		
		
	}

	private static void insertSort(int[] numbers) {
		// 앞에 있는 모든 숫자와 비교
		
		/*
		 * 1,0
		 * 2,1  2,0
		 * 3,2  3,1  3,0
		 * 4,3  4,2  4,1  4,0
		 * 5,4  5,3  5,2  5,1  5,0
		 * 
		 */
		
		
		
		
/*		for(int i = 1; i < numbers.length; i++){
			for(int j = 1; j < i; j--){
				int tmp_3 = 0;
				tmp_3 = numbers[j];
				for(int k = 0; k < i -1; k++){
					if(j > k){
						numbers[j] = numbers[k];
						numbers[k] = tmp_3;
					}
				}
			}
		}System.out.println(Arrays.toString(numbers));*/
		
		
		
		
		
		for(int i = 1; i < numbers.length; i++){
			int tmp_3 = numbers[i];
			int j = 0;
			for(j = i - 1; j >= 0; j--){
				if(tmp_3 < numbers[j]){
					numbers[j + 1] = numbers[j];
				}else{
					break; //if문에 break 가 있다는 건 무조건 for 문을 빠져나간다는 것.
				}
			}numbers[j + 1] = tmp_3;
		}System.out.println(Arrays.toString(numbers));
		
		
		
		
		
	}

	private static void bubbleSort(int[] numbers) {
		
		/*
		 * 0,1   1,2  2,3  3,4  4,5  5,6  6,7  7,8  8,9
		 * 0,1   1,2  2,3  3,4  4,5  5,6  6,7  7,8
		 * 0,1   1,2  2,3  3,4  4,5  5,6  6,7
		 * 0,1   1,2  2,3  3,4  4,5  5,6
		 * 0,1   1,2  2,3  3,4  4,5
		 * 0,1   1,2  2,3  3,4
		 * 0,1   1,2  2,3
		 * 0,1   1,2
		 * 0,1
		 */
		
		
		

			for(int i = 0; i < numbers.length - 1; i++){
			boolean changed = false;
			for(int j = 0; j < numbers.length - i - 1; j++){
				if(numbers[j] > numbers[j + 1]){
					int tmp_2 = 0;
					tmp_2 = numbers[j];
					numbers[j] = numbers[j + 1];
					numbers[j + 1] = tmp_2;
					changed = true; //한 번이라도 if문 안으로 들어오면 true로 바뀐다.
					}
				}if(!changed){
					break;
			}
		}System.out.println(Arrays.toString(numbers));
		
		
		
		
		
		
	}

	private static void selectSort(int[] numbers) {
		
		
		/*
		 * 0,1    0,2  0,3  0,4  0,5  0,6  0,7  0,8  0,9
		 * 1,2    1,3  1,4  1,5  1,6  1,7  1,8  1,9   
		 * 2,3    2,4  2,5  2,6  2,7  2,8  2,9
		 */
		
		
		
		for(int i = 0; i < numbers.length - 1; i++){
			for(int j = i + 1; j < numbers.length; j++){
				if(numbers[i] > numbers[j]){
					int tmp = numbers[i];
					numbers[i] = numbers[j];
					numbers[j] = tmp;
				}
			}
		}System.out.println(Arrays.toString(numbers));
		
		
		
		
		
		
	}

	private static void prinkRank(int[] numbers) {		
		// 점수의 갯수만큼 등수를 채울 배열을 선언 및 초기화한다.
		// 등수 배열을 1로 채운다.
		// 모든 점수를 비교할 수 있는 반복문을 만든다.
		// 등수를 구할 점수보다 큰 점수가 있는 경우 등수를 1증가시킨다.
		// 결과를 출력한다.
		
		/*int ran = 1;
		
		for(int i = 0; i < numbers.length; i++){
			for(int j = i; j < numbers.length; j++){
				if(numbers[i] > numbers[j]){
					ran += 0;
				}
				if(numbers[i] > numbers[j]){
					ran += 1;
				}
			}System.out.println(i + "는 " + ran + "등입니다.");
		}
		
		*/
		
		int[] rank = new int[numbers.length];
		for(int i = 0; i < rank.length; i++){
			rank[i] = 1;
		}
		for(int i = 0; i < numbers.length; i++){
			for(int j = 0; j < numbers.length; j++){
				if(numbers[i] < numbers[j]){
					rank[i]++;
				}
			}
		}
		for(int i = 0; i < numbers.length; i++){
			System.out.println(numbers[i] + " : " + rank[i] + "등");
		}
		
		
		
		
		
	}

	private static void shuffle(int[] numbers) {
		
		for(int i = 0; i < numbers.length; i++){
			int random = (int)(Math.random() * numbers.length);
			
			int temp = numbers[0];
			numbers[0] = numbers[random];
			numbers[random] = temp;
					
		}
		
		
		
		
		
		
		
	}

}


























