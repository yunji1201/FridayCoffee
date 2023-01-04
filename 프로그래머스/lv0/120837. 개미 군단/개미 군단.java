enum AntLevel {
    KING(5), QUEEN(3), JACK(1);
    final int hp;

    AntLevel(int hp) {
        this.hp = hp;
    }
}
class Solution {
    public int solution(int hp) {
        int k = hp / AntLevel.KING.hp;
        int q = (hp % AntLevel.KING.hp) / AntLevel.QUEEN.hp;
        int j = q == 1 ? (hp-k*AntLevel.KING.hp-q*AntLevel.QUEEN.hp) / AntLevel.JACK.hp : ((hp % AntLevel.KING.hp) % AntLevel.QUEEN.hp) / AntLevel.JACK.hp;
        return k + q + j;
    }
}