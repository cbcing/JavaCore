package com.scujcc.david.mycode;

public class FinalizeEscapeGc {

  public static FinalizeEscapeGc SAVE_HOOK = null;

  public void isAlive() {
    System.out.println("I am still alive !");
  }

  @Override
  protected void finalize() throws Throwable {
    super.finalize();
    System.out.println("finalize() method executed !");
    FinalizeEscapeGc.SAVE_HOOK = this;
  }

  public static void main(String[] args) throws InterruptedException {

    SAVE_HOOK = new FinalizeEscapeGc();

    //对象第一次成功"拯救"自己。
    SAVE_HOOK = null;
    System.gc();
    Thread.sleep(500);
    if (SAVE_HOOK != null) {
      SAVE_HOOK.isAlive();
    } else {
      System.out.println("I am dead !");
    }

    //对象第二拯救自己失败，因为finalize()方法只能被jvm调用一次。
    SAVE_HOOK = null;
    System.gc();
    Thread.sleep(500);
    if (SAVE_HOOK != null) {
      SAVE_HOOK.isAlive();
    } else {
      System.out.println("I am dead !");
    }
  }

}
