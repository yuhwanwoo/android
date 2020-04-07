package exam.day03.view.selectview.view.adapter;

public class ActorItem {
    int myImg;
    String name;
    String date;
    String com;
    Boolean chk;

    public ActorItem(int myImg, String name, String date, String com,Boolean chk) {
        this.myImg = myImg;
        this.name = name;
        this.date = date;
        this.com = com;
        this.chk=chk;
    }

    @Override
    public String toString() {
        return "ActorItem{" +
                "myImg=" + myImg +
                ", name='" + name + '\'' +
                ", date='" + date + '\'' +
                ", com='" + com + '\'' +
                ", chk=" + chk +
                '}';
    }
}
