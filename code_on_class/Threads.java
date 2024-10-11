public class ThreadTest
{
public static void main(String [] args)
{
MyThread t1 = new MyThread(0, 300, 3);
MyThread t2 = new MyThread(1, 300, 3);
MyThread t3 = new MyThread(2, 300, 3);
t1.start();
t2.start();
t3.start();
}
}
public class MyThread extends Thread
{
private int first, last, step;
public MyThread(int s, int n, int m)
{
this.start = s;
this.end = n;
this.step = m;
}
public void run()
{
for(int i = this.first; i < this.last; i+=this.step)
{
System.out.println("[ID " +this.getId() + "] " + i);
Thread.yield();
}
}
}