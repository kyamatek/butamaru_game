package game;

/**
 * Hello world!
 *
 */
public class Main
{
    public static void main( String[] args )
    {
        //ブタ生成
        String pigMountainName = "moumou";
        int hitPointM = 10;
        int attackM = 10;
        int defenseM = 10;
        int speedM = 10;

        String pigRiverName = "イベリコ豚";
        int hitPointR = 10;
        int attackR = 10;
        int defenseR = 10;
        int speedR = 10;

        Pig pigMountain = new Pig(pigMountainName,hitPointM,attackM,defenseM,speedM);
        Pig pigRiver = new Pig(pigRiverName,hitPointR,attackR,defenseR,speedR+1);

        //戦闘
        while(pigRiver.hitPoint > 0 && pigMountain.hitPoint > 0){
          if(pigRiver.speed>pigMountain.speed){
            pigRiver.attack(pigMountain);
            if(pigMountain.hitPoint>0){
              pigMountain.attack(pigRiver);
            }
          }
          else{
            pigMountain.attack(pigRiver);
            if(pigRiver.hitPoint>0){
              pigRiver.attack(pigMountain);
            }
          }
        }

        //勝者判定＆ゲーム終了
        if(pigRiver.hitPoint<=0){
          System.out.println("やまぶたの勝利");
        }
        else{
          System.out.println( "イベリコ豚の勝利！");
        }
    }
}
