package day03;

/**
 * 1、一起来参加屌丝程序员大赛吧，有3个班级各3名学员参赛，
 * 记录每个学员的成绩，并计算每个班的平均分。
 */
public class Example06 {
    public static void main(String[] args) {
        int[][] c = {{22,77,99 , 1,2},{33,66,33},{55,65,76}};
        for(int i = 0 ; i < c.length ; i++){
            int totalScore = 0;
            for(int j = 0 ; j < c[i].length ; j++){
                totalScore += c[i][j];
            }
            System.out.println("第"+(i+1) + "班级的平均成绩为:" + (totalScore * 1.0 / c[i].length));
        }
    }
}
