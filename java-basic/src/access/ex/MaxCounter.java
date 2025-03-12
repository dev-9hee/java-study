package access.ex;

// 최대값을 지정하고 최대값까지만 값이 증가하는 기능을 제공
public class MaxCounter {
    private int count = 0;
    private int max;

    public MaxCounter(int max) {
        this.max = max;
    }

    /**
     * 숫자 증가
     */
    public void increment() {
        if (max > count) {
            count++;
        } else {
            System.out.println("최댓값을 초과할 수 없습니다.");
        }
    }

    /**
     * 지금까지 증가한 값을 반환
     */
    public int getCount() {
        return count;
    }
}
