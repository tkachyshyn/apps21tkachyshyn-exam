import java.util.List;

public class Task2 {
    public static void main(String[] args) {
        List<String> InpList = List.of("name,", "code,", "alfa, ", "abreviation, .", "year, .", "dPoliticalCompatibility, .",
                "RankPoliticalCompatibility,.", "dEconomicCompatibility,.", "dRankEconomicCompatibility,.");
        String[] output = {"name,", "code,", "alfa, ", "abreviation, .", "year, .", "dPoliticalCompatibility, .",
                "RankPoliticalCompatibility,.", "dEconomicCompatibility,.", "dRankEconomicCompatibility,."};
        String cName;
        String cCode;
        String cAlpha2;
        String cAbreviation;
        String dYear;
        String dPoliticalCompatibility;
        String dRankPoliticalCompatibility;
        String dEconomicCompatibility;
        String dRankEconomicCompatibility;
        for(int i = 0; i < InpList.size(); i++){
            output[i] = InpList.get(i).replace(",", ".");
        }

        cName = output[0];
        cCode = output[1];
        cAlpha2 = output[2];
        cAbreviation = output[3];
        dYear = output[4];
        dPoliticalCompatibility = output[5];
        dRankPoliticalCompatibility = output[6];
        dEconomicCompatibility = output[7];
        dRankEconomicCompatibility = output[8];
        System.out.println("" +cName + "\n" +  cCode + "\n");
    }
}
