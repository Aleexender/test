package tekken;

import animals.Carp;

public class GameMain { // 캐릭터 더 넣고, 스킬
   public static void main(String[] args) {
        Character[] characters = {new Jin(), new King()};
        Character player1 = characters[0];
        Character player2 = new Noctis();


       while (true) {
           player2.hit(player1); // mp 떨어지면 한번 공격 쉬게
           if (player2.gauge % 2 == 0) {
               player2.special(player1);
           }
           if (player1.hp <= 0) {
               break;
           }
           if (player2.hp <= 10) {
               player2.lastChance(player2);
           }
           if (player1.hp <= 0) {
               break;
           }
           if (player1.hit(player2)) {
               player2.defence(player1);
           }
           if (player1.hp <= 0) {
               break;
           }
           if (player2.hit(player1)) {
               player1.defence(player2);
           }
           player1.hit(player2);
           if (player1.gauge % 2 == 0) {
               player1.special(player2);
           }
           if (player2.hp <= 0) {
               break;
           }

           player1 = player1.tag(characters);// 캐릭터 바꾸게 할수있게 할수 없나?
            // 그림그려보기 ****
       }
//        while (true){
//                character1.hit(player1);
//                if(player1.hp <= 0){
//                    break;
//                }
//                player1.hit(character1);
//                if(character1.hp <= 0){
//                    break;
//                }
//        }

        Character winner = player1.hp <= 0 ? player2 : player1;
        System.out.println(winner);


    }
}
