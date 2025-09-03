//벨로그의 예제 코드를 따라쓴 연습용 코드입니다

interface Flyable{
    void fly(int x,int y,int z);
}
class pigeon implements Flyable{
    private int x,y,z;
    @Override
    public void fly(int x,int y,int z){
        printLocation();
        this.x = x;
        this.y = y;
        this.z = z;
        printLocation();
    }
    public void printLocation(){
        System.out.println("현재 위치:("+ x + y + z +")");
    }
}
public class BirdFlyInterface {
    public static void main(String[] args) {
        Flyable pigeon = new pigeon();
        pigeon.fly(1,2,3);
    }
}
