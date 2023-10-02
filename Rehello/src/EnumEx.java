
public class EnumEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		enum Week{월, 화, 수, 목, 금, 토, 일};
		
		for (Week day: Week.values())
			System.out.println(day + "요일");
		
		System.out.println();
		
		for (Week day: Week.values())
			System.out.println(day + "요일 has value" + day.ordinal());
		
		System.out.println();
		
		Week weekTest1 = Week.목;
		Week weekTest2 = Week.valueOf("토");
		
		System.out.println(weekTest1);
		System.out.println(weekTest2);
		
		System.out.println();
		
		enum WeekEng{
			월("Mon"),
			화("Tue"),
			수("Wed"),
			목("Thu"),
			금("Fri"),
			토("Sat"),
			일("Sun");
			
			final private String engName;
			private WeekEng(String name) {
				this.engName = name;
			}
			
			public String getName() {
				return engName;
			}
		};
		for (WeekEng day: WeekEng.values()) {
			System.out.println(day.getName());
		}
	}

}
