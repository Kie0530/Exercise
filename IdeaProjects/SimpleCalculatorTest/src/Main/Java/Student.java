package Main.Java;

public interface Student {
    String getHomeWork();
}

class StudentA implements Student {
    public String getHomeWork() {
        return "two pages of essay";
    }
}
class StudentB implements Student {
    public String getHomeWork() {
        return "ten math questions";
    }
}

