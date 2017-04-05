package acmicpc.bruteForce;

public class sevenDwarf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("일곱난장이");
		int[] tall = {20,7,23,19,10,15,25,8,13};
		
		int total = 0;
		int m100 = 0;
		int seven=0;
		int com1=0;
		int com2=0;
		
		int[] rest = new int[7];
	    
		/*
		 문제
왕비를 피해 일곱 난쟁이들과 함께 평화롭게 생활하고 있던 백설공주에게 위기가 찾아왔다. 일과를 마치고 돌아온 난쟁이가 일곱 명이 아닌 아홉 명이었던 것이다.

아홉 명의 난쟁이는 모두 자신이 "백설 공주와 일곱 난쟁이"의 주인공이라고 주장했다. 

뛰어난 수학적 직관력을 가지고 있던 백설공주는, 다행스럽게도 일곱 난쟁이의 키의 합이 100이 됨을 기억해 냈다.

아홉 난쟁이의 키가 주어졌을 때, 백설공주를 도와 일곱 난쟁이를 찾는 프로그램을 작성하시오.

입력
아홉 개의 줄에 걸쳐 일곱 난쟁이의 키가 주어진다. 주어지는 키는 100을 넘지 않는 자연수이며, 아홉 난쟁이의 키는 모두 다르며, 가능한 정답이 여러가지인 경우에는 아무거나 출력한다.
출력
일곱 난쟁이의 키를 오름차순으로 출력한다. 
		 */
		
		//총합을 구한다.
		for(int i=0;i< tall.length;i++){
			total +=	tall[i];
		}
		//총합에서 100을 뺸다
		m100 = total-100;
		//배열의 수에서 2개를 합한값이 뺀값으로 나오는것을 찾는다. 
		//뺀값 - 배열의수에서 나온 값을 배열에서 해당값을 제외한 나머지에서  찾아서 나온값이 정답
		for(int i=0;i< tall.length;i++){
			seven= m100 - tall[i];			
			if(seven != tall[i]){
				//같지 않으면 배열에서값이 존재 하는지 확인
				for(int j=0;j< tall.length;j++){					
					if(tall[j] == seven){
						if(com1 == 0){
							com1 =seven;
						}else{
							com2 = seven;
						}
						
					}
				}
			}
		}
		
		
		
		int tmp = 0;
		int idx = 0;
		
		for(int i=0;i< tall.length;i++){
			
			if(com1 != tall[i] && com2 != tall[i]){
				rest[idx] = tall[i];
				idx += 1;
				if(idx == 7){
					break;
				}
			}
			
			
		}
		//오름차순 정렬
	//13,8,10,19,23,7,20
		for(int i=0;i< rest.length;i++){
			//System.out.println(i+" : "+rest[i]);
			for(int j = i+1 ;j<rest.length;j++){
				if(rest[i] > rest[j]){
					tmp = rest[i];				
					rest[i] = rest[j];
					rest[j] = tmp;
				}
				
				
			}
			
		}
		
		for(int i=0;i< rest.length;i++){
			System.out.println(rest[i]);
		}
		
	}
}
