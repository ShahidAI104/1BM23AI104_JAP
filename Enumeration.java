public class Enumeration {
    public enum DayOfWeek{
        SUNDAY,
        MONDAY,
        TUESDAY,
        WEDNESDAY,
        THURSDAY,
        FRIDAY,
        SATURDAY;

        public boolean isWorkday(){
            return (this != SATURDAY && this != SUNDAY);
        }
    }

    public static void main(String[]args){
        System.out.println("Is Monday a workday? " +DayOfWeek.MONDAY.isWorkday());
        System.out.println("Is Tuesday a workday? "+DayOfWeek.TUESDAY.isWorkday());
        System.out.println("Is Wednesday a workday? "+DayOfWeek.WEDNESDAY.isWorkday());
        System.out.println("Is Thursday a workday? "+DayOfWeek.THURSDAY.isWorkday());
        System.out.println("Is Friday a workday? "+DayOfWeek.FRIDAY.isWorkday());
        System.out.println("Is Saturday a workday? "+DayOfWeek.SATURDAY.isWorkday());
        System.out.println("Is Sunday a workday? "+DayOfWeek.SUNDAY.isWorkday());
    }
}
