package i_collection;

import java.util.ArrayList;

public class ArrayListClass {

	public static void main(String[] args) {
		
		/* << ArrayList 메서드 >>
		 * add()	: 마지막 위치에 객체를 추가 //0번 인덱스에서부터 저장
		 * get()	: 지정된 위치의 객체를 반환
		 * set()	: 지정된 위치에 주어진 객체를 저장(수정) //(인덱스 번호, 저장할 객체)
		 * remove()	: 지정된 위치의 객체를 제거 //삭제를 하면 뒤 인덱스가 앞으로 당겨진다.
		 * size()	: 저장된 객체의 수 반환
		 */	
		
		ArrayList<Object> list = new ArrayList<Object>();
		//Object이기 때문에 모든 클래스를 저장할 수 있음.
		
		list.add(10);
		list.add("abc");
		list.add(true);
		list.add(new ArrayListClass());
		//그런데 나중에 봤을 때 무슨 값이 들어있는지 모르므로 한 타입으로 지정해주는 것이 좋다.

		
		ArrayList<String> list2 = new ArrayList<String>();
		
		list2.add("abc");
		list2.add("123");
		list2.add("가나다");
		list2.set(1, "456");
		
		for(int i = 0; i < list2.size(); i++){
			System.out.println(list2.get(i));
		}System.out.println("-----------------------");
		
		list.remove(0);
		//리스트에 저장된 값을 삭제하면 그 뒤의 모든 값의 인덱스가 당겨진다.
		
		System.out.println(list2.get(0));
		System.out.println(list2.get(1));

		
		
		ArrayList<ArrayList<Integer>> list3 = new ArrayList<ArrayList<Integer>>(); //2차원 배열
		//Integer를 저장하는 ArrayList를 만들어줘야 한다.
		
		ArrayList<Integer> list4 = new ArrayList<Integer>(); //Integer를 저장할 수 있다.
		
		list4.add(10);
		list4.add(20);
		list4.add(30);
		list3.add(list4);
		
		list4 = new ArrayList<Integer>(); //배열을 하나 더 만들어준다.
		list4.add(20);
		list4.add(40);
		list4.add(60);
		list4.add(80);
		
		list3.add(list4);
		
		System.out.println(list);
		System.out.println(list2);
		System.out.println(list3);
		System.out.println(list4);
		System.out.println("-----------------------");
		
		
		
		
		
		//★ 정수를 저장할 수 있는 ArrayList를 생성해 값을 5번 넣어주세요.
		
		ArrayList<Integer> arrList = new ArrayList<Integer>();
		
		arrList.add(10);
		arrList.add(20);
		arrList.add(33);
		arrList.add(40);
		arrList.add(50);
		
		
		//★ 위에서 만든 ArrayList에 단긴 값들의 합계와 평균을 출력해주세요.
		
		int sum = 0;
		double avg = 0;
		
		for(int i = 0; i < arrList.size(); i++){
			sum += arrList.get(i);
		}avg = (double) sum / arrList.size();
		System.out.println("합계: " + sum + " / 평균: " + avg);
		
		
		
		//★ 위에서 만든 ArrayList에 담긴 값들 중 최소값과 최대값을 구해주세요.
		
		int min = arrList.get(0);
		int max = arrList.get(0);
		
		for(int i = 0; i < arrList.size(); i++){
				if(min > arrList.get(i)){
					min = arrList.get(i);
				}
				if(max < arrList.get(i)){
					max = arrList.get(i);
				}
		}System.out.println("최소값: " + min + " / 최대값: " + max);
		                                                                                                                                                                                                                                                                                                                                                                                                                                                                            
		
		
	}

}



















