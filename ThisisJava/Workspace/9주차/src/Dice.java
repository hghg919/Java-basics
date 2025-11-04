public class Dice {
    private int value;   // 주사위 값
    
    // 생성자: 초기값 0
    public Dice() {
        value = 0;
    }

    // 주사위 굴리기 (1~6 난수)
    public void roll() {
        value = (int)(Math.random()* 6) + 1;
    }

    // 현재 값 반환
    public int getValue() {
        return value;
    }
    
    // 주사위 값 강제로 지정
    public void setValue(int value) {
        this.value = value;
    }

    public static void main(String[] args) {
        Dice dice1 = new Dice();
        Dice dice2 = new Dice();
        int rollCount = 0;

        // 두 주사위를 굴려서 (1,1)이 나올 때까지 반복
        do {
            dice1.roll();
            dice2.roll();
            System.out.println("주사위1 = " + dice1.getValue()
                + ", 주사위2 = " + dice2.getValue());
            rollCount++;
        } while ( (dice1.getValue() + dice2.getValue()) != 2);

        System.out.println("(1, 1)이 나올 때까지의 시행 횟수 = " + rollCount);
    }
}
