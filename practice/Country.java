package practice;

public enum Country {
    KOREA{
        @Override
        public void print() {
            System.out.println("대한민국");
        }
    },
    JAPAN{
        @Override
        public void print() {
            System.out.println("일본");
        }
    };

    public abstract void print();
}
