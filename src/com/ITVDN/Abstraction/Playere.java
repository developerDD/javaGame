package com.ITVDN.Abstraction;


 abstract class GG{
     public String  h ="Abstract class";
    abstract void show();

     public String getH() {
         return h;
     }
 }

 public class Playere extends GG implements IPlayable, IRecordable {
     @Override
   public void play() {
       System.out.println("Проигрываю");
   }

   @Override
   public void record() {
       System.out.println("Записываю");
   }

   @Override
   public void pause() {
       System.out.println("Пауза");
   }

   @Override
   public void stop() {
       System.out.println("Стоп");
   }

    @Override
    public void del() {

    }
    @Override
   void show() {
        System.out.println(getH());
   }
}

 class APIPayer{
     public static void main(String[] args) {
         Playere playere = new Playere();

     }
 }
