package Week2;

public class Task9 {
    public static interface Universe{
        public abstract void doAnything();
    }
    public static class Star{
       public void shine(){
           System.out.println("星星一闪一闪亮晶晶");
       }
    }
    public static class Sun extends Star implements Universe{
        public void doAnything(){
            System.out.println("太阳吸引着9大行星旋转");
        }
        public void shine(){
            System.out.println("光照八分钟，到达地球");
        }
    }

    public static void main(String[] args) {
        Star star= new Star();
        Universe universe=new Sun();
        star.shine();
        System.out.println("=================");
        universe.doAnything();
        Sun sun=(Sun) universe;
        sun.shine();
    }
}
