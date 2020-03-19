package project01;

public class SplitPractice {

	public static void main(String[] args) {
//		int arr[] = {1,3,5}; 
//		int asdasd = 0;
//		int week = 0;
//		
//		for(int i=0; i<arr.length; i++) {
//			for(int j=0; j<8; j++) {
//				week++;
//				if(week == 8) {
//					week= 0;
//				}
//				if(arr[i] == week ) {
//					System.out.println("asd");
//				}
//			}
//		}
		//운동요일
//		
//		for(int b=0; b<workarr.length; b++) {
//			if(workmax < workarr[b]) {
//				workmax = workarr[b];
//			}
//		}
//		System.out.println("workmax : " + workmax);
//		for(int i=0;i<array.length;i++) {
//		    if(max<array[i]) {
//			//max의 값보다 array[i]이 크면 max = array[i]
//			max = array[i];
//		    }

		int arr[] = { 1, 3, 5,7 };
		int arrlength = arr.length;
		int today1 = 0;
		//워크아웃 분류(분할)
		int workarr[] = {1,2};
		int workmax = 0;
		
		for (int i = 0; i < 31; i++) {
			today1++;
			if (today1 == 8) {
				today1 = 0;
			}
			for (int j = 0; j < arrlength; j++) {
				if(arr[j] == today1) {
					System.out.println(i);
					workmax++;
					if(workmax>=workarr.length) {
						workmax = 0;
					}
					System.out.println("workout" + workarr[workmax]);
				}
				
			}
		}

	}

}
