package item1;

public class Factory {
    //복잡한 생성자를 대체 하는 static factory method (boxed class of boolean)

    //장점
    //1. 이름을 가질 수 있다.
    //2. 호출될 때마다 인스턴스를 새로 생성하지 않아도 된다. (instance-controlled)
    //3. 반환 타입의 하위 타입의 객체를 반환할 수 있는 능력이 있다.
    //4. 입력 매ㅐ변수에 따라 매번 다른 클래스의 객체를 반환할 수 있다.
    //5. 정적 팩토리 메서드를 작성하는 시점에는 반환할 객체의 클래스가 존재하지 않아도 된다. (service provider framework : JDBC)

    //단점
    //1. 상속을 하려면 public, protected 생성자가 필요하니 정적 팩터리 메서드만 제공하면 하위 클래스를 만들 수 없다.
    //2. 정적 팩터리 메서드는 프로그래머가 찾기 어렵다.

    //명명방식
    //from : 하나의 매개변수
    //of : 여러 매개변수
    //valueOf : from, of의 더 자세한버전
    //instance, getInstance : 매개변수로 명시한 인스턴스를 반환
    //create, newInstance : 매번 새로운 인스턴스 반환
    //getType : FileStore fs = Files.getFileStore(path)
    //newType : BufferedReader br = Files.newBufferedReader(path)
    //type : List<Complaint> litany = Collections.list(legacyLitany)

    public static Boolean valueOf(boolean b) {
        return b ? Boolean.TRUE : Boolean.FALSE;
    }

}
