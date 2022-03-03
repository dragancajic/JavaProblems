import java.util.Scanner;

class DifferenceOfTimes {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		// put your code here
		int earlierMomentHours = scanner.nextInt();
		int earlierMomentMinutes = scanner.nextInt();
		int earlierMomentSeconds = scanner.nextInt();
		
		int laterMomentHours = scanner.nextInt();
		int laterMomentMinutes = scanner.nextInt();
		int laterMomentSeconds = scanner.nextInt();
		
		int differenceInHours = -1; // for timing check!
		int differenceInMinutes = 0;
		int differenceInSeconds = 0;
		
		int differenceOfTimesInSeconds = 0;
		
		// TODO: implement correct data validation!
		// TODO: 2:17 PM June 18, 2021 by Драган Ћајић
		if (laterMomentSeconds < earlierMomentSeconds) {
			if (laterMomentMinutes > 0) {
				differenceInSeconds = laterMomentSeconds + 60 - earlierMomentSeconds;
				laterMomentMinutes--;
			} else {
				if (laterMomentHours > 0) {
					laterMomentHours--;
					laterMomentMinutes += 60;
					
					differenceInSeconds = laterMomentSeconds + 60 - earlierMomentSeconds;
					laterMomentMinutes--;
				}
			}
			
		} else {
			differenceInSeconds = laterMomentSeconds - earlierMomentSeconds;
		}
		
		// test 1
		System.out.println("sec diff: " + differenceInSeconds);
		
		if (laterMomentMinutes < earlierMomentMinutes) {
			if (laterMomentHours > 0) {
				differenceInMinutes = laterMomentMinutes + 60 - earlierMomentMinutes;
				laterMomentHours--;
			} else {
				System.out.println("No available PARTY hours! :-))");
			}
		} else {
			differenceInMinutes = laterMomentMinutes - earlierMomentMinutes;
		}
		
		// test 2
		System.out.println("min diff: " + differenceInMinutes);
		
		if (laterMomentHours < earlierMomentHours) {
			System.out.println("Sorry! Can't calculate difference! ;-(");
		} else {
			differenceInHours = laterMomentHours - earlierMomentHours;
		}
		
		// test 3
		System.out.println("hrs diff: " + differenceInHours);
		
		differenceOfTimesInSeconds = differenceInHours * 60 * 60 +
				differenceInMinutes * 60 + differenceInSeconds;
		
		if (differenceInHours < 0) {
			System.out.println("Earlier time must be EARLIER! ;-)");
		} else {
			//System.out.println("secs: " + differenceOfTimesInSeconds);
			System.out.println(differenceOfTimesInSeconds);
		}
	}
}
