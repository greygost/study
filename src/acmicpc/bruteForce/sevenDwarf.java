package acmicpc.bruteForce;

public class sevenDwarf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("�ϰ�������");
		int[] tall = {20,7,23,19,10,15,25,8,13};
		
		int total = 0;
		int m100 = 0;
		int seven=0;
		int com1=0;
		int com2=0;
		
		int[] rest = new int[7];
	    
		/*
		 ����
�պ� ���� �ϰ� �����̵�� �Բ� ��ȭ�Ӱ� ��Ȱ�ϰ� �ִ� �鼳���ֿ��� ���Ⱑ ã�ƿԴ�. �ϰ��� ��ġ�� ���ƿ� �����̰� �ϰ� ���� �ƴ� ��ȩ ���̾��� ���̴�.

��ȩ ���� �����̴� ��� �ڽ��� "�鼳 ���ֿ� �ϰ� ������"�� ���ΰ��̶�� �����ߴ�. 

�پ ������ �������� ������ �ִ� �鼳���ִ�, ���ེ���Ե� �ϰ� �������� Ű�� ���� 100�� ���� ����� �´�.

��ȩ �������� Ű�� �־����� ��, �鼳���ָ� ���� �ϰ� �����̸� ã�� ���α׷��� �ۼ��Ͻÿ�.

�Է�
��ȩ ���� �ٿ� ���� �ϰ� �������� Ű�� �־�����. �־����� Ű�� 100�� ���� �ʴ� �ڿ����̸�, ��ȩ �������� Ű�� ��� �ٸ���, ������ ������ ���������� ��쿡�� �ƹ��ų� ����Ѵ�.
���
�ϰ� �������� Ű�� ������������ ����Ѵ�. 
		 */
		
		//������ ���Ѵ�.
		for(int i=0;i< tall.length;i++){
			total +=	tall[i];
		}
		//���տ��� 100�� �A��
		m100 = total-100;
		//�迭�� ������ 2���� ���Ѱ��� �������� �����°��� ã�´�. 
		//���� - �迭�Ǽ����� ���� ���� �迭���� �ش簪�� ������ ����������  ã�Ƽ� ���°��� ����
		for(int i=0;i< tall.length;i++){
			seven= m100 - tall[i];			
			if(seven != tall[i]){
				//���� ������ �迭�������� ���� �ϴ��� Ȯ��
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
		//�������� ����
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
