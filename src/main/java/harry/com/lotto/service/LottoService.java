package harry.com.lotto.service;

import org.springframework.stereotype.Service;

@Service
public class LottoService {
    private static int[] win_numbers = {5,7,12,13,18,35};
    public int solution(int[] lottos) {
        int cnt = 0;
        for(int number : lottos) {
            for(int win_number : win_numbers) {
                if(win_number == number) {
                    cnt++;
                    continue;
                }
            }
        }

        return 7 - cnt;
    }
}
