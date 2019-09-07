class Foo {
    private volatile boolean firstEx = false, secondEx = false;
    public Foo() {}

    public void first(Runnable printFirst) throws InterruptedException {
        // printFirst.run() outputs "first". Do not change or remove this line.
        printFirst.run();
        firstEx = true;
    }

    public void second(Runnable printSecond) throws InterruptedException {
        while (!firstEx);
        // printSecond.run() outputs "second". Do not change or remove this line.
        printSecond.run();
        secondEx = true;
    }

    public void third(Runnable printThird) throws InterruptedException {
        while (!secondEx);
        // printThird.run() outputs "third". Do not change or remove this line.
        printThird.run();
    }
}