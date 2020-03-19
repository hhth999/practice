package project01;

public class DbTest {

	public static void main(String[] args) {
		String workoutname = "데드리프트,벤치프레스,스쿼트";
		int now1rm = 30;
		int workroutine = 1;
		String reps = "10,5,3,5,5-10,5,3,5,5-10,5,3,5,5";
		String weight = "1,2,3,4,5-6,7,8,9,10-11,12,13,14,15";
		
		
		String wnsplit[] = workoutname.split(",");
		String repsplit[] = reps.split("-");
		String wtsplit[] = weight.split("-");
		
		
		
		
		for(int i=0; i<wnsplit.length; i++) {
//			System.out.println(wnsplit[i] + " ");
		
			
		}
		for(int j=0; j<repsplit.length; j++) {
			String repsplit2[] = repsplit[j].split(",");
			for(int b=0; b<repsplit2.length; b++) {
				System.out.println(repsplit2[b]);
			}
		}
		for(int y=0; y<wtsplit.length; y++) {
			String wtsplit2[] = wtsplit[y].split(",");
			for(int a=0; a<wtsplit2.length; a++) {
				System.out.println(wtsplit2[a]);
			}
		}
//		System.out.print(now1rm);
		
		
		
	}

}
