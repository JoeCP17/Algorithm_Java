package Chapter3;

class Id {

    private static int counter = 0;
    private int id;

    //생성자

    public Id() {
        id = ++counter;
    }

    //아이디 반환
    public int getId() {
        return id;
    }

    public static int getCounter() {
        return counter;
    }
}


