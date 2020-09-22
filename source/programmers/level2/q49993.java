package programmers.level2;

/**
 * https://programmers.co.kr/learn/courses/30/lessons/49993
 * Title: 스킬트리
 * Date: 2020-09-23
 */
public class q49993 {
    public int solution(String skill, String[] skillTrees) {
        int cnt = skillTrees.length;

        for (String skillTree : skillTrees) {
            int beforeSkill = skillTree.indexOf(skill.charAt(0));
            for (int i = 1; i < skill.length(); i++) {
                int currentSkill = skillTree.indexOf(skill.charAt(i));

                // 선행스킬을 안배웠는데 타겟 스킬을 배운 경우 || 선행스킬이 더 뒤에 위치하는 경우
                if ((currentSkill != -1 && beforeSkill > currentSkill)
                        || (beforeSkill == -1 && currentSkill != -1)) {
                    cnt--;
                    break;
                }
                beforeSkill = currentSkill;
            }
        }
        return cnt;
    }

    public static void main(String[] args) {
        q49993 q = new q49993();
        int result = q.solution("CBD", new String[]{"BACDE", "CBADF", "AECB", "BDA"});
        System.out.println("result : " + result);
    }

}
